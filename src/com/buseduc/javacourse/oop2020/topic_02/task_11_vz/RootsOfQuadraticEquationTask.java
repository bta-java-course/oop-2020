package com.buseduc.javacourse.oop2020.topic_02.task_11_vz;

import java.util.Scanner;

class RootsOfQuadraticEquationTask {

    /**
     * @author vz
     * Тема 2. ТИПЫ И ОПЕРАТОРЫ
     * Задание 11.
     * Найти корни квадратного уравнения. Параметры уравнения передавать с командной строкой.
     */

    public static void main(String[] args) {
        quadratic();
    }

    private static void quadratic() {
        double secondRoot = 0, firstRoot = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите значение a: ");
        double a = sc.nextDouble();
        System.out.print("Введите значение b: ");
        double b = sc.nextDouble();
        System.out.print("Введите значение c: ");
        double c = sc.nextDouble();
        double determinant = (b * b) - (4 * a * c);
        double sqrt = Math.sqrt(determinant);

        if (determinant > 0) {
            firstRoot = (-b + sqrt) / (2 * a);
            secondRoot = (-b - sqrt) / (2 * a);
            System.out.println("Корни равны: " + firstRoot + " и " + secondRoot);
        } else if (determinant == 0) {
            System.out.println("Корень равен: " + (-b + sqrt) / (2 * a));
        }
    }
}
