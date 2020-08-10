package com.buseduc.javacourse.oop2020.topic_08;

public class Doctor implements DutyDoctor {

    private int checkedPatientsNum;

    public int getCheckedPatientsNum() {
        return checkedPatientsNum;
    }

    public void setCheckedPatientsNum(int checkedPatientsNum) {
        this.checkedPatientsNum = checkedPatientsNum;
    }

    @Override
    public boolean isAllPatientsChecked() {
        return checkedPatientsNum >= 25;
    }

    @Override
    public void startPatientsCheck() {
        System.out.println("Measuring current temperature");

    }

    @Override
    public String writeReport() {
        return null;
    }


}
