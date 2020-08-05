package com.buseduc.javacourse.oop2020.topic_08;

public class Surgeon extends Doctor {

    public void doOperation() {
        System.out.println("Surgeon doing operation");

    }


    @Override
    public boolean isAllPatientsChecked() {
        return getCheckedPatientsNum() >= 10;
    }

    @Override
    public void startPatientsCheck() {
        System.out.println("do check state of body");

    }

    @Override
    public String writeReport() {
        return "Reported OK";
    }


}
