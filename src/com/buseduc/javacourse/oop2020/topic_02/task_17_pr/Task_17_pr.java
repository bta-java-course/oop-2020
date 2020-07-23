package com.buseduc.javacourse.oop2020.topic_02.task_17_pr;
/**
 * @author pr
 * Тема 2. ОСНОВЫ ООП
 * Задание 17. Повернуть таблицу чисел (4 Х 4) на 90,180, 270 градусов.

 */
import java.util.Arrays;
public class Task_17_pr {

    public static void main(String[] args) {
        //////////////////////////////////////////////////
        int nm = 4;

        int matrix[][] = new int[nm][nm];

        System.out.println(" MATRIX ");

        for(int i = 0; i < nm; i++) {
            for(int j = 0; j < nm; j++) {
                matrix[i][j]= i+j;
            }
        }

        for(int j = 0; j < nm; j++) {
            System.out.println(

                    " Array: "

                            + Arrays.toString(matrix[j]));
        }

        matrix=rot(matrix,nm);
        System.out.println(  " Rotation by 90 degrees: ");

        for(int j = 0; j < nm; j++) {
            System.out.println( Arrays.toString(matrix[j])); }

        matrix=rot(matrix, nm);
        System.out.println(  " Rotation by 180 degrees: ");

        for(int j = 0; j < nm; j++) {
            System.out.println(Arrays.toString(matrix[j])); }

        matrix=rot(matrix, nm);
        System.out.println(  " Rotation by 270 degrees: ");
        for(int j = 0; j < nm; j++) {
            System.out.println(Arrays.toString(matrix[j])); }
        ////////////////////////////////////////////
    }
    public static int[][] rot(int[][] m, int dim) {
        int nm=dim;
        int mr[][] = new int[nm][nm];



        for(int i = 0; i < nm; i++) {
            for(int j = 0; j < nm; j++) {
                mr[i][j]= m[3-j][i];
            }

        }

        return mr;
    }
    ///////////////

}
