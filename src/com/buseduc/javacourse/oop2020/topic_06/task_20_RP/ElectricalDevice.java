package com.buseduc.javacourse.oop2020.topic_06.task_20_RP;

public class ElectricalDevice {

    String type;
    String model;
    Double capacity;
    Double noise;
    State state;

    public ElectricalDevice(String type, String model, Double capacity, Double noise, State state) {
        this.type = type;
        this.model = model;
        this.capacity = capacity;
        this.noise = noise;
        this.state = state;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Double getCapacity() {
        return capacity;
    }

    public void setCapacity(Double capacity) {
        this.capacity = capacity;
    }

    public Double getNoise() {
        return noise;
    }

    public void setNoise(Double noise) {
        this.noise = noise;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "ElectricalDevice{" +
                "type='" + type + '\'' +
                ", model='" + model + '\'' +
                ", capacity=" + capacity +
                ", noise=" + noise +
                ", state=" + state +
                '}';
    }

    public boolean isOn() {
        return getState() == State.ON;
    }
}
