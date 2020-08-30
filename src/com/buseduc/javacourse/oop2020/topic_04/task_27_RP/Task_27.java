package com.buseduc.javacourse.oop2020.topic_04.task_27_RP;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Task_27 {


    /**
     * @author RP
     * Тема 4. СТРОКИ
     * Задание 4_27.
     * Подсчитать, сколько слов в заданном тексте начинается с прописной буквы.
     */

    public static void main(String[] args) {

        String text = "Белый снег. Белый мел. Белый сахар тоже бел. А вот белка не бела.Белой даже не была.";
        String tokens[] = text.split("[\\p{Punct}\\s]+");

        int counter = 0;
        for (String word : tokens) {

            boolean isUpper = Character.isUpperCase(word.charAt(0));
            if (isUpper) {
                counter += 1;
            }
        }
        System.out.println(counter + " слов в тексте начинается с прописной буквы.");

        long count = Arrays.asList(tokens)
                .stream()
                .filter(x -> Character.isUpperCase(x.charAt(0)))
                .count();

        System.out.println(count + " слов в тексте начинается с прописной буквы.");

    }
}


