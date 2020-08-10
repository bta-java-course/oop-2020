package com.buseduc.javacourse.oop2020.topic_07.task_13_vs;

public class Task13Vs {

    /**
     * @author vs
     * Тема 7. Интерфейсы
     * Задание 13.
     * Создать класс Shop с внутренним классом, с помощью объектов которого
     * можно хранить информацию об отделах, товарах и услугах.
     *
     * */

    public static void main(String[] args) {

        Shop shop = new Shop();
        shop.addItem("BMW");
        shop.addItem("kefir");
        shop.addItem("cloth");

    }

}
