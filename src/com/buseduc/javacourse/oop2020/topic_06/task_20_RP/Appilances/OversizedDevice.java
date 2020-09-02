package com.buseduc.javacourse.oop2020.topic_06.task_20_RP.Appilances;

import com.buseduc.javacourse.oop2020.topic_06.task_20_RP.ElectricalDevice;
import com.buseduc.javacourse.oop2020.topic_06.task_20_RP.State;

public class OversizedDevice extends ElectricalDevice {

    public OversizedDevice(String type, String model, Double capacity, Double noise, State state) {
        super(type, model, capacity, noise, state);
    }

}
