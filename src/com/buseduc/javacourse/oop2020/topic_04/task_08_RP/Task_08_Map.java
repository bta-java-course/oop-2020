package com.buseduc.javacourse.oop2020.topic_04.task_08_RP;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class Task_08_Map {

    /**
     * @author RP
     * Тема 4. СТРОКИ
     * Задание 4_08.
     * Определить, сколько раз повторяется в тексте каждое слово, которое встречается в нем.
     */

    public static void main(String[] args) {

        String text = "Опенспейс - стойла для уважаемых специалистов. Опенспейс.";
        text = text.toLowerCase();
        String splitWords[] = text.split("[\\p{Punct}\\s]+");

        Map<String, Integer> groupped = new HashMap<>();
        for (String word : splitWords) {
            if (groupped.containsKey(word)) {
                Integer prevRate = groupped.get(word);
                groupped.put(word, prevRate + 1);
            } else {
                groupped.put(word, 1);
            }
        }
        System.out.println(groupped);

        Map<String, Integer> map = new HashMap<>();
        for (String word : splitWords) {
            Integer rate = map.getOrDefault(word, 0);
            map.put(word, rate + 1);
        }
        System.out.println(map);
    }
}
