package com.example.rentcar;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import org.controlsfx.glyphfont.INamedCharacter;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.logging.Logger;

public class ManagerTableController implements Initializable {
    Parent root;
    Stage stage;
    Scene scene;

    @FXML
    private Button add;

    @FXML
    private TableView<Clients> clientsM;

    @FXML
    private TableColumn<Clients, String> col_cin;

    @FXML
    private TableColumn<Clients, String> col_email;

    @FXML
    private TableColumn<Clients, String> col_id;

    @FXML
    private TableColumn<Clients, String> col_nom;

    @FXML
    private TableColumn<Clients, String> col_prenom;

    @FXML
    private TableColumn<Clients, String> col_tel;

    @FXML
    private TableColumn<Clients, String> col_voiture;



    @FXML
    private Button delete;

    @FXML
    private Button home;

    @FXML
    private Button logout;

    @FXML
    private Button table;

    @FXML
    private TextField tf_cin;

    @FXML
    private TextField tf_email;

    @FXML
    private TextField tf_id;

    @FXML
    private TextField tf_nom;

    @FXML
    private TextField tf_prenom;

    @FXML
    private TextField tf_tel;

    @FXML
    private TextField tf_voiture;


    @FXML
    private Button update;

    @FXML
    void delete(ActionEvent event) {
        ObservableList<Clients> allClients,SingleClient;
        allClients = clientsM.getItems();
        SingleClient = clientsM.getSelectionModel().getSelectedItems();
        SingleClient.forEach(allClients::remove);

    }

    @FXML
    void home(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("ManagerMain.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();}

    @FXML
    void logout(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("ManagerLogin.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();}


    @FXML
    void table(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("ManagerTable.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();}
    @FXML
    void update(ActionEvent event) {

    }




    @Override
    public void initialize(URL location, ResourceBundle resources) {
        /*try {
            Connection con = DatabaseConnection.getConnection();
            ResultSet rs = con.createStatement().executeQuery("select* fron manager");

        } catch (SQLException e) {
            e.printStackTrace();
        }*/
        col_id.setCellValueFactory(new PropertyValueFactory<Clients,String>("Id"));
        col_prenom.setCellValueFactory(new PropertyValueFactory<Clients,String>("Prenom"));
        col_nom.setCellValueFactory(new PropertyValueFactory<Clients,String>("Nom"));
        col_cin.setCellValueFactory(new PropertyValueFactory<Clients,String>("Cin"));
        col_voiture.setCellValueFactory(new PropertyValueFactory<Clients,String>("Voiture"));
        col_email.setCellValueFactory(new PropertyValueFactory<Clients,String>("Email"));
        col_tel.setCellValueFactory(new PropertyValueFactory<Clients,String>("Tel"));
        clientsM.setItems(clientObservableList);
    }
    ObservableList<Clients> clientObservableList = FXCollections.observableArrayList(
            new Clients(1,"maryam","boufous","n9999","cleo","mery@j.c",67843558),
            new Clients(2,"XAVIE","sady","l9877","kia","mxavry@j.c",65217893),
            new Clients(3,"ahlam","bizbiz","l8877","dacia","ufysry@j.c",652376532),
            new Clients(4,"aya","amal","df9377","4x4","ayay@j.c",93876284),
            new Clients(5,"chaima","ganbur","sd8777","kia","chaimay@j.c",237638773)
    );






    @FXML
    void add(ActionEvent event) {

        Clients clients = new Clients(Integer.parseInt(tf_id.getText()),tf_prenom.getText(),tf_nom.getText(),tf_cin.getText(),tf_voiture.getText(),tf_email.getText(),Integer.parseInt(tf_tel.getText()));
        clientsM.getItems().add(clients);

    }



}
