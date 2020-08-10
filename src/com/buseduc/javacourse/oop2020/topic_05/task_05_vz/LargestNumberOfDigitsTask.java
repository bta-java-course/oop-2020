package com.buseduc.javacourse.oop2020.topic_05.task_05_vz;

public class LargestNumberOfDigitsTask {

    /**
     * @author vz
     * Тема 5. ТИПЫ И ОПЕРАТОРЫ
     * Задание 5.
     * Найти в строке наибольшее число цифр, идущих подряд.
     */

    public static void main(final String[] args) {
        getNumber();
    }

    private static void getNumber() {
        char[] chars = ("1Найти 22в 333строке 4444наибольшее 55555число 666666цифр, 7777777идущих 88888888подряд")
                .toCharArray();
        int pos = 0;
        int num = 0;
        int tmpPos = 0;
        int tmpNum = 0;
        for ( int i = 0; i < chars.length; i++ ) {
            if (Character.isDigit(chars[i])) {
                if (tmpNum == 0) {
                    tmpPos = i;
                }
                tmpNum++;
            } else {
                if (tmpNum > num) {
                    num = tmpNum;
                    pos = tmpPos;
                }
                tmpNum = 0;
                tmpPos = 0;
            }
        }
        System.out.println("Число: " + num + "\n" + "Значение: "
                + String.valueOf(chars).substring(pos, pos + num));
    }
}
