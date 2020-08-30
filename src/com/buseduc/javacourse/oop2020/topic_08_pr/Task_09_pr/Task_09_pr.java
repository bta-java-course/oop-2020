package com.buseduc.javacourse.oop2020.topic_08_pr.Task_09_pr;

/**
 * Тема 8.
 *   pr
 * Задание 9. abstract class Мебель ➙  Шкаф (interface Книжный Шкаф).
 */

public class Task_09_pr {

    public static void main(String args[])
    {
        Case mycase = new Case( " FactoryOne ", " Wood  " , 100, 199, 100, 50);

        System.out.println(mycase.toString());

        mycase.putBook();

        mycase.takeBook();

        Case mycase1 = new Case( mycase);

        mycase1.setMaterial(" Plastic  ");

        System.out.println(mycase1.toString());

    }

}
