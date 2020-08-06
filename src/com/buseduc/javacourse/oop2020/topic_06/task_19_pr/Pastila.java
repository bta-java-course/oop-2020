package com.buseduc.javacourse.oop2020.topic_06.task_19_pr;

public class Pastila extends Slad {

    private String color;

    public Pastila (String name, double price, double encost, double weight, double sugar, String color){
        this.color = color;
    }

    public Pastila() {}

    public String getColor() {
        return color;}

    public void setColor(String color) {
        this.color = color;
    }

    public String toString()
    {

        return " Name: "+ "'"+getName() + "'" +" Color: " +"'" +getColor()+"'" + " Price: "+ getPrice()+ " Energy value: "+getEncost()+ " Weight: "+getWeight()+ " Sugar content:  "+getSugar()+ "\n";

    }

}
