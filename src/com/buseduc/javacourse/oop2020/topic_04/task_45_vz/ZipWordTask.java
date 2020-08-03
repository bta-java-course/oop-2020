package com.buseduc.javacourse.oop2020.topic_04.task_45_vz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ZipWordTask {

    /**
     * @author vz
     * Тема 4. ТИПЫ И ОПЕРАТОРЫ
     * Задание 45.
     * Осуществить сжатие английского текста, заменив каждую группу из двух или более рядом стоящих символов на один символ,
     * за которым следует количество его вхождений в группу. К примеру, строка hellowoooorld должна сжиматься в hel2owo4rld.
     */

    public static void main(String[] args) {
        zip();
    }

    private static void zip() {
        String data = "hellowoooorld";
        StringBuilder result = new StringBuilder();
        Pattern pattern = Pattern.compile("(.)\\1{0,}");
        Matcher matcher = pattern.matcher(data);
        while (matcher.find()) {
            result.append(matcher.group(1));
            int length = matcher.group().length();
            if (length > 1)
                result.append(length);
        }
        System.out.println(result);
    }
}
