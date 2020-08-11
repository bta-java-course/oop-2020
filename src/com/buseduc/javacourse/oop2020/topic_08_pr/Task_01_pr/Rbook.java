package com.buseduc.javacourse.oop2020.topic_08_pr.Task_01_pr;

public class Rbook  extends Kniga{

    String field;
    String url;

    public Rbook() {}

    public Rbook(String ISBN, String author, String title, int yearOfIssue, double price, String url, String field) {
        this.ISBN = ISBN;
        this.author = author;
        this.title = title;
        this.yearOfIssue = yearOfIssue;
        this.price=price;
        this.field=field;
        this.url=url;
    }

    public String getField() {
        return field;}

    public void setField(String field) {
        this.field = field;}

    @Override
    public boolean  isAvailable() {
        if (url == "")
        {return false;}
        else
            return true;                    }

    @Override
    public double intprice() {
        return price*0.7;};

    public String toString()
    {

        return " ISBN: "+ "'"+getISBN() + "'" +" Author: " +"'" + getAuthor() + "'" + " Title: "+ getTitle()+
                " Year of Issue: "+getYearOfIssue()+ " Price: "+getPrice()+    " Field:  "+getField()+   " \n ";

    }

}
