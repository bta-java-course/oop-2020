package com.buseduc.javacourse.oop2020.topic_02.task_12_RP;

import java.util.List;

public class TaskStarter {

    /**
     * @author RP
     * Тема 2. ОСНОВЫ ООП
     * Задание 2_12.
     *Вывести числа от 1 до k в таблицы чисел (4 Х 4) слева направо и сверху вниз.
     */
    public static void main(String[] args) {

        Calculations calc = new Calculations();
        List<Integer> rNums = calc.readFile();
        int[][] matrix = calc.fillArray(rNums);
        int[][] matrix2 = calc.fillArray2(rNums);
        calc.printMatrix(matrix);
        System.out.println();
        calc.printMatrix(matrix2);
    }
}
