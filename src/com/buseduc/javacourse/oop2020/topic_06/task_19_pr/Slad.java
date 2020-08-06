package com.buseduc.javacourse.oop2020.topic_06.task_19_pr;

public class Slad {
    private	String name;
    private double price;
    private double encost;
    private double weight;
    private double sugar;

    
    public Slad (String name, double price, double encost, double weight, double sugar){
        this.name = name;
        this.price = price;
        this.encost = encost;
        this.weight = weight;
        this.sugar = sugar;
    }

    public Slad() {}

    public String getName() {
        return name;}

    public double getPrice() {
        return price;  }

    public double getEncost() {
        return encost;  }

    public double getWeight() {
        return weight;}

    public double getSugar() {
        return sugar;}

    public void setName(String name) {
        this.name = name;
    }

    public void setEncost(double encost) {
        this.encost = encost;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setSugar(double sugar) {
        this.sugar = sugar;
    }
}
