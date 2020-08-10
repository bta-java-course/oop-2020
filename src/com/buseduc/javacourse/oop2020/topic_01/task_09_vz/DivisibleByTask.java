package com.buseduc.javacourse.oop2020.topic_01.task_09_vz;

import java.util.Scanner;

class DivisibleByTask {

    /**
     * @author vz
     * Тема 1. ОСНОВЫ ООП
     * Задание 9.
     * Из n целых чисел вывести числа, которые делятся на 5 и на 7.
     */

    public static void main(String[] args) {
        System.out.print("Введите любое число: ");
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());
        numGen(number);
    }

    private static void numGen(int n) {
        for ( int i = 1; i < n + 1; i++ ) {
            if (i % 5 == 0 || i % 7 == 0)
                System.out.print(i + " ");
        }
    }
}
