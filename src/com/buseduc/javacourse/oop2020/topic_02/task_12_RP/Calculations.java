package com.buseduc.javacourse.oop2020.topic_02.task_12_RP;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Calculations {

    public List<Integer> readFile() {
        List<Integer> numbers = new ArrayList<>();

        try (BufferedReader in = new BufferedReader(new FileReader(new File("OOP/task_12.txt")))) {
            String line;
            while ((line = in.readLine()) != null) {
                numbers.add(Integer.parseInt(line));
            }

        } catch (FileNotFoundException e) {
            System.out.println("FILE NOT FOUND"); // do something to handle the error
        } catch (IOException e) {
            System.out.println("Failed to open  file"); // do something to handle the error
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

    public int[][] fillArray2(List<Integer> numbers) {
        final int size = 4;

        Iterator<Integer> iterator = numbers.iterator();

        int[][] matrix = new int[size][size];
        for (int col = 0; col < size; col++) {
            for (int row = 0; row < size; row++) {
                matrix[row][col] = iterator.next();
            }
        }

        System.out.println(Arrays.deepToString(matrix));
        return matrix;
    }


    public void printMatrix(int[][] matrix) {

        for (int[] row : matrix) {
            for (int elem : row) {
                System.out.print(elem + "\t");
            }
            System.out.println();
        }
    }
}
