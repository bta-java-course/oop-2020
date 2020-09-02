package com.buseduc.javacourse.oop2020.topic_06.task_02_RP;

public enum TypeOfWheel {
    FrontLeft("Переднее левое колесо"),
    FrontRight("Переднее правое колесо"),
    BackLeft("Заднее левое колесо"),
    BackRight("Заднее правое колесо");


    private String title;

    TypeOfWheel(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "TypeOfWheel{" +
                "title='" + title + '\'' +
                '}';
    }
}
