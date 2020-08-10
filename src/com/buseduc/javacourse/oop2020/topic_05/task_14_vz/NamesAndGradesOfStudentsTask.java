package com.buseduc.javacourse.oop2020.topic_05.task_14_vz;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class NamesAndGradesOfStudentsTask {

    /**
     * @author vz
     * Тема 5. ТИПЫ И ОПЕРАТОРЫ
     * Задание 14.
     * В файле, содержащем фамилии студентов и их оценки, записать прописными буквами фамилии тех студентов,
     * которые имеют средний балл более n.
     */

    public static void main(final String[] args) throws IOException {
        writeToFile();
    }

    private static void writeToFile() throws IOException {
        Scanner sc = new Scanner(new File("in.txt"));
        PrintWriter pw = new PrintWriter(new File("out.txt"));
        String[] student;
        while (sc.hasNextLine()) {
            student = sc.nextLine().split("\\s+");
            double sum = 0;
            for ( int i = 1; i < student.length; i++ ) {
                sum += Integer.parseInt(student[i]);
            }
            if (sum / (student.length - 1) > 3) {
                pw.println(student[0].toUpperCase());
            }
        }
        sc.close();
        pw.close();
    }
}
