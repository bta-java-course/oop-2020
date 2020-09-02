package com.buseduc.javacourse.oop2020.topic_06.task_02_RP.workers;

public abstract class Employer {

    protected final String name;

    public Employer(String name) {
        this.name = name;
    }

    public void work() {
        System.out.println(name + " come to working place, start doing my job");
    }

    public void rest() {
        System.out.println("I am resting in restroom");
    }

    public abstract int getSalary();
}
