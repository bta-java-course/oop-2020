package com.buseduc.javacourse.oop2020.topic_02.task_01_vz;

import java.util.Scanner;

class ShortestAndLargestNumbersTask {

    /**
     * @author vz
     * Тема 2. ТИПЫ И ОПЕРАТОРЫ
     * Задание 1.
     * Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.
     */

    public static void main(String[] args) {
        compareNumbers();
    }

    private static void compareNumbers() {
        System.out.print("Введите любые два числа через пробел: ");
        Scanner sc = new Scanner(System.in);
        String numbers = sc.nextLine();
        String longWord = "", shortWord = numbers;
        for ( String n : numbers.split(" ") ) {
            if (n.length() > longWord.length()) longWord = n;
            if (n.length() < shortWord.length()) shortWord = n;
        }
        System.out.println("Самое длинное число: '" + longWord + "'");
        System.out.println("Длина: " + longWord.length());
        System.out.println("Самое короткое число: '" + shortWord + "'");
        System.out.println("Длина: " + shortWord.length());
    }
}
