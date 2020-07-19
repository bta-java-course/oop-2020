package com.buseduc.javacourse.oop2020.topic_02;

/**
 * @author pr
 * Тема 2. ОСНОВЫ ООП
 * Задание 09. Вывести на консоль название месяца, соответствующего введенному числу. Осуществить проверку корректности ввода чисел.

 */

import java.util.Scanner;
public class Task_09_pr {

    public static void main(String[] args) {


        Scanner scanner3 = new Scanner(System.in);
        int next;


        try {
            System.out.println("Input number of some month");

            next = scanner3.nextInt();

            System.out.println(next);

        } catch (Exception e) {
            System.out.println(" It is not a number.");
            return;
        }

        if (next > 12 || next < 1) {
            System.out.println(" This number does not correspond to any month. ");
            return;
        }


        switch (next) {
            case 1:
                System.out.println("JANUARY");
                break;
            case 2:
                System.out.println("FEBRUARY");
                break;
            case 3:
                System.out.println("MARCH");
                break;
            case 4:
                System.out.println("APRIL");
                break;
            case 5:
                System.out.println("MAY");
                break;
            case 6:
                System.out.println("JUNE");
                break;
            case 7:
                System.out.println("JULY");
                break;
            case 8:
                System.out.println("AUGUST");
                break;
            case 9:
                System.out.println("SEPTEMBER");
                break;
            case 10:
                System.out.println("OCTOBER");
                break;
            case 11:
                System.out.println("NOVEMBER");
                break;
            case 12:
                System.out.println("DECEMBER");
                break;
            default:
                System.out.println("Something wrong !");


        }

    }}
