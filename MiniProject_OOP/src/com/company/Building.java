package com.company;

public class Building {

    private String name;
    private static int buildingID;

    public Building() {
    }

    public Building(String name, int buildingID) {
        this.name = name;
        this.buildingID = buildingID;
    }

    @Override
    public String toString() {
        return "Building{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getBuildingInfo(){
        return toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getBuildingID() {
        return buildingID;
    }

    public void setBuildingID(int buildingID) {
        this.buildingID = buildingID;
    }
}
