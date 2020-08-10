package com.buseduc.javacourse.oop2020.topic_01.task11_vs;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class NumberInput {
    List<Integer> numbers;
    public void getNumbersFromKeyboard() {
        Scanner sc = new Scanner(System.in);
        numbers = new ArrayList<>();
        while (true) {
            System.out.println("Input integer number (non-digit symbol to exit): ");
            try {
                int next = sc.nextInt();
                numbers.add(next);
            } catch (InputMismatchException ime) {
                System.out.println("Thank you, input finished!");
                break;
            }

        }
    }

    public List<Integer> getNumbers() {
        return numbers;
    }
}
