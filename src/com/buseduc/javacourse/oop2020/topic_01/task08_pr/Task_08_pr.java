package com.buseduc.javacourse.oop2020.topic_01.task08_pr;

import java.util.Arrays;

/**
 * @author pr
 * Тема 1. ОСНОВЫ ООП
 * Задание 08.Вывести числа, которые делятся на 3 или на 9  из n целых чисел..

 */

public class Task_08_pr {
    public static void main(String[] args) {

        int[] arr;
        int nar=20;
        arr = new int[nar];

        for(int i = 0; i < nar; i++) {arr[i]=  (int) (Math.random() * 100);}

        System.out.println("Array "+ Arrays.toString(arr)+"\n ");

        for(int i = 0; i < nar; i++) {
            if(arr[i]%9==0||arr[i]%3==0) {System.out.print(" "+arr[i]+"\n ");}

                                      }

    }

}
