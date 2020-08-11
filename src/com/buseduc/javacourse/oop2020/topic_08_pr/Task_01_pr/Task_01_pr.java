package com.buseduc.javacourse.oop2020.topic_08_pr.Task_01_pr;

/**
 * @author pr
 * Тема 8. ОСНОВЫ ООП
 * Задание 1. abstract class Книга ➙  class Справочник и Энциклопедия (interface Книга в Интернет-Магазине)

 */

public class Task_01_pr {

    public static void main(String[] args) {

        Encyclopedia encyclopedy = new Encyclopedia( "isbn1", " Ivanov. P, Editor" , " Encyclopedia, Vol. 1 ", 1990, 332,  " Amazon" ,  " Second "); //
        Rbook referencebook = new Rbook( " isbn2 ", "J. Deer", " Reference Book on Astronomy ", 1972, 333, "", " Geometry " ); //

        System.out.println(encyclopedy.toString());
        if (encyclopedy.isAvailable()) {System.out.println(" Available in the Web. " + "Price in Internet:" + encyclopedy.intprice() + "\n");}
        else {System.out.println(" Not available in the Web. \n");}
        System.out.println(referencebook.toString());

        if (referencebook.isAvailable()) {System.out.println(" Available in the Web. \n");}
        else {System.out.println(" Not available in the Web.");}

    }
}