package com.buseduc.javacourse.oop2020.topic_04.task_35_pr;
/**
 * @author pr
 * Тема 4.
 * Задание 35. Рассортировать слова текста по возрастанию доли гласных букв (отношение количества гласных к общему количеству букв в слове).

 */
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.ArrayList;

public class Task_35_pr {
    public static void main(String args[]) throws IOException
    {


        String line1;
        line1 = " ";
        try {
            BufferedReader in = new BufferedReader(new FileReader("test.txt"));
            String line;
            while((line = in.readLine()) != null) {

                System.out.println("Text under consideration "+ "\n"+line);
                line1=line;
            }
            in.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("FILE NOT FOUND");
            return;

        }

        line1 = line1.trim();
        System.out.println("After trimming.");
        System.out.println(line1);

        String delims = "\\W+";

        String[] tokens = line1.split(delims);
        System.out.println("Splitted , all non-alphabetic and non-integer characters are removed.");
        for (String item : tokens) {

            System.out.println(item + " ");
        }
        System.out.println(".......................");
        int size = tokens.length;
        System.out.println(" The size of the array of words : "+ tokens.length);

       // for( int i1 = 0; i1 < size; i1++)
       // {

            //System.out.println(tokens[i1].length()+" razmer  slova : "+ i1+","+alp(tokens[i1]));
        //}

        ArrayList<String> tokens_list = new ArrayList<String>(Arrays.asList(tokens));

//        System.out.print(tokens_list);

        System.out.println(" ");
//        System.out.println("............6666...........");
        for( int i1 = size-1; i1>-1; i1--) {
//	System.out.println(i1);
            if(alp(tokens_list.get(i1))==false) { tokens_list.remove(i1); };

        }

        System.out.println("Integers and non-correct words  containing integers  are removed.");
        System.out.println(tokens_list);
        String[] tokens1 = new String[tokens_list.size()];
        tokens_list.toArray(tokens1);

        double ratio[];
        ratio  = new double[tokens1.length];

        for( int i1 = 0; i1 < tokens1.length; i1++)
        {

//            System.out.println(tokens1[i1]+"  N : "+ i1+",  dlina "+tokens1[i1].length()+"  glasn "+glasn(tokens1[i1])+" ratio  "+ ((float) glasn(tokens1[i1])/tokens1[i1].length())     );
            ratio[i1]=((double) glasn(tokens1[i1])/tokens1[i1].length()) ; //System.out.println(ratio[i1]);
        }

        double [] ratio1 = ratio.clone();

        Arrays.sort(ratio1);
      //  System.out.println(Arrays.toString(ratio1));

        String[] tokens_sort = new String[tokens1.length];

        for( int i1 = 0; i1 < tokens1.length; i1++)
        {
            for( int i2 = 0; i2 < tokens1.length; i2++) {

                if (Math.abs(ratio1[i1]-ratio[i2])<0.0000000000001)  {
                    tokens_sort[i1]=tokens1[i2];
                    ratio[i2]=-3; break;}

            }

        }
        System.out.println("Array after sorting: ");
        System.out.println(Arrays.toString(tokens_sort));
        System.out.println("Elements of the transformed array and ratio between a number of vowels and length of words: ");

        for( int i1 = 0; i1 < tokens1.length; i1++)
        {
            System.out.println(i1+", "+ tokens_sort[i1] +", "  +  ratio1[i1]);
        }


    }
    ////////////////////////////end oh main
    public static Boolean alp(String word)
    {
        Boolean  alpha=true;

        int len8= word.length();;
        for(int i = 0; i < len8; i++) {//
            char c = word.charAt(i);


            if(  Character.isAlphabetic(c))
                alpha=true;
            else
            {
                alpha=false;
                break;
            }
        }//
        return  alpha;
    }
    ///////////////////////////////////endof alpha....
    public static int glasn(String inputt5)
    {
        int len5=inputt5.length();
        int amount=0;

        for (int i5 = 0; i5 < len5 ; i5++)
        {


            char c = inputt5.charAt(i5);

            switch (c){
                case 'a':{amount++;     break;}
                case 'A':{amount++;     break;}
                case 'e':{amount++;     break;}
                case 'E':{amount++;     break;}
                case 'Y':{amount++;     break;}
                case 'y':{amount++;     break;}
                case 'U':{amount++;     break;}
                case 'u':{amount++;     break;}
                case 'i':{amount++;     break;}
                case 'I':{amount++;     break;}
                case 'o':{amount++;     break;}
                case 'O':{amount++;     break;}

            }

        }

        System.out.print("\n");
        //  if (amount==0){System.out.println("There is no vowels in this word. ");}
        //  if (amount!=0){System.out.println("The number of vowels is "+amount);}
        //  if (amount!=0){System.out.println("\n");}
        return amount;
    }

    //////////////////////////endamount


































}
