package com.example.rentcar;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.StackedBarChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class AdminMainController {
    Parent root;
    Stage stage;
    Scene scene;


    @FXML
    private StackedBarChart<String,Number> barchartAdmin;

    @FXML
    private Button home;

    @FXML
    private Button load;

    @FXML
    private Button logout;

    @FXML
    private NumberAxis naVisits;

    @FXML
    private CategoryAxis nacars;

    @FXML
    private Button table;



    @FXML
    void home(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("AdminMain.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();}

    @FXML
    void load(ActionEvent event) {
        barchartAdmin.getData().clear();

        XYChart.Series<String,Number>series = new XYChart.Series<String,Number>();

        series.getData().add(new XYChart.Data<String,Number>("Kia",65));
        series.getData().add(new XYChart.Data<String,Number>("Dacia",6));
        series.getData().add(new XYChart.Data<String,Number>("4X4",50));
        series.getData().add(new XYChart.Data<String,Number>("Citadine",12));
        series.getData().add(new XYChart.Data<String,Number>("Limu",87));
        series.getData().add(new XYChart.Data<String,Number>("Mini Bus",65));
        series.getData().add(new XYChart.Data<String,Number>("Cleo",34));
        series.getData().add(new XYChart.Data<String,Number>("Jaguar",90));
        series.getData().add(new XYChart.Data<String,Number>("R4",120));
        series.getData().add(new XYChart.Data<String,Number>("jiu9",11));
        series.getData().add(new XYChart.Data<String,Number>("TRfT4",101));
        series.getData().add(new XYChart.Data<String,Number>("ytr6",76));
        series.getData().add(new XYChart.Data<String,Number>("453es",150));


        barchartAdmin.getData().add(series);

    }

    @FXML
    void logout(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("AdminLogin.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();}

    @FXML
    void table(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("AdminTable.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();}

}


