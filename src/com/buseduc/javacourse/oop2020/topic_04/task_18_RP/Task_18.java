package com.buseduc.javacourse.oop2020.topic_04.task_18_RP;

import java.util.ArrayList;
import java.util.List;

public class Task_18 {

    /**
     * @author RP
     * Тема 4. СТРОКИ
     * Задание 4_18.
     * В заданном тексте найти сумму всех встречающихся цифр.
     */

    public static void main(String[] args) {

        String text = "5 doors. 1 Window. Best car with number 8.";

        String splitedWords[] = text.split("[\\p{Punct}\\s]+");

        int sum = 0;
        for (String word : splitedWords) {
            try {
                int value = Integer.parseInt(word);
                sum += value;
            } catch (NumberFormatException ignore) {
                //not an Integer. Ignore.
            }
        }
        System.out.println("All numbers sum = " + sum);
    }
}
