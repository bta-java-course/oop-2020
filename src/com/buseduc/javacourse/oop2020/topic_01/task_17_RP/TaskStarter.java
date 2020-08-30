package com.buseduc.javacourse.oop2020.topic_01.task_17_RP;

import java.util.List;

public class TaskStarter {

    /**
     * @author RP
     * Тема 1. ОСНОВЫ ООП
     * Задание 1_17.
     * Из n целых чисел вывести «счастливые» числа.
     */

    public static void main(String[] args) {
        LuckyNumbers nums = new LuckyNumbers();
        List<Integer> numbers = nums.readNumbers();
        List<Integer> luckyNumbers = nums.identifyluckyNumbers(numbers);
        System.out.println("Found the following lucky numbers.txt: " + luckyNumbers);

    }
}
