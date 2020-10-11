package com.j.mybootdemo.models.mongodb;

public class AirCraft {
    private String model;
    private int nbseats;

    public AirCraft(String model, int nbseats) {
        this.model = model;
        this.nbseats = nbseats;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNbseats() {
        return nbseats;
    }

    public void setNbseats(int nbseats) {
        this.nbseats = nbseats;
    }
}
