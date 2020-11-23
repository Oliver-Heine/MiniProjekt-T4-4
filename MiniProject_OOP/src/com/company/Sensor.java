package com.company;

public class Sensor {
    //
     private String type;
    private int id;
    private int buildingID;
    private double currentSensorValue;


    public Sensor(String type, int id, double currentSensorValue) {
        this.type = type;
        this.id = id;
        this.buildingID = Building.getBuildingID();
        this.currentSensorValue = currentSensorValue;
    }

    public String getType() {
        return type;
    }

    public int getId() {
        return id;
    }

    public int getBuildingID() {
        return buildingID;
    }

    public double getCurrentSensorValue() {
        return currentSensorValue;
    }
}
