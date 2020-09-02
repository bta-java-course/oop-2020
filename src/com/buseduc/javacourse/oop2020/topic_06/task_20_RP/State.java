package com.buseduc.javacourse.oop2020.topic_06.task_20_RP;

public enum State {

    ON("Вкл."),
    OFF("Выкл.");

    private String title;

    State(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "State{" +
                "title='" + title + '\'' +
                '}';
    }
}
