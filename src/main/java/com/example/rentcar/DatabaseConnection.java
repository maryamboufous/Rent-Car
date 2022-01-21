
package com.example.rentcar;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.*;
import javax.swing.JOptionPane;

public class DatabaseConnection {
    public static Connection databaseLink;
    Connection databaseLink2=null;

    public static Connection getConnection()  throws SQLException {
        String databaseName = "mini_project";
        String databaseUser = "root";
        String databasePassword = "boufous";
        String url = "jdbc:mysql://localhost:3306/" + databaseName;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            databaseLink = DriverManager.getConnection(url, databaseUser, databasePassword);
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;

        }
        return databaseLink;
    }}