package com.buseduc.javacourse.oop2020.topic_05.task_04_RP;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Task_04 {


    /**
     * @author RP
     * Тема 5. ВВОД / ВЫВОД
     * Задание 5_04.
     * Найти и вывести слова текста, для которых последняя буква одного слова совпадает
     * с первой буквой следующего слова.
     */

    public static void main(String[] args) {
        List<String> wordsToChek = new ArrayList<>();

        List<String> lines = readLines("OOP/task_04_RP.txt");
        for (String line : lines) {
            List<String> words = splitLineByWords(line);
            List<String> wordsWithoutPrewords = words
                    .stream()
                    .filter(WordDetector::isWord)
                    .collect(Collectors.toList());

            wordsToChek.addAll(wordsWithoutPrewords);

        }
        System.out.println("\n" + "Words to check: " + "\n" + wordsToChek);
        System.out.println("\n" + "Detected words pairs: " + "\n" + foundWordPairs(wordsToChek));

    }

    private static List<String> foundWordPairs(List<String> check) {
        List<String> adapt = new ArrayList<>();

        for (int i = 0; i < check.size() - 1; i++) {

            if (check.get(i).charAt(check.get(i).length() - 1) == check.get(i + 1).charAt(0)) {
                adapt.add(check.get(i));
                adapt.add(check.get(i + 1));
            }
        }

        return adapt;
    }

    private static List<String> splitLineByWords(String s) {

        List<String> tokens = Arrays.asList(s.split("[\\p{Punct}\\s]+"));
        return tokens;
    }

    private static List<String> readLines(String fileName) {
        List<String> lines = new ArrayList<>();

        try (BufferedReader in = new BufferedReader(new FileReader(new File(fileName)))) {
            String line;
            while ((line = in.readLine()) != null) {
                lines.add(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("FILE NOT FOUND"); // do something to handle the error
        } catch (IOException e) {
            System.out.println("Failed to open  file"); // do something to handle the error
        }

        return lines;
    }


    public static class WordDetector {
        private static final List<String> pretext = Arrays.asList("в", "без", "до", "из", "к", "на", "по", "о", "и", "а", "от",
                "перед", "при", "через", "с", "у", "за", "над", "об", "под", "про", "для");

        public static boolean isWord(String forTest) {
            return !pretext.contains(forTest.toLowerCase());
        }
    }
}





