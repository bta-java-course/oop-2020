package com.buseduc.javacourse.oop2020.topic_04.task_08_RP;

import com.buseduc.javacourse.oop2020.topic_03_RP.task_16_RP.Circle;

import java.util.Arrays;

public class TestTask_08 {

    /**
     * @author RP
     * Тема 4. СТРОКИ
     * Задание 4_08.
     * Определить, сколько раз повторяется в тексте каждое слово, которое встречается в нем.
     */


    public static void main(String[] args) {

        String text = "Опенспейс - стойла для уважаемых специалистов. Опенспейс.";
        text = text.toLowerCase();
        System.out.println(text);
        String splitedWords[] = text.split("[\\p{Punct}\\s]+");
        System.out.println(Arrays.toString(splitedWords));


        int count = 1;
        for (int i = 0; i < splitedWords.length; i++) {
            for (int j = i + 1; j < splitedWords.length; j++) {
                if (splitedWords[i].equals(splitedWords[j])) {
                   count += 1;
                }

            }
            System.out.println(splitedWords[i] + " repeats " + count + " times.");
            count = 1;
        }

    }
}
