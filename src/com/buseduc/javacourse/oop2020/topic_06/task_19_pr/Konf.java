package com.buseduc.javacourse.oop2020.topic_06.task_19_pr;

public class Konf extends Slad{

    private	String type;

    public Konf (String name, String type, double price, double encost, double weight, double sugar){}

    public Konf() {}

    public String getType() {
        return type;}

    public void setType(String type) {
        this.type = type;
    }

    public String toString()
    {

        return " Name: "+ "'"+getName() + "'" +" Type: " +"'" +getType()+"'" + " Price: "+ getPrice()+ " Energy value: "+getEncost()+ " Weight: "+getWeight()+ " Sugar content:  "+getSugar()+ " \n ";

    }
}
