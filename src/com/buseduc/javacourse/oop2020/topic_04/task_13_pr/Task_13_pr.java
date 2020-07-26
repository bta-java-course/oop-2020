package com.buseduc.javacourse.oop2020.topic_04.task_13_pr;
/**
 * @author pr
 * Тема 4.
 * Задание 13. В тексте найти буквы, которые встречаются во всех словах.

 */
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Arrays;

public class Task_13_pr {

    public static void main(String args[]) throws IOException
    {

        String line1;
        line1 = " ";

        try {
            BufferedReader in = new BufferedReader(new FileReader("testT.txt"));
            String line;
            while((line = in.readLine()) != null) {
                //  System.out.println(line);
                line1=line;
            }
            in.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("FILE NOT FOUND");
            return;

        }

        p1(line1);

    }

    public static void p1(String line )
    {

        line = line.trim();
        System.out.println(".......................");
        System.out.println(line);

        System.out.println(".......................");
        String delims = "\\W+"; // split any non word

        String[] tokens = line.split(delims);

        for (String item : tokens) {

            System.out.println(item + " ");
        }
        System.out.println(".......................");
        int size = tokens.length;

        System.out.println(" The size of the array of words : "+ size);
        System.out.println(".......................");

        for(char i = 'A';i<='Z';i++)
        {
            // System.out.println(i);
            int stch=0;

            for( int j = 0; j < (size); j++)
            {
                String s = String.valueOf(i);

                if(tokens[j].contains(s)){ stch++;

                }

            }

            if (size==stch) {System.out.println(" All words of this text contain: "+ i);}

        }
        ////////////////////
        for(char i2 = 'a';i2<='z';i2++)
        {
            // System.out.println(i2);
            int stch=0;

            for( int j = 0; j < (size); j++)
            {
                String s = String.valueOf(i2);

                if(tokens[j].contains(s)){ stch++;}

            }

            if (size==stch) {System.out.println(" All words of this text contain: " + i2);}

        }

    }




}
