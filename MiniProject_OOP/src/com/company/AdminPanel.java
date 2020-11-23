package com.company;
import java.util.ArrayList;
import java.util.Scanner;
public class AdminPanel {
    public static void main(String[] args) {
        AdminPanel.Introduction();
        // write your code here

        Building building1 = new Building("test", 1);
        Building building2 = new Building("test2", 2);
        Building building3 = new Building("test3", 3);
        Sensor sensor1 = new Sensor("TemperatureSensor", 1);
        Sensor sensor2 = new Sensor("TemperatureSensor2", 2);
        Sensor sensor3 = new Sensor("TemperatureSensor3", 3);
        Actuator actuator1 = new Actuator("TemperatureActuator", 1);
        Actuator actuator2 = new Actuator("TemperatureActuator2", 2);
        Actuator actuator3 = new Actuator("TemperatureActuator3", 3);


        ArrayList<Building> building = new ArrayList<Building>();
        building.add(building1);
        building.add(building2);
        building.add(building3);

        ArrayList<Sensor> sensor = new ArrayList<Sensor>();
        sensor.add(sensor1);
        sensor.add(sensor2);
        sensor.add(sensor3);

        ArrayList<Actuator> actuator = new ArrayList<Actuator>();
        actuator.add(actuator1);
        actuator.add(actuator2);
        actuator.add(actuator3);

        for (Building value : building) {
            System.out.println(value);
        }

        System.out.println();

        for (Sensor value: sensor) {
            System.out.println(value);
        }

        System.out.println();

        for (Actuator value: actuator) {
            System.out.println(value);
        }

    }
    public static void Introduction () {
            System.out.println("Welcome to the adminpanel for the bulldings!");
            System.out.println();
            //Show commands for metoder!

        }

    }


