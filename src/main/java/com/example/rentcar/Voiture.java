package com.example.rentcar;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Voiture {
    private SimpleIntegerProperty id;
    private SimpleStringProperty type;
    private SimpleStringProperty code;
    private SimpleStringProperty trans;
    private SimpleStringProperty categ;
    private SimpleIntegerProperty place;
    private SimpleIntegerProperty porte;
    private SimpleStringProperty dispo;
    private SimpleStringProperty imma;

    public Voiture(int id, String type, String code, String trans, String categ, int place, int porte, String dispo, String imma) {
        this.id = new SimpleIntegerProperty(id) ;
        this.type = new SimpleStringProperty(type);
        this.code =new SimpleStringProperty(code) ;
        this.trans =new SimpleStringProperty(trans) ;
        this.categ =new SimpleStringProperty(categ) ;
        this.place =new SimpleIntegerProperty(place) ;
        this.porte =new SimpleIntegerProperty(porte) ;
        this.dispo =new SimpleStringProperty(dispo) ;
        this.imma =new SimpleStringProperty(imma) ;
    }

    public int getId() {
        return id.get();
    }

    public SimpleIntegerProperty idProperty() {
        return id;
    }

    public void setId(int id) {
        this.id= new SimpleIntegerProperty(id);
    }

    public String getType() {
        return type.get();
    }

    public SimpleStringProperty typeProperty() {
        return type;
    }

    public void setType(String type) {
        this.type=new SimpleStringProperty(type);
    }

    public String getCode() {
        return code.get();
    }

    public SimpleStringProperty codeProperty() {
        return code;
    }

    public void setCode(String code) {
        this.code= new SimpleStringProperty(code);
    }

    public String getTrans() {
        return trans.get();
    }

    public SimpleStringProperty transProperty() {
        return trans;
    }

    public void setTrans(String trans) {
        this.trans= new SimpleStringProperty(trans);
    }

    public String getCateg() {
        return categ.get();
    }

    public SimpleStringProperty categProperty() {
        return categ;
    }

    public void setCateg(String categ) {
        this.categ= new SimpleStringProperty(categ);
    }

    public int getPlace() {
        return place.get();
    }

    public SimpleIntegerProperty placeProperty() {
        return place;
    }

    public void setPlace(int place) {
        this.place = new SimpleIntegerProperty(place);
    }

    public int getPorte() {
        return porte.get();
    }

    public SimpleIntegerProperty porteProperty() {
        return porte;
    }

    public void setPorte(int porte) {
        this.porte= new SimpleIntegerProperty(porte);
    }

    public String getDispo() {
        return dispo.get();
    }

    public SimpleStringProperty dispoProperty() {
        return dispo;
    }

    public void setDispo(String dispo) {
        this.dispo= new SimpleStringProperty(dispo);
    }

    public String getImma() {
        return imma.get();
    }

    public SimpleStringProperty immaProperty() {
        return imma;
    }

    public void setImma(String imma) {
        this.imma = new SimpleStringProperty(imma);
    }
}
