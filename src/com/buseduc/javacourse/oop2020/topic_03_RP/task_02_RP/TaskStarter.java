package com.buseduc.javacourse.oop2020.topic_03_RP.task_02_RP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class TaskStarter {

    /**
     * @author RP
     * Тема 3. КЛАССЫ И ОБЪЕКТЫ
     * Задание 3_2.
     * Customer: id, Фамилия, Имя, Отчество, Адрес, Номер кредитной карточки, Номер банковского счета.
     * Создать массив объектов. Вывести:
     * a) список покупателей в алфавитном порядке;
     * b) список покупателей, у которых номер кредитной карточки находится в заданном интервале.
     */


    public static void main(String[] args) {

        Customer[] customers = new Customer[6];
        customers[0] = new Customer(1, "Rasmus", "Ilves", null, "Kitsas tee 5", "1233 4567 8908 7567", "EE00988234234");
        customers[1] = new Customer(2, "Petja", "Ivanov", null, "Lai tee 11", "1288 4568 8977 6667", "EE00934234277");
        customers[2] = new Customer(3, "Mihkel", "Petrov", null, "lahe tee 1", "1399 1267 0907 1867", "EE00934235534");
        customers[3] = new Customer(4, "Vasja", "Ivanov", "Viktorovich", "Ringi tee 3", "3344 1267 0907 1867", "EE00934211234");
        customers[4] = new Customer(5, "Petja", "Petrov", "Aleksandrovich", "Kallasmaa tee 14", "4433 1267 0907 1867", "EE007742342224");
        customers[5] = new Customer(6, "Ivan", "Ivanov", "Denisovich", "Keemikutte tee 8", "7733 1267 0907 1867", "EE00934234434");


        Comparator<Customer> compareByName = Comparator.comparing(new Function<Customer, String>() {
            @Override
            public String apply(Customer customer) {
                return customer.getFirstName();
            }
        });
        Function<Customer, String> compareByLastName = new Function<Customer, String>() {
            @Override
            public String apply(Customer customer) {
                return customer.getLastName();
            }
        };

        Arrays.sort(customers, compareByName.thenComparing(compareByLastName));


        System.out.println("MEGA\n" + Arrays.toString(customers));


        Arrays.sort(customers, new Comparator<Customer>() {
            @Override
            public int compare(Customer o1, Customer o2) {
                int compResult = o1.getLastName().compareTo(o2.getLastName());

                if (compResult == 0) {
                    return o1.getFirstName().compareTo(o2.getFirstName());
                }

                return compResult;
            }
        });

        System.out.println(Arrays.toString(customers));

        Integer low = 1000;
        Integer high = 2000;
        List<Customer> list = new ArrayList<>();
        for (Customer customer : customers) {
            String creditCardNumber = customer.getCreditCardNumber();
            String firstTuple = creditCardNumber.substring(0, 4);
            Integer number = Integer.valueOf(firstTuple);

            if (number >= low && number <= high) {
                list.add(customer);
            }
        }

        System.out.println("\n" + list);

    }

}
