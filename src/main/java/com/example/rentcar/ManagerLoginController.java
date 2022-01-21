package com.example.rentcar;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ManagerLoginController {
    Parent root;
    Stage stage;
    Scene scene;

    @FXML
    private Button AdminLogin;

    @FXML
    private Button MainManager;

    @FXML
    private TextField tf_email;

    @FXML
    private PasswordField tf_password;
    @FXML
    private Label verifyLabel;


    @FXML
    void MainManager(ActionEvent event) throws IOException, SQLException {

        if(tf_email.getText().isBlank() == false && tf_password.getText().isBlank()==false){
            validateLogin(event);
        }else {
            verifyLabel.setText("Please Enter Email and Password.");

        }
    }


    @FXML
    void AdminLogin(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("AdminLogin.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }



    public void validateLogin(ActionEvent event) throws SQLException {
        DatabaseConnection connectNow = new DatabaseConnection();
        Connection connectDB = connectNow.getConnection();

        String verifyLogin = "select count(1) from manager where Manager_Email = '"+tf_email.getText()+"' and  Manager_Password ='"+tf_password.getText()+"'";

        try{
            Statement statement = connectDB.createStatement();
            ResultSet queryResult = statement.executeQuery(verifyLogin);

            while (queryResult.next()){
                if(queryResult.getInt(1)==1){
                    MainManager.getScene().getWindow().hide();
                    Parent root = FXMLLoader.load(getClass().getResource("ManagerMain.fxml"));
                    Stage mainStage = new Stage();
                    Scene scene = new Scene(root);
                    mainStage.setScene(scene);
                    mainStage.show();


                }else{
                    verifyLabel.setText("try again....");
                    Alert alert = new Alert (Alert.AlertType.ERROR);
                    alert.setContentText("Provided Credentials Are Incorrect");
                    alert.show();
                }
            }
        }catch (Exception e){
            e.printStackTrace();

        }

    }



}
