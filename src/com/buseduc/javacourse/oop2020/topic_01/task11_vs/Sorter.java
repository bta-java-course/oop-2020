package com.buseduc.javacourse.oop2020.topic_01.task11_vs;

import java.util.Collections;
import java.util.List;

public class Sorter {
    List<Integer> sortAsc(List<Integer> numbers) {
        Collections.sort(numbers);
        return numbers;
    }
    List<Integer> sortDesc(List<Integer> numbers) {
        return null;
    }
}
