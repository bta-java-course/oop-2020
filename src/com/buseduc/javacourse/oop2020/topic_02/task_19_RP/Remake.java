package com.buseduc.javacourse.oop2020.topic_02.task_19_RP;

import java.util.ArrayList;
import java.util.List;

public class Remake {
    public static void main(String[] args) {
//        int[][] matrix = {{0, 1, 1, 1}, {1, 1, 1, 1}, {0, 1, 0, 1}, {0, 1, 0, 2}};
        int[][] matrix = {{0, 7, 1, 1, 4, 5}, {0, 7, 1, 1, 4, 5}, {0, 7, 0, 1, 4, 5}, {0, 7, 0, 2, 4, 5}};


        Calculations.printMatrix(matrix);

        matrix = trimAllColumns(matrix);
        matrix = trimAllRows(matrix);
    }

    public static int[][] trimAllRows(int[][] matrix) {
        List<Integer> similarRows = findSimilarRows(matrix);
        int[][] trimmedMatrixByRows = trimRows(matrix, similarRows);

        System.out.println("Trimmed rows");
        Calculations.printMatrix(trimmedMatrixByRows);
        return trimmedMatrixByRows;
    }

    public static int[][] trimAllColumns(int[][] matrix) {
        List<Integer> similarColumns = findSimilarColumns(matrix);
        int[][] trimmedMatrixByColumns = trimColumns(matrix, similarColumns);

        System.out.println("Trimmed columns");
        Calculations.printMatrix(trimmedMatrixByColumns);
        return trimmedMatrixByColumns;
    }

    private static int[][] trimRows(int[][] matrix, List<Integer> indexes) {
        int numberOfRows = matrix.length - indexes.size();
        int numberOfColumns = matrix[0].length;

        int[][] trimmed = new int[numberOfRows][numberOfColumns];

        int newRow = 0;
        for (int row = 0; row < matrix.length; row++) {
            if (!indexes.contains(row)) {
                for (int column = 0; column < matrix[0].length; column++) {
                    trimmed[newRow][column] = matrix[row][column];
                }
                newRow++;
            }
        }

        return trimmed;
    }

    private static int[][] trimColumns(int[][] matrix, List<Integer> indexes) {
        int numberOfRows = matrix.length;
        int numberOfColumns = matrix[0].length - indexes.size();

        int[][] trimmed = new int[numberOfRows][numberOfColumns];

        for (int row = 0; row < matrix.length; row++) {
            int newColumn = 0;
            for (int column = 0; column < matrix[0].length; column++) {
                if (!indexes.contains(column)) {
                    trimmed[row][newColumn] = matrix[row][column];
                    newColumn++;
                }
            }
        }

        return trimmed;
    }

    public static List<Integer> findSimilarRows(int[][] matrix) {
        List<Integer> similarIndexes = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {
            if (isRowSimilar(matrix[i])) {
                similarIndexes.add(i);
            }
        }
        System.out.println("Indexes of rows with identical elements " + similarIndexes.toString());
        return similarIndexes;
    }

    private static boolean isRowSimilar(int[] matrix) {
        int first = matrix[0];

        for (int elem : matrix) {
            if (first != elem) {
                return false;
            }
        }

        return true;
    }

    public static List<Integer> findSimilarColumns(int[][] matrix) {
        List<Integer> similarColumns = new ArrayList<>();

        for (int i = 0; i < matrix[0].length; i++) {
            if (isColumnSimilar(i, matrix)) {
                similarColumns.add(i);
            }
        }
        System.out.println("Indexes of columns with identical elements " + similarColumns.toString());
        return similarColumns;
    }

    private static boolean isColumnSimilar(int indexOfColumn, int[][] matrix) {
        int first = matrix[0][indexOfColumn];

        for (int row = 0; row < matrix.length; row++) {
            if (first != matrix[row][indexOfColumn]) {
                return false;
            }
        }

        return true;
    }

    private static boolean isColumnSimilar(int[] matrix) {
        int first = matrix[0];

        for (int elem : matrix) {
            if (first != elem) {
                return false;
            }
        }

        return true;
    }
}


