package com.buseduc.javacourse.oop2020.topic_01.task03_pr;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author pr
 * Тема 1. ОСНОВЫ ООП
 * Задание 03.Вывести заданное количество случайных чисел. Уточнение: нужно запросить с клавиатуры заданное количество чисел, и вывести ровно столько СЛУЧАЙНЫХ чисел.

 */
public class Task_03_pr {

    public static void main(String[] args) {

        System.out.println( " Input number " );
        Scanner scanner = new Scanner(System.in);
        int nar = scanner.nextInt();
        System.out.println(nar);

        int[] arr;
        arr = new int[nar];

        for(int i = 0; i < nar; i++) {arr[i]=  (int) (Math.random() * 6000);}

        System.out.println("Array "+ Arrays.toString(arr));

    }



}
