package com.buseduc.javacourse.oop2020.topic_07.task_17_pr;
/**
 * Тема 7. pr
 * Задание 17. Создать класс Cinema с внутренним классом, с помощью объектов которого можно хранить информацию об адресах кинотеатров, фильмах и времени начала сеансов.
 */

public class Task_17_pr {
    public static void main(String[] args) {
        String cinema= "First";
        String addrCinema="First str. 12, Tallinn, ESTONIA";
        Cinema  cinema1=new Cinema(cinema, addrCinema);
        System.out.println(cinema1.toString());

        String[] times1= {"10:00","13:00","20:00"};
        String[] times2= {"12:00","15:00","17:00"};
        String cinemaTitle0= "Film One";
        String cinemaTitle1= "Film Two";

        Cinema.Movies[] mov1=new Cinema.Movies[2];
        mov1[0]=cinema1.new Movies(cinemaTitle0,times1);
        mov1[1]=cinema1.new Movies(cinemaTitle1,times2);
        for(int j = 0; j < 2; j++) {
        System.out.println(mov1[j].toString()); }
    }
}