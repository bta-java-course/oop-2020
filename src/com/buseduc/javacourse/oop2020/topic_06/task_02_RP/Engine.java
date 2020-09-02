package com.buseduc.javacourse.oop2020.topic_06.task_02_RP;

public class Engine {

    //Создать объект класса Автомобиль, используя классы Колесо, Двигатель.
    // Методы: ехать, заправляться, менять колесо, вывести на консоль марку автомобиля

    private String model;
    private double capacity;
    private double power;
    private  TypeOfEngine typeOfEngine;


    public Engine(String model, double capacity, double power, TypeOfEngine typeOfEngine) {
        this.model = model;
        this.capacity = capacity;
        this.power = power;
        this.typeOfEngine = typeOfEngine;
    }

    public void startEngine() {
        System.out.println("Engine started to work!");
    }

    public String getModel() {
        return model;
    }

    public double getCapacity() {
        return capacity;
    }

    public double getPower() {
        return power;
    }

    public TypeOfEngine getTypeOfEngine() {
        return typeOfEngine;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public void setTypeOfEngine(TypeOfEngine typeOfEngine) {
        this.typeOfEngine = typeOfEngine;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "model='" + model + '\'' +
                ", capacity=" + capacity +
                ", power=" + power +
                ", typeOfEngine=" + typeOfEngine +
                '}';
    }
}
