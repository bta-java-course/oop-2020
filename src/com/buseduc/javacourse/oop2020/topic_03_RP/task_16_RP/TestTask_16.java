package com.buseduc.javacourse.oop2020.topic_03_RP.task_16_RP;

import java.util.Arrays;
import java.util.Comparator;

public class TestTask_16 {
    /**
     * @author RP
     * Тема 3. КЛАССЫ И ОБЪЕКТЫ
     * Задание 3_16.
     * Определить класс Окружность. Определить площадь и длину окружности.
     * Создать список объектов. Определить наибольший и наименьший по площади (периметру) объект.
     */

    public static void main(String[] args) {

        Circle[] circles = new Circle[5];
        circles[0] = new Circle(6);
        circles[1] = new Circle(5);
        circles[2] = new Circle(8);
        circles[3] = new Circle(3);
        circles[4] = new Circle(9);


        Comparator<Circle> comparatorByPerimeter = Comparator.comparingDouble(value -> value.getPerimeter());


        Arrays.sort(circles, comparatorByPerimeter.thenComparing(Comparator.comparingDouble(value -> value.getArea())));
        System.out.println("Sorted by perimeter\n" + Arrays.toString(circles) + " \n===========================\n");

        Arrays.sort(circles, Comparator.comparingDouble(value -> value.getArea()));
        System.out.println("Sorted by area\n" + Arrays.toString(circles));



    }
}

