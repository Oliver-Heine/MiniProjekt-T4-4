package com.company;

public class Sensor {
    //
    private String type;
    private static int id;
    private int buildingID;
    private double currentSensorValue;


    public Sensor(String type, int id) {
        this.type = type;
        this.id = id;
        this.buildingID = Building.getBuildingID();
        this.currentSensorValue = currentSensorValue;
    }

    @Override
    public String toString() {
        return "Sensor{" +
                "type=' " + type + '\'' +
                ", Sensor ID= " + id +
                ", buildingID= " + buildingID +
                ", currentSensorValue= " + currentSensorValue +
                '}';
    }

    public String getSensorInfo(){
        return toString();
    }

    public String getType() {
        return type;
    }

    public static int getId() {
        return id;
    }

    public int getBuildingID() {
        return buildingID;
    }

    public double getCurrentSensorValue() {
        return currentSensorValue;
    }
}
