package com.buseduc.javacourse.oop2020.topic_02.task_24_pr;
/**
 * @author pr
 * Тема 2. ОСНОВЫ ООП
 * Задание 24. Перестроить таблицу чисел (4 Х 4), переставляя в ней столбцы так, чтобы сумма модулей элементов в столбцах полученной таблицы возрастала.

 */
import java.util.Arrays;

public class Task_24_pr {
    public static void main(String[] args) {

        //////////////////////////////////////////////////
        int nm = 4;


        int matrix[][] = new int[nm][nm];

        System.out.println(" Table ");

        for(int i = 0; i < nm; i++) {
            for(int j = 0; j < nm; j++) {
                matrix[i][j]=(int) (Math.random() * 100- 45);;
            }
        }

        for(int j = 0; j < nm; j++) {
            System.out.println(  Arrays.toString(matrix[j])); }  System.out.println(" Sum of absolute values ??of the elements in the columns ");

        trm(matrix,nm);

    }

    public static void trm(int[][] m, int dim) {
        int nm=dim;
        int mr[][] = new int[nm][nm];

        int sum[] = new int[nm];
        for(int i = 0; i < nm; i++) {
            sum[i]=sumv (m, i);

        }
        System.out.println(Arrays.toString(sum));
        int[] b = sum.clone();
        Arrays.sort(b);
        System.out.println(" After sorting ");
        System.out.println(Arrays.toString(b));


        for(int i = 0; i < nm; i++) { //
            for(int ii = 0; ii < nm; ii++) { ///
                if (sum[ii]==b[i]) {////
                    //  System.out.println(i + ","+ii);

                    for(int iii = 0; iii < nm; iii++)              {
                        mr[iii][i]=m[iii][ii];

                    }

                }////

            }///

        }  //

        System.out.println(  " Transformed table ");
        for(int j = 0; j < nm; j++) {
            System.out.println( Arrays.toString(mr[j]));
        };

    }
    ///////////////////////konec rot



    //////////////////////////////
    private static int sumv (int[][] matrix, int m){
        int length = matrix.length;

        int result = 0;
        for(int i=0; i < length;i++) {
            result =result+  Math.abs( matrix[i][m]);
        }
        return result;
    }
    ////
}
