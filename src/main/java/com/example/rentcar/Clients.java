package com.example.rentcar;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Clients {
    private SimpleIntegerProperty id;
    private SimpleStringProperty prenom;
    private SimpleStringProperty nom;
    private SimpleStringProperty cin;
    private SimpleStringProperty voiture;
    private SimpleStringProperty email;
    private SimpleIntegerProperty tel;

    public Clients(int id, String prenom, String nom, String cin, String voiture, String email, int tel) {
        this.id =new SimpleIntegerProperty(id);
        this.prenom = new SimpleStringProperty(prenom);
        this.nom =new SimpleStringProperty(nom) ;
        this.cin =new SimpleStringProperty(cin);
        this.voiture = new SimpleStringProperty(voiture);
        this.email = new SimpleStringProperty(email);
        this.tel =new SimpleIntegerProperty(tel);
    }

    public int getId() {
        return id.get();
    }

    public void setId(int id) {
        this.id = new SimpleIntegerProperty(id);
    }

    public String getPrenom() {
        return prenom.get();
    }

    public void setPrenom(String prenom) {
        this.prenom = new SimpleStringProperty(prenom);
    }

    public String getNom() {
        return nom.get();
    }

    public void setNom(String nom) {
        this.nom = new SimpleStringProperty(nom);
    }

    public String getCin() {
        return cin.get();
    }

    public void setCin(String cin) {
        this.cin = new SimpleStringProperty(cin);
    }

    public String getVoiture() {
        return voiture.get();
    }

    public void setVoiture(String voiture) {
        this.voiture = new SimpleStringProperty(voiture);
    }

    public String getEmail() {
        return email.get();
    }

    public void setEmail(String email) {
        this.email = new SimpleStringProperty(email);
    }

    public int getTel() {
        return tel.get();
    }

    public void setTel(int tel) {
        this.tel = new SimpleIntegerProperty(tel);
    }
}
