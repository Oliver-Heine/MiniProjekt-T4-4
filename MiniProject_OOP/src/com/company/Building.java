package com.company;

public class Building {

    private String name;
    private static int buildingID;

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
