package com.example.rentcar;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
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

public class ManagerMainController {
    Parent root;
    Stage stage;
    Scene scene;

    @FXML
    private StackedBarChart<String, Number> barchartManager;

    @FXML
    private Button home;

    @FXML
    private Button load;

    @FXML
    private Button logout;

    @FXML
    private Button table;

    @FXML
    private NumberAxis naVisits;

    @FXML
    private CategoryAxis nacars;

    @FXML
    void home(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("ManagerMain.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();}

    @FXML
    void load(ActionEvent event) {
        barchartManager.getData().clear();

        XYChart.Series<String,Number>series = new XYChart.Series<String,Number>();

        series.getData().add(new XYChart.Data<String,Number>("Jan",65));
        series.getData().add(new XYChart.Data<String,Number>("Fab",6));
        series.getData().add(new XYChart.Data<String,Number>("Mar",5));
        series.getData().add(new XYChart.Data<String,Number>("Apr",12));
        series.getData().add(new XYChart.Data<String,Number>("May",87));
        series.getData().add(new XYChart.Data<String,Number>("Jun",65));
        series.getData().add(new XYChart.Data<String,Number>("Jul",34));
        series.getData().add(new XYChart.Data<String,Number>("Aug",90));
        series.getData().add(new XYChart.Data<String,Number>("Sep",23));
        series.getData().add(new XYChart.Data<String,Number>("Oct",11));
        series.getData().add(new XYChart.Data<String,Number>("Nov",9));
        series.getData().add(new XYChart.Data<String,Number>("Dec",12));

        barchartManager.getData().add(series);

    }

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


}
