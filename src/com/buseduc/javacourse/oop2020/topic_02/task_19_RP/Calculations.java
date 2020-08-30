package com.buseduc.javacourse.oop2020.topic_02.task_19_RP;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Calculations {

    public void writeFile() {

        try (FileWriter writer = new FileWriter("OOP/task_19.txt", false)) {

            for (int i = 0; i < 16; i++) {

                int a = (int) (Math.random() * 4);
                String s = Integer.toString(a);

                if (i < 15) {
                    writer.write(s);
                    writer.append('\n');
                } else {
                    writer.write(s);
                }
            }
            writer.flush();
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }

    public List<Integer> readFile() {
        List<Integer> numbers = new ArrayList<>();

        try (BufferedReader in = new BufferedReader(new FileReader(new File("OOP/task_19.txt")))) {
            String line;
            while ((line = in.readLine()) != null) {
                numbers.add(Integer.parseInt(line));
            }

        } catch (FileNotFoundException e) {
            System.out.println("FILE NOT FOUND");
        } catch (IOException e) {
            System.out.println("Failed to open  file");
        }

        return numbers;
    }

    public int[][] fillArray(List<Integer> numbers) {
        final int size = 4;

        Iterator<Integer> iterator = numbers.iterator();

        int[][] matrix = new int[size][size];
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                matrix[row][col] = iterator.next();
            }
        }

        System.out.println(Arrays.deepToString(matrix));
        return matrix;
    }

    public static void printMatrix(int[][] matrix) {

        for (int[] row : matrix) {
            for (int elem : row) {
                System.out.print(elem + "\t");
            }
            System.out.println();
        }
    }

}
