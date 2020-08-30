package com.buseduc.javacourse.oop2020.topic_01.task_10_RP;


import java.util.*;


public class NumberAbsLIST {

    public List<Integer> readNumbers() {
        Scanner in = new Scanner(System.in);
        System.out.print("Input numbers to sort, when finished enter not numeric: ");

        List<Integer> numList = new ArrayList<>();

        while (in.hasNextInt()) {
            numList.add(in.nextInt());
        }

        System.out.printf("Your numbers %s \n", numList.toString());
        in.close();

        return numList;
    }


    public List<Integer> sortNumbers(List<Integer> numbers) {
        System.out.println(numbers);

        numbers.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer left, Integer right) {
                if (Math.abs(left) == Math.abs(right)) {
                    return 0;
                }

                if (Math.abs(left) > Math.abs(right)) {
                    return -1;
                } else {
                    return 1;
                }
            }
        });

        return numbers;
    }
}
