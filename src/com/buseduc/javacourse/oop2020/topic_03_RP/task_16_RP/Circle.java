package com.buseduc.javacourse.oop2020.topic_03_RP.task_16_RP;

import static java.lang.Math.PI;

public class Circle {

    private double radios;
    private double perimeter;
    private double area;

    public Circle(double r) {
        this.radios = r;
        this.perimeter = 2 * PI * r;
        this.area = PI * r * r;
    }

    public double getRadios() {
        return radios;
    }

    public void setRadios(double radios) {
        this.radios = radios;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radios=" + radios +
                ", perimeter=" + perimeter +
                ", area=" + area +
                '}';
    }
}
