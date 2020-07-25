package com.buseduc.javacourse.oop2020.topic_04.task_12_pr;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Arrays;
public class Task_12_pr {
    public static void main(String args[]) throws IOException
    {
        int asd[];
       // asd = new int[75];
        String line1;
        line1 = " ";

        try {
            BufferedReader in = new BufferedReader(new FileReader("test.txt"));
            String line;
            while((line = in.readLine()) != null) {
              //  System.out.println(line);
                line1=line;
            }
            in.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("FILE NOT FOUND");

            // do something to handle the error
        }

        System.out.println(".......................");
        System.out.println(line1);
        line1 = line1.trim();
        System.out.println(".......................");
        System.out.println(line1);//nachaln i konechn probel
        System.out.println("Split any non word ");
        System.out.println(".......................");
        String delims = "\\W+"; // split any non word
        //String delims = " ";
        String[] tokens = line1.split(delims);

        for (String item : tokens) {

            System.out.println(item + " ");
        }
        System.out.println(".......................");
        int size = tokens.length;

        asd = new int[size];

        System.out.println(" The size of the array of words : "+ size);

        for( int i1 = 0; i1 < (size); i1++)
        {asd[i1] = tokens[i1].length();
            System.out.println(asd[i1]+" - The size of the word No  "+ i1);}



        Arrays.sort(asd);
        System.out.println(".......................");
        System.out.println("After sorting");
        System.out.println(Arrays.toString(asd));

       // System.out.println(asd[0] + " "+asd[74]);

        System.out.println(" Shortest words: ");

        for ( int i1 = 0; i1 < size; i1++) {
            if (tokens[i1].length()==asd[0])

                System.out.println(tokens[i1] + " ");
        }
        System.out.println(" Longest words: ");
        for ( int i1 = 0; i1 < size; i1++) {
            if (tokens[i1].length()==asd[size-1])

                System.out.println(tokens[i1] + " ");
        }
    }


}
