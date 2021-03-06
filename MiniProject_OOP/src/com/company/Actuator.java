package com.company;

public class  Actuator {
    private String actuatorType;
    private int actuatorID;
    private int sensorIDCoupling;
    private int buildID;
    private double currentActuatorValue;

    public Actuator(String actuatorType, int actuatorID) {
        this.actuatorType = actuatorType;
        this.actuatorID = actuatorID;
        this.sensorIDCoupling = Sensor.getId();
        this.buildID = Building.getBuildingID();
    }

    public String getActuatorType() {
        return actuatorType;
    }

    @Override
    public String toString() {
        return "The name of the actuator is " + actuatorType +
                ". The actuator ID is " + actuatorID +
                ". The ID of the sensor coupling is " + sensorIDCoupling +
                ". The building the actuator belongs to " + buildID +
                ". The current actuator value is " + currentActuatorValue
                ;
    }

    public String getActuatorInfo(){
        return toString();
    }

    public int getActuatorID() {
        return actuatorID;
    }

    public int getSensorIDCoupling() {
        return sensorIDCoupling;
    }

    public int getBuildID() {
        return buildID;
    }

    public double getCurrentActuatorValue() {
        return currentActuatorValue;
    }
}
