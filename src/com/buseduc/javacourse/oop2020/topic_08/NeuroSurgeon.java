package com.buseduc.javacourse.oop2020.topic_08;

public class NeuroSurgeon extends Surgeon {

    @Override
    public boolean isAllPatientsChecked() {
        return getCheckedPatientsNum() >= 5;
    }

    @Override
    public void doOperation() {
        System.out.println("NeuroSurgeon is doing operation");
    }

}
