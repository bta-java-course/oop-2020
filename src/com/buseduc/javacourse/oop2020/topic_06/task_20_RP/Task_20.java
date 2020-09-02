package com.buseduc.javacourse.oop2020.topic_06.task_20_RP;

import com.buseduc.javacourse.oop2020.topic_06.task_02_RP.*;
import com.buseduc.javacourse.oop2020.topic_06.task_20_RP.Appilances.CompactDevice;
import com.buseduc.javacourse.oop2020.topic_06.task_20_RP.Appilances.OversizedDevice;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class Task_20 {

    /**
     * @author RP
     * Тема 6. НАСЛЕДОВАНИЕ, ПОЛИМОРФИЗМ
     * Задание 6_20.
     * Домашние электроприборы. Определить иерархию электроприборов. Включить некоторые в розетку.
     * Подсчитать потребляемую мощность. Провести сортировку приборов в квартире на основе мощности.
     * Найти прибор в квартире, соответствующий заданному диапазону параметров.
     */

    public static void main(String[] args) {

        List<ElectricalDevice> electricalDevices = new ArrayList<>();
        OversizedDevice oversizedDevice1 = new OversizedDevice("refrigerator", "Samsung A++", 140.0, 45.0, State.OFF);
        OversizedDevice oversizedDevice2 = new OversizedDevice("washer", "Miele XXl", 120.0, 40.0, State.OFF);
        CompactDevice compactDevice1 = new CompactDevice("kettle", "Bosch L2", 2000.0, 25.0, State.OFF);
        CompactDevice compactDevice2 = new CompactDevice("grill", "Tefal OptiGrill", 2500.0, 10.0, State.OFF);

        electricalDevices.add(oversizedDevice1);
        electricalDevices.add(oversizedDevice2);
        electricalDevices.add(compactDevice1);
        electricalDevices.add(compactDevice2);


        oversizedDevice1.setState(State.ON);
        compactDevice1.setState(State.ON);

        //System.out.println("\n" + "Total power consumption: " + powerConsumption(electricalDevices));
        //System.out.println("\n" + "Total power consumption: " + powerConsumption2(electricalDevices);


        //variant1
        Collections.sort(electricalDevices, Comparator.comparing(value -> value.getCapacity()));
        System.out.println("Приборы отсортированные по мощности " + electricalDevices);

        System.out.println("\n" + "Найдены включенные приборы с мощностью 140.0 " + foundDevice(electricalDevices));


        //variant2
/*
        Collections.sort(electricalDevices, new Comparator<ElectricalDevice>() {

            @Override
            public int compare(ElectricalDevice o1, ElectricalDevice o2) {
                int compResult = o1.getCapacity().compareTo(o2.getCapacity());

                if (compResult == 0) {
                    return o1.getModel().compareTo(o2.getModel());
                }

                return compResult;
            }

        });
        System.out.println("Приборы отсортированные по мощности " + electricalDevices);
*/


    }

    //variant3
    public static double powerConsumption(List<ElectricalDevice> list) {

        double sum = 0;

        for (ElectricalDevice dev : list) {
            if (dev.getState().equals(State.ON)) {
                sum += dev.getCapacity();
            }
        }
        return sum;
    }

    //variant4
    public static double powerConsumption2(List<ElectricalDevice> list) {

        double sum = list.stream()
                .filter(x -> x.getState() == State.ON)
                .mapToDouble(x -> x.getCapacity())
                .sum();
//        DoubleSummaryStatistics statistics = (DoubleSummaryStatistics) sum;
//        System.out.println(statistics);
        return sum;
    }

    public static List<ElectricalDevice> foundDevice(List<ElectricalDevice> list) {
        return list.stream()
                .filter(ElectricalDevice::isOn)
                .filter(x -> x.getCapacity() >= 140)
                .collect(Collectors.toList());
    }

}
