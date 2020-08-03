package com.buseduc.javacourse.oop2020.topic_01.task_19_vz;

import java.util.Scanner;

class PalindromeTask {

    /**
     * @author vz
     * Тема 1. ОСНОВЫ ООП
     * Задание 19.
     * Из n целых чисел вывести числа-палиндромы, значения которых в прямом и обратном порядке совпадают.
     */

    public static void main(String[] args) {
        System.out.print("Введите любое число: ");
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());
        countPal(number);
    }

    static int isPalindrome(int n) {
        int rev = 0;
        for ( int i = n; i > 0; i /= 10 )
            rev = rev * 10 + i % 10;
        return (n == rev) ? 1 : 0;
    }

    static void countPal(int n) {
        for ( int i = 1; i < n + 1; i++ ) {
            if (isPalindrome(i) == 1)
                System.out.print(i + " ");
        }
    }
}
