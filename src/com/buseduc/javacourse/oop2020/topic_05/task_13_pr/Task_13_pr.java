package com.buseduc.javacourse.oop2020.topic_05.task_13_pr;

import java.io.IOException;
import java.util.Arrays;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.File;

public class Task_13_pr {

    public static void main(String args[]) throws IOException
    {

        int[] arr;
        int nar=10;
        arr = new int[nar];

        for( int i1 = 0; i1<nar; i1++) {
            arr[i1]=(int) (Math.random() * 3000 - 1000);

        }

        System.out.println(Arrays.toString(arr));
        System.out.println("Random numbers are generated.");

        FileWriter stream = new FileWriter("out.txt");

        PrintWriter out = new PrintWriter(stream);

        for( int i1 = 0; i1<nar; i1++) {

            out.println(arr[i1]);

        }

        out.close();

        System.out.println("Random numbers are written to file out.txt.");

        Scanner scanner = new Scanner(new File("out.txt"));
        int [] arr1 = new int [10];
        int i = 0;
        while(scanner.hasNextInt()){
            arr1[i++] = scanner.nextInt();
        }

        System.out.println("Random numbers are read from file out.txt.");
        /////////////////////////////////

        System.out.println(Arrays.toString(arr1));

        Arrays.sort(arr1);

        System.out.println("Random numbers are in ascending  order.");
        System.out.println(Arrays.toString(arr1));

    }

}
