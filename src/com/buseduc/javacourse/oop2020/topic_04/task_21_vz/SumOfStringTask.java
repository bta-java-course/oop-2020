package com.buseduc.javacourse.oop2020.topic_04.task_21_vz;

import java.util.Scanner;

public class SumOfStringTask {

    /**
     * @author vz
     * Тема 4. ТИПЫ И ОПЕРАТОРЫ
     * Задание 21.
     * Определить сумму всех целых чисел, встречающихся в заданном тексте.
     */

    public static void main(String[] args) {
        sumOfString();
    }

    private static void sumOfString() {
        System.out.print("Введите строку: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] chars = str.split(" ");
        int sum = 0;
        for ( String aChar : chars ) {
            for ( int j = 0; j < aChar.length(); j++ ) {
                char charValue = aChar.charAt(j);
                if (Character.isDigit(charValue)) {
                    sum += Character.getNumericValue(charValue);
                }
            }
        }
        System.out.println("Сумма всех целых чисел в строке равна: " + sum);
    }
}
