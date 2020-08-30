package com.buseduc.javacourse.oop2020.topic_01.task_17_RP;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class LuckyNumbers {

    public List<Integer> readNumbers() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter numbers.txt to check if they are lucky, when finished enter not numeric: ");

        List<Integer> numList = new ArrayList<>();

        while (in.hasNextInt()) {
            numList.add(in.nextInt());
        }

        System.out.printf("Your numbers.txt: %s \n", numList.toString());
        in.close();

        return numList;
    }

    public List<Integer> identifyluckyNumbers(List<Integer> numbers) {
        List<Integer> foundNums = new ArrayList<>();

        for (Integer number : numbers) {
            switch (number) {
                case 1:
                    foundNums.add(1);
                    break;
                case 9:
                    foundNums.add(9);
                    break;
                case 11:
                    foundNums.add(11);
                    break;
            }
        }

        return foundNums;
    }

}
