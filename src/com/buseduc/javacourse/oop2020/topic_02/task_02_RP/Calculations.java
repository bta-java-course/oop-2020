package com.buseduc.javacourse.oop2020.topic_02.task_02_RP;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Calculations {

    public List<String> readFile() {
        List<String> numbers = new ArrayList<>();

        try (BufferedReader in = new BufferedReader(new FileReader(new File("OOP/numbers.txt")))) {
            String line;
            while ((line = in.readLine()) != null) {
                numbers.add(line);
            }

        } catch (FileNotFoundException e) {
            System.out.println("FILE NOT FOUND"); // do something to handle the error
        } catch (IOException e) {
            System.out.println("Failed to open  file"); // do something to handle the error
        }

        return numbers;
    }

    public List<String> sortNumbers(List<String> numbers) {

        numbers.sort(new Comparator<String>() {
            @Override
            public int compare(String left, String right) {
                if (left.equals(right)) {
                    return 0;
                }

                if (left.length() > right.length()) {
                    return -1;
                } else {
                    return 1;
                }
            }
        });

        return numbers;
    }

}
