package com.buseduc.javacourse.oop2020.topic_06.task_02_RP.workers;

import java.util.Arrays;
import java.util.List;

public class WorkersStarted {
    public static void main(String[] args) {

        List<Employer> list = Arrays.asList(new Inspector("Roman Petrov"));
        list.forEach(x -> x.work());

        list.forEach(x -> x.rest());
    }
}
