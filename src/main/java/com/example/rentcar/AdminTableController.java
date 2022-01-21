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

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class AdminTableController implements Initializable {
    Parent root;
    Stage stage;
    Scene scene;

    @FXML
    private Button add;

    @FXML
    private TableColumn<Voiture,String> col_categ;

    @FXML
    private TableColumn<Voiture,String>col_code;

    @FXML
    private TableColumn<Voiture,String> col_dispo;

    @FXML
    private TableColumn<Voiture,String> col_imma;

    @FXML
    private TableColumn<Voiture,Integer> col_place;

    @FXML
    private TableColumn<Voiture,Integer> col_porte;

    @FXML
    private TableColumn<Voiture,String> col_trans;

    @FXML
    private TableColumn<Voiture,String> col_type;

    @FXML
    private TableColumn<Voiture,Integer> col_voiture;

    @FXML
    private Button delete;

    @FXML
    private Button home;

    @FXML
    private Button logout;

    @FXML
    private TableView<Voiture> table;

    @FXML
    private Button update;
    @FXML
    private TextField tf_categ;

    @FXML
    private TextField tf_code;

    @FXML
    private TextField tf_dispo;


    @FXML
    private TextField tf_id;

    @FXML
    private TextField tf_place;

    @FXML
    private TextField tf_porte;

    @FXML
    private TextField tf_trans;
    @FXML
    private TextField tf_type;

    @FXML
    private TextField tf_imma;
    //////


    @FXML
    void add(ActionEvent event) {

        Voiture voiture = new Voiture(Integer.parseInt(tf_id.getText()),tf_type.getText(),tf_code.getText(),tf_trans.getText(),tf_categ.getText(),Integer.parseInt(tf_place.getText()),Integer.parseInt(tf_porte.getText()),tf_dispo.getText(),tf_imma.getText());
        table.getItems().add(voiture);

    }

    @FXML
    void delete(ActionEvent event) {
        ObservableList<Voiture> allVoiture,SingleVoiture;
        allVoiture = table.getItems();
        SingleVoiture =table.getSelectionModel().getSelectedItems();
        SingleVoiture.forEach(allVoiture::remove);

    }

    @FXML
    void home(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("AdminMain.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();}


    @FXML
    void logout(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("AdminLogin.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();}


    @FXML
    void update(ActionEvent event) {

    }

    public void tablebord(ActionEvent event)throws IOException {
            root = FXMLLoader.load(getClass().getResource("AdminTable.fxml"));
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();}

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        col_voiture.setCellValueFactory(new PropertyValueFactory<>("Id"));
        col_imma.setCellValueFactory(new PropertyValueFactory<>("Imma"));
        col_code.setCellValueFactory(new PropertyValueFactory<>("Code"));
        col_categ.setCellValueFactory(new PropertyValueFactory<>(""));
        col_dispo.setCellValueFactory(new PropertyValueFactory<>("Dispo"));
        col_place.setCellValueFactory(new PropertyValueFactory<>("Place"));
        col_porte.setCellValueFactory(new PropertyValueFactory<>("Porte"));
        col_type.setCellValueFactory(new PropertyValueFactory<>("Type"));
        col_trans.setCellValueFactory(new PropertyValueFactory<>("Trans"));
        table.setItems(voitureObservableList);

    }
    ObservableList<Voiture> voitureObservableList = FXCollections.observableArrayList(
      new Voiture(1,"carburant","MNJF","Auto","Famille",6,4,"oui","MDJ0976S6"),
            new Voiture(1,"gaz","DHJ3","Auto","Famille",6,4,"non","JKDYE77424")

    );
}

