package com.buseduc.javacourse.oop2020.topic_07.task_13_vs;

import java.time.Period;
import java.util.List;

public class Shop {
    String name;
    List<Section> sections;
    List<Item> items;
    List<Service> services;

    class UnitOfService {
        String nameOfHead;
        String name;
        double totalPrice;
    }
    class Item extends UnitOfService {
        Period warrantyTime;
        Section section;
    }
    class Section extends UnitOfService {
        int staffCount;
    }

    class Service extends UnitOfService {
        Period deliveryTime;
        Section section;
    }


    public void addItem(String name) {
        Item item = new Item();
        item.name = name;
        items.add(item);
    }


}
