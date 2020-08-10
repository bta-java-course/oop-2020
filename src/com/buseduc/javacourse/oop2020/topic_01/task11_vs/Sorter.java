package com.buseduc.javacourse.oop2020.topic_01.task11_vs;

import java.util.Collections;
import java.util.List;

public class Sorter {
    List<Integer> sortAsc(List<Integer> numbers) {
        return sort(numbers, true);
    }

    List<Integer> sortDesc(List<Integer> numbers) {
        return sort(numbers, false);
    }


    List<Integer> sort(List<Integer> numbers, boolean asc) {
        for(int i = 0; i < numbers.size(); i++) {
            for(int j = i; j < numbers.size(); j++) {
                int diff = numbers.get(i) - numbers.get(j);
                if (asc ? diff > 0 : diff < 0) {
                    int swap = numbers.get(i);
                    numbers.set(i, numbers.get(j));
                    numbers.set(j, swap);
                }
            }
        }
        return numbers;
    }

}
