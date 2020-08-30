package com.buseduc.javacourse.oop2020.topic_01.task_10_RP;

import java.util.List;

public class StartTask10 {


    /**
     * @author RP
     * Тема 1. ОСНОВЫ ООП
     * Задание 1_10.
     * Из n целых чисел вывести элементы, отсортированные по убыванию модулей (сортировку реализовать самостоятельно).
     */

    public static void main(String[] args) {

        NumberAbsLIST abs = new NumberAbsLIST();
        List<Integer> numbers = abs.readNumbers();

        abs.sortNumbers(numbers);

        System.out.println(numbers);
    }
}
