package com.buseduc.javacourse.oop2020.topic_05.task_03_pr;
/**
 * @author pr
 * Тема 5.
 * Задание 3. В каждой строке найти слова, начинающиеся с гласной буквы.

 */

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Task_03_pr {



    public static void main(String[] args) throws
            FileNotFoundException {

        File test1 = new File("test53.txt");
        Scanner scan = new Scanner(test1);
        String tmp;
        tmp=null;
        ///////////////////////

        while(scan.hasNextLine())
        {

            tmp=scan.nextLine();
            System.out.println(tmp);

        }

        ////////////////////////

        Scanner scan1 = new Scanner(test1);
        String delims = "\\W+";
        int count=0;

        while(scan1.hasNextLine())
        {

            count++;

            System.out.println("Line: "+count);

            tmp=scan1.nextLine();
            System.out.println(tmp);
            String[] tokens = tmp.split(delims);

            for (int i=0; i< tokens.length-1; i++) {

                if (glasn1(tokens[i]))	{System.out.println(tokens[i]);}

            }

        }

    }

    public static Boolean glasn1(String input)
    {

        Boolean a=false;

        char c = input.charAt(0);

        switch (c){
            case 'e':{a=true;     break;}
            case 'E':{a=true;     break;}
            case 'y':{a=true;     break;}
            case 'Y':{a=true;     break;}
            case 'u':{a=true;     break;}
            case 'U':{a=true;     break;}
            case 'i':{a=true;     break;}
            case 'I':{a=true;     break;}
            case 'o':{a=true;     break;}
            case 'O':{a=true;     break;}
            case 'a':{a=true;     break;}
        }

        return a;
    }

}
