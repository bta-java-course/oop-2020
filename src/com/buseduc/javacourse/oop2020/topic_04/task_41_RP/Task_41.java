package com.buseduc.javacourse.oop2020.topic_04.task_41_RP;



import java.util.Arrays;
import java.util.Comparator;

public class Task_41 {

    /**
     * @author RP
     * Тема 4. СТРОКИ
     * Задание 4_41.
     * Отсортировать слова в тексте по убыванию количества вхождений заданного символа,
     * а в случае равенства — по алфавиту.
     */
    private static class MeetLetter implements Comparator<String> {

        private char letter;

        MeetLetter(char l) {
            letter = l;
        }

        private int matchesCount(String s) {
            int found = 0;

            for (char c : s.toCharArray())
                if (letter == c)
                    ++found;

            return found;

        }

        @Override
        public int compare(String a, String b) {
            int diff = matchesCount(b) - matchesCount(a);
            return (diff != 0) ? diff : a.compareTo(b);
        }

    }


    public static void main(String[] args) {

        String text = "Прокорректировать перепрограммированный транклюкатор на пипелаце подсаков без гравицапы.";
        text = text.toLowerCase();

        String tokens[] = text.split("[\\p{Punct}\\s]+");

        MeetLetter comparator = new MeetLetter('р');
        Arrays.sort(tokens, comparator);
        for (String w : tokens)
            System.out.println(w);
    }
}
