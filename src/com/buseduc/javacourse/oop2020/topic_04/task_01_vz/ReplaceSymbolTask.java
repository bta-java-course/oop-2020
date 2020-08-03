package com.buseduc.javacourse.oop2020.topic_04.task_01_vz;

class ReplaceSymbolTask {

    /**
     * @author vz
     * Тема 4. ТИПЫ И ОПЕРАТОРЫ
     * Задание 1.
     * В каждом слове текста k-ю букву заменить заданным символом.
     * Если k больше длины слова, корректировку не выполнять.
     */

    public static void main(String[] args) {
        String offer = "В каждом слове текста k-ю букву заменить заданным символом.";
        int k = 4;
        char symbol = '_';
        System.out.printf("Дано: %s%sРезультат: %s", offer, System.lineSeparator(), replaceSymbol(offer, k, symbol));
    }

    private static String replaceSymbol(String offer, int index, char symbol) {
        StringBuilder sb = new StringBuilder();
        if (offer != null && offer.length() > 0 && index > 0) {
            for ( String word : offer.split(" ") ) {
                if (word.length() >= index) {
                    sb.append(word, 0, index - 1).append(symbol).append(word.substring(index));
                } else {
                    sb.append(word);
                }
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
