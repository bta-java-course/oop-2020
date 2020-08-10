package com.buseduc.javacourse.oop2020.topic_02.task_19_vz;

import java.util.Arrays;
import java.util.Random;

class TableTask {

    /**
     * @author vz
     * Тема 2. ТИПЫ И ОПЕРАТОРЫ
     * Задание 21.
     * Создать таблицу чисел (4 Х 4) со случайными значениями от 0 до 3 и вывести ее на консоль.
     * Преобразовать строки таким образом, чтобы элементы, равные нулю, располагались после всех остальных.
     */

    public static void main(String[] args) {
        genTable();
    }

    static void genTable() {
        int[][] arr = new int[4][4];
        Random rnd = new Random();
        for ( int i = 0; i < arr.length; i++ ) {
            for ( int j = 0; j < arr[i].length; j++ ) {
                arr[i][j] = rnd.nextInt(4);
            }
        }
        for ( int i = 0; i < arr.length; i++ ) {
            int[][] res = new int[arr.length][arr[i].length];
            int index = 0;
            for ( int j = 0; j < arr[i].length; j++ ) {
                if (arr[i][j] != 0) res[i][index++] = arr[i][j];
            }
            System.out.println(Arrays.toString(res[i]));
        }
    }
}
