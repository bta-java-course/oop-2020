package com.buseduc.javacourse.oop2020.topic_06.task_02_RP;

public class Wheel {

    //Создать объект класса Автомобиль, используя классы Колесо, Двигатель.
    // Методы: ехать, заправляться, менять колесо, вывести на консоль марку автомобиля

    private String model;
    private double radius;
    private double pressure;
    private TypeOfWheel typeOfWheel;

    public Wheel(String model, double radius, double pressure, TypeOfWheel typeOfWheel) {
        this.model = model;
        this.radius = radius;
        this.pressure = pressure;
        this.typeOfWheel = typeOfWheel;
    }

    public void changeWheels() {
        for (TypeOfWheel type : TypeOfWheel.values()) {
            System.out.println("Changing  " + type);
        }
    }

    public String getModel() {
        return model;
    }

    public double getRadius() {
        return radius;
    }

    public double getPressure() {
        return pressure;
    }

    public TypeOfWheel getTypeOfWheel() {
        return typeOfWheel;
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "model='" + model + '\'' +
                ", radius=" + radius +
                ", pressure=" + pressure +
                ", typeOfWheel=" + typeOfWheel +
                '}';
    }
}


