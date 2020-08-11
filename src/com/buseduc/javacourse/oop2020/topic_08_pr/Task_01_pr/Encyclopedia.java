package com.buseduc.javacourse.oop2020.topic_08_pr.Task_01_pr;

public class Encyclopedia extends Kniga{

    String edition;
    String url;

    public Encyclopedia() {}

    public Encyclopedia(String ISBN, String author, String title, int yearOfIssue, double price, String url, String edition) {
        this.ISBN = ISBN;
        this.author = author;
        this.title = title;
        this.yearOfIssue = yearOfIssue;
        this.price=price;
        this.edition=edition;
        this.url=url;
    }

    public String getEdition() {
        return edition;}

    public void setEdition(String edition) {
        this.edition = edition;}

    public String getUrl() {
        return url;}

    public void setUrl(String url) {
        this.url = url;}

    @Override
    public boolean  isAvailable() {
        if (url == "")
        {return false;}
        else
            return true;                    }

    @Override
    public double intprice() {
        return price*0.5;};

    public String toString()
    {
        return " ISBN: "+"'"+getISBN()+ "'"+" Author: "+"'"+ getAuthor()+"'"+" Title: "+getTitle()+" Year of Issue: "+getYearOfIssue()+" Price: "+getPrice()+" Edition: "+getEdition()+" \n ";
    }

}