package com.buseduc.javacourse.oop2020.topic_05.task_23_RP;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Task_23 {

    /**
     * @author RP
     * Тема 5. ВВОД / ВЫВОД
     * Задание 5_23.
     * В файле содержится совокупность строк. Найти номера строк, совпадающих с заданной строкой.
     * Имя файла и строка для поиска — аргументы командной строки.
     * Вывести строки файла и номера строк, совпадающих с заданной.
     */

    public static void main(String[] args) {

        Scanner scanner;
        scanner = new Scanner(System.in);

        System.out.println("Please enter file name ( task_23_RP ):");
        String fileName = scanner.nextLine();
        // task_23_RP
        List<String> lines = readLines("OOP/" + fileName + ".txt");
        System.out.println(lines);
        System.out.println("Please enter search string:");
        String srcString = scanner.nextLine();

        List<String> linesIndexes = new ArrayList<>();
        for (int i = 0; i < lines.size(); i++) {
            if (lines.get(i).equals(srcString)) {
                linesIndexes.add(Integer.toString(++i));
            }
        }
        System.out.println("String: >" + srcString + "< detected in next lines: " + linesIndexes);
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

}
