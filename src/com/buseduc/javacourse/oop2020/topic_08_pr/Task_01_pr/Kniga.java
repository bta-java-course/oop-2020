package com.buseduc.javacourse.oop2020.topic_08_pr.Task_01_pr;

public abstract class Kniga implements Knigaint{

    String title ;

    String publisher ;
    int yearOfIssue;
    int numberOfPages;
    double price;
    // String typeOfBinding;
    String ISBN;
    String author;

    public Kniga() {

    }

    public Kniga(String ISBN, String author, String title, int yearOfIssue, double price) {
        this.ISBN = ISBN;
        this.author = author;
        this.title = title;
        this.yearOfIssue = yearOfIssue;
        this.price=price;
        // this.typeOfBinding = typeOfBinding;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getYearOfIssue() {
        return yearOfIssue;}

    public double getPrice() {
        return price ;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setType(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    public void setType(double price) {
        this.price = price;
    }

    @Override
    public boolean isAvailable() {return false;};

    @Override
    public double intprice() {return 0;};

}