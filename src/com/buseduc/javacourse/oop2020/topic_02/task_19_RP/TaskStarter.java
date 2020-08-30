package com.buseduc.javacourse.oop2020.topic_02.task_19_RP;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TaskStarter {

    /**
     * @author RP
     * Тема 2. ОСНОВЫ ООП
     * Задание 2_19.
     * Создать таблицу чисел (4 Х 4) со случайными значениями от 0 до 3 и вывести ее на консоль.
     * Если в таблице есть строки / столбцы, содержащие одинаковые числа (напр., 0 0 0 0),
     * то удалить эти строки / столбцы.
     */
    public static void main(String[] args) {
        Calculations calc = new Calculations();
        calc.writeFile();
        System.out.println(calc.readFile());
        List<Integer> numbers = calc.readFile();
        int[][] matrix = new int[4][4];
        matrix = calc.fillArray(numbers);
        calc.printMatrix(matrix);
        matrix = Remake.trimAllColumns(matrix);
        matrix = Remake.trimAllRows(matrix);
        System.out.println("\n");
        System.out.println("Final matrix: ");
        Calculations.printMatrix(matrix);

    }
}
