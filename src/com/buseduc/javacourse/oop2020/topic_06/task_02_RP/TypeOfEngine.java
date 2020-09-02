package com.buseduc.javacourse.oop2020.topic_06.task_02_RP;

    public enum TypeOfEngine {

        GasolineEngine("Бензин"),
        DieselEngine("Дизель");


        private String title;

        TypeOfEngine(String title) {
            this.title = title;
        }

        public String getTitle() {
            return title;
        }

        @Override
        public String toString() {
            return "TypeOfengine{" +
                    "title='" + title + '\'' +
                    '}';
        }
    }
