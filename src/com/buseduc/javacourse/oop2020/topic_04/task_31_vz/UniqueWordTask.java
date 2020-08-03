package com.buseduc.javacourse.oop2020.topic_04.task_31_vz;

import java.util.Arrays;

public class UniqueWordTask {

    /**
     * @author vz
     * Тема 4. ТИПЫ И ОПЕРАТОРЫ
     * Задание 31.
     * Найти такое слово в первом предложении, которого нет ни в одном из остальных предложений.
     */

    public static void main(String[] args) {
        getUniqueWord();
    }

    private static void getUniqueWord() {
        String first = "найти такое слово в первом предложении, которого нет ни в одном из остальных предложений";
        String o1 = "найти такое слово в первом предложении, которого нет ни в одном из остальных";
        String o2 = "найти такое слово в первом предложении";
        Arrays.stream(first.split("\\s+"))
                .filter(w -> !o1.concat(o2).contains(w))
                .forEach(System.out::println);
    }
}
