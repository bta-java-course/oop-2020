package com.buseduc.javacourse.oop2020.topic_08;

import java.util.Arrays;
import java.util.List;

public class Task7Vs {


    /**
     * @author vs
     * Тема 8. Интерфейсы
     * Задание 7.
     * Врач ➙  class Хирург ➙  class Нейрохирург (interface Дежурный врач)
     *
     * */

    public static void main(String[] args) {
        Doctor doc1 = new Doctor();
        Doctor doc2 = new Surgeon();
        Doctor doc3 = new NeuroSurgeon();
        List<Doctor> dutyDoctors = Arrays.asList(doc1, doc2, doc3);
        for (Doctor doc: dutyDoctors) {
            int rnd = (int) (Math.random() * 30);
            doc.setCheckedPatientsNum(rnd);
            System.out.println("Num of patients : " + rnd + ", is finished: " + doc.isAllPatientsChecked());
        }


    }

}
