package com.buseduc.javacourse.oop2020.topic_01.task11_vs;

import java.util.List;

public class Task11Vs {
    /**
     * @author vs
     * Тема 1. ОСНОВЫ ООП
     * Задание 11.
     * Из n целых чисел вывести отсортированные числа в порядке возрастания и убывания
     * (сортировку реализовать самостоятельно).     */


    public static void main(String[] args) {
        NumberInput input = new NumberInput();
        input.getNumbersFromKeyboard();
        Sorter sorter = new Sorter();
        List<Integer> sortedInput = sorter.sortAsc(input.getNumbers());
        System.out.println(sortedInput);


    }
}
