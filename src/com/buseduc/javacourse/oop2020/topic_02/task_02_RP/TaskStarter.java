package com.buseduc.javacourse.oop2020.topic_02.task_02_RP;

import java.util.List;

public class TaskStarter {

    /**
     * @author RP
     * Тема 2. ОСНОВЫ ООП
     * Задание 2_2.
     *Упорядочить и вывести числа в порядке возрастания (убывания) значений их длины.
     */
    public static void main(String[] args) {

        Calculations calc = new Calculations();
        List<String> lines = calc.readFile();
        System.out.println(calc.sortNumbers(lines));

    }
}
