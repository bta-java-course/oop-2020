package com.buseduc.javacourse.oop2020.topic_06.task_02_RP;


import javafx.beans.value.ObservableMapValue;

import java.util.ArrayList;

public class Task_02 {

    /**
     * @author RP
     * Тема 6. НАСЛЕДОВАНИЕ, ПОЛИМОРФИЗМ
     * Задание 6_2.
     * Создать объект класса Автомобиль, используя классы Колесо, Двигатель.
     * Методы: ехать, заправляться, менять колесо, вывести на консоль марку автомобиля.
     */

    public static void main(String[] args) {


        Car car1 = new Car("BMW", new Engine("V8", 6.0, 300, TypeOfEngine.GasolineEngine ), new ArrayList<>());


        car1.getWheels().add(new Wheel("MS12", 16, 2.2, TypeOfWheel.FrontLeft));
        car1.getWheels().add(new Wheel("MS12", 16, 2.2, TypeOfWheel.FrontRight));
        car1.getWheels().add(new Wheel("MS12", 16, 2.2, TypeOfWheel.BackLeft));
        car1.getWheels().add(new Wheel("MS12", 16, 2.2, TypeOfWheel.BackRight));


        System.out.println(car1.getModel());


    }
}
