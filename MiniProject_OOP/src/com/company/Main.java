package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Building building1 = new Building("test", 1);
        Sensor sensor1 = new Sensor("TemperatureSensor", 1);
        Actuator actuator1 = new Actuator("TemperatureActuator", 1);

        System.out.println(actuator1.getActuatorInfo());

    }
}
