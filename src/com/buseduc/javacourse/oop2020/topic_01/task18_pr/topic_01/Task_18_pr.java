package com.buseduc.javacourse.oop2020.topic_01.task18_pr.topic_01;

import java.util.Arrays;

public class Task_18_pr {

    /**
     * @author pr
     * Тема 1. ОСНОВЫ ООП
     * Задание 18. Из n целых чисел вывести числа Фибоначчи: f0 = f1 = 1, f (n) = f (n–1) + f (n–2). Последовательность: 1, 1, 2, 3, 5, 8, 13, 21 ....
     * Это образец задания, его нельзя выбирать!

     */


    public static void main(String[] args) {

        int[] arr;
        int nar=100;
        arr = new int[nar];

        for(int i = 0; i < nar; i++) {arr[i]=  (int) (Math.random() * 6000);}
        Arrays.sort(arr);

        int s=0;
        int nfmax = 92;
        long a13 = 1;
        long b13 = 1;
        arr[0]=0;
        arr[1]=1;
        arr[2]=2;
        System.out.println("Array "+ Arrays.toString(arr)+"\n contains following Fibonacci numbers: ");
      //  System.out.println("contains following Fibonacci numbers: ");
        long fib13 = 2;
        long i = 2;
        while (i < nfmax ) {
            fib13 = a13 + b13;
            a13 = b13;
            b13 = fib13;
            if ((fib13> arr[99])) {break;}
            else {

                for( int i1 = 0; i1 < nar; i1++) {

                    if (fib13==  (long) arr[i1]) {System.out.println(fib13);  s++;}	}

            }

            i++;
        }

        for( int i1 = 0; i1 < nar; i1++) {


            if (0 ==  (long) arr[i1] || 1 ==  (long) arr[i1] ) {System.out.println(arr[i1]);  s++;}	}


        System.out.println("Amount of Fibonacci numbers in this array: " +  s);
    }
}
