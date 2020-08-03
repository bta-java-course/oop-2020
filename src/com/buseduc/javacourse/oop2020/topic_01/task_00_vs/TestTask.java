package com.buseduc.javacourse.oop2020.topic_01.task_00_vs;

        import java.util.Scanner;

public class TestTask {

    /**
     * @author vs
     * Тема 1. ОСНОВЫ ООП
     * Задание 0.
     * Это образец задания, его нельзя выбирать!
     * Попрощаться с пользователем при вводе его имени из командной строки.
     */

    public static void main(String[] args) {
        // здесь начинается выполнение задания:
        System.out.println("Введите ваше имя:");
        System.out.print("=>");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("До свидания, " + name + "!");

    }
}
