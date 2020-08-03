package com.buseduc.javacourse.oop2020.topic_03.task_05_pr;

public class Kniga {

    String isbn;
  private  String title ;
    String author ;
    String publisher ;
    int yearOfIssue;
    int numberOfPages;
    long price;
    int numberOfEdition;
    String typeOfBinding;



    public Kniga(String isbn, String title, String author, String publisher, int yearOfIssue, int numberOfPages, long price, String typeOfBinding)
    {
        this.isbn=isbn;
        this.title= title ;
        this.author= author ;
        this.publisher= publisher ;
        this.yearOfIssue= yearOfIssue;
        this.numberOfPages=numberOfPages;
        this.price=price;
        this.typeOfBinding=typeOfBinding;



    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String toString()
    {

      return  "'" + getTitle() + "'" + " by " + author + ", " + publisher + " (" + yearOfIssue + ")";


    }




    public Kniga(Kniga book) {

        this.isbn=book.isbn;
        this.title= book.title ;
        this.author= book.author ;
        this.publisher= book.publisher ;
        this.yearOfIssue= book.yearOfIssue;
        this.numberOfPages=book.numberOfPages;
        this.price=book.price;
        this.typeOfBinding=book.typeOfBinding;
    }

    public Kniga( String isbn, String title, String author, String publisher, int yearOfIssue, int numberOfPages, long price, String typeOfBinding, int numberOfEdition )
    {
        this.isbn=isbn;
        this.title= title ;
        this.author= author ;
        this.publisher= publisher ;
        this.yearOfIssue= yearOfIssue;
        this.numberOfPages=numberOfPages;
        this.price=price;
        this.typeOfBinding=typeOfBinding;
        this.numberOfEdition=numberOfEdition;

    }



}
