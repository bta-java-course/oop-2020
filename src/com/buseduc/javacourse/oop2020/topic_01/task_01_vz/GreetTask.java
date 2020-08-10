package com.buseduc.javacourse.oop2020.topic_01.task_01_vz;

import java.util.Scanner;

public class GreetTask {

    /**
     * @author vz
     * Тема 1. ОСНОВЫ ООП
     * Задание 1.
     * Приветствовать любого пользователя при вводе его имени из командной строки.
     */

    public static void main(String[] args) {
        System.out.println(greet());
    }

    private static String greet() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите ваше имя: ");
        String name = sc.nextLine();
        sc.close();
        String greet = "Добро пожаловать, ";
        return greet.concat(name);
    }
}
