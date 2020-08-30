package com.buseduc.javacourse.oop2020.topic_07.task_17_pr;

import java.util.Arrays;

public class Cinema {
    String address;
    String name;

    @Override
    public String toString() {
        return "Cinema{" +
                "address='" + address + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public Cinema(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public class Movies {
        String title;
        String[] times;

        public Movies(String title, String[] times) {
            this.title = title;
            this.times = times;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String[] getTimes() {
            return times;
        }

        public void setTimes(String[] times) {
            this.times = times;
        }

        @Override
        public String toString() {
            return "Movies{" +
                    "title='" + title + '\'' +
                    ", times=" + Arrays.toString(times) +
                    '}';
        }
    }

}


