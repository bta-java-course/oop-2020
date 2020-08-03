package com.buseduc.javacourse.oop2020.topic_01.task_01_vz;

import java.util.Scanner;

public class TestTask {

    /**
     * @author vz
     * Тема 1. ОСНОВЫ ООП
     * Задание 1.
     * Приветствовать любого пользователя при вводе его имени из командной строки.
     */

    public static void main(String[] args) {
        System.out.println("Введите ваше имя:");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Добро пожаловать " + name + "!");

    }
}
