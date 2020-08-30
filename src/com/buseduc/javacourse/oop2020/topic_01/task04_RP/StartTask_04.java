package com.buseduc.javacourse.oop2020.topic_01.task04_RP;

public class StartTask_04 {

    /**
     * @author RP
     * Тема 1. ОСНОВЫ ООП
     * Задание 1_4.
     * Ввести пароль из командной строки и сравнить его со строкой-образцом.
     */


    public static void main(String[] args) {

        PasswordReader reader = new PasswordReader();


        String password = reader.readPassword();

        PasswordComparator comparator = new PasswordComparator("testPassword");

        boolean isEquals = comparator.compare(password);

        if (isEquals) {
            System.out.println("Password " + password + " is identical with " + comparator.getDefaultPassword());
        } else {
            System.out.println("Password " + password + " is NOT identical with " + comparator.getDefaultPassword());
        }


    }
}
