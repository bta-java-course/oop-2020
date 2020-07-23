package com.buseduc.javacourse.oop2020.topic_03.task_05_pr;
/**
 * @author pr
 * Тема 3. ОСНОВЫ ООП
 * Задание 5. Book: id, Название, Автор(ы), Издательство, Год издания, Количество страниц, Цена, Тип переплета. Создать массив объектов. Вывести:
 * a) список книг заданного автора;
 * b) список книг, выпущенных заданным издательством;
 * c) список книг, выпущенных после заданного года.

 */

public class Task_05_pr {
    public static void main(String[] args) {

        Kniga[] arr;
        arr = new Kniga[6];

        arr[0] = new Kniga("ISBN 0-0-0-0-0","Title", "Homer", "Springer", 1990, 332, 223, "softcover"); //
        arr[2] = new Kniga("ISBN 2-2-2-2-2","Contemporary Art", "J. Deer", "Wolf & Brothers", 1972, 332, 423, "hardcover"); //
        arr[3] = new Kniga("ISBN 3-3-3-3-3","History", "D. John", "Wolf & Brothers", 1932, 32, 1423, "hardcover"); //
        //arr[0].title = "Odyssey";
        arr[0].setTitle("Odyssey");

        arr[1] = new Kniga(arr[0]);
        arr[1].isbn="1-1-1-1-1";
        //arr[1].title = "Iliada";
        arr[1].setTitle("Iliada");
        arr[1].publisher = "Argus";
        arr[4] = new Kniga("4-4-4-4-4", "Mathematics", "O. Krimer", "Elsevier",1956, 932, 423, "hardcover", 3); //


        System.out.println("Full list of books");
        System.out.println();

        for (int i = 0; i < 5; i = i + 1) {
          //  System.out.println("'" + arr[i].title + "'" + " by " + arr[i].author + ", " + arr[i].publisher + " (" + arr[i].yearOfIssue + ")");
          //  System.out.println("'" + arr[i].getTitle() + "'" + " by " + arr[i].author + ", " + arr[i].publisher + " (" + arr[i].yearOfIssue + ")");


            System.out.println(arr[i].toString());

        }

        System.out.println();
        System.out.println("a) Author: Homer");

        for (int i = 0; i < 5; i = i + 1) {
            if (arr[i].author.equals("Homer")) {
                //System.out.println("'" + arr[i].getTitle() + "'" + " by " + arr[i].author + ", " + arr[i].publisher + " (" + arr[i].yearOfIssue + ")");

                System.out.println(arr[i].toString());


            }
        }

        System.out.println();
        System.out.println("b) Publisher : Wolf & Brothers");

        for (int i = 0; i < 5; i = i + 1) {
            if (arr[i].publisher.equals("Wolf & Brothers")) {
                //System.out.println("'" + arr[i].getTitle() + "'" + " by " + arr[i].author + ", " + arr[i].publisher + " (" + arr[i].yearOfIssue + ")");

                System.out.println(arr[i].toString());
            }
        }
        System.out.println();
        System.out.println("c) Books issued after 1970");
        System.out.println();

       for (int i = 0; i < 5; i = i + 1) {
          if (arr[i].yearOfIssue>1970) {
              //System.out.println("'" + arr[i].getTitle() + "'" + " by " + arr[i].author + ", " + arr[i].publisher + " (" + arr[i].yearOfIssue + ")");
              System.out.println(arr[i].toString());
           }
        }


    }}

