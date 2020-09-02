package com.buseduc.javacourse.oop2020.topic_06.task_02_RP.workers;

public class Inspector extends Employer {

    public Inspector(String inspector_first) {
        super(inspector_first);
    }

    @Override
    public void work() {
        System.out.println(" Inspector " + name + " come to working place, start doing my job");
    }

    @Override
    public int getSalary() {
        return 1000;
    }
}
