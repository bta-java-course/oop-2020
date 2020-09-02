package com.buseduc.javacourse.oop2020.topic_06.task_02_RP;

import java.util.List;

public class Car {

    private final String model;
    private final Engine engine;
    private final List<Wheel> wheel;

    public Car(String model, Engine engine, List<Wheel> wheel) {
        this.model = model;
        this.engine = engine;
        this.wheel = wheel;
    }

     public static void startDriving() {
        System.out.println("Driving.");
    }

    public static void refuel() {

        System.out.println("Refueling car.");
    }

    public static void changeWheel() {

        System.out.println("Changing wheel.");
    }

    public String getModel() {
        return model;
    }

    public Engine getEngine() {
        return engine;
    }

    public List<Wheel> getWheels() {
        return wheel;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", engine=" + engine +
                ", wheel=" + wheel +
                '}';
    }
}
