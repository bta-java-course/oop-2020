package com.buseduc.javacourse.oop2020.topic_04.task_40_pr;
/**
 * @author pr
 * Тема 4.
 * Задание 40. Из текста удалить все слова заданной длины, начинающиеся на согласную букву.

 */

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.ArrayList;

public class Task_40_pr {
    public static void main(String args[]) throws IOException
    {

                String line1=inp("test.txt");
                line1 = line1.trim();
              String delims = " "; // split any non word

                String[] tokens = line1.split(delims);
                System.out.println(" Size of text : "+ tokens.length);
                int lengthToRemove=4;
                System.out.println(" Size of word to be removed: "+ lengthToRemove );

                int t=0;
             for (String item : tokens) {t++;
              if (t==23) {System.out.print(" \n"); t=0;}
               item = item.trim();
          System.out.print(item + " ");
        }
                int size = tokens.length;

                ArrayList<String> tokens_list = new ArrayList<String>(Arrays.asList(tokens));
     //          System.out.print(tokens_list);
                System.out.println(" ");

               for( int i1 = size-1; i1>-1; i1--) {

                if(tokens_list.get(i1).length()==0) { tokens_list.remove(i1); };
               }

               size=tokens_list.size();

                for( int i1 = size-1; i1>-1; i1--) {
                    if(soglasn(tokens_list.get(i1)) & (tokens_list.get(i1).length()==lengthToRemove)) { tokens_list.remove(i1); };
                }

                size=tokens_list.size();

                for( int i1 = size-1; i1>-1; i1--) {

                    int tmp= tokens_list.get(i1).length() -1;

                    if(  (soglasn(tokens_list.get(i1))  &   (tokens_list.get(i1).length()==(lengthToRemove+1))) ) {

                        tmp= tokens_list.get(i1).length() -1;

                        char tmpchar;
                        tmpchar=tokens_list.get(i1).charAt(tmp);
                        if ( Character.isAlphabetic(tmpchar)==false) {tokens_list.remove(i1);}
                    }
                }

                String[] tokens1 = new String[tokens_list.size()];
                tokens_list.toArray(tokens1);
                 t=0;
        System.out.print("\n The text after transformation: \n ");
                for (String item : tokens1) {t++;
                    if (t==23) {System.out.print(" \n"); t=0;}

                    System.out.print(item + " ");
                }
            }

            public static String inp(String fileName) throws IOException
            {
                String line1=null;
                try {
                    BufferedReader in = new BufferedReader(new FileReader(fileName));
                    String line;
                    while((line = in.readLine()) != null) {
               System.out.println(line);
                        line1=line;
                    }
                    in.close();
                }
                catch (FileNotFoundException e) {
                    System.out.println("FILE NOT FOUND");

                }
                //
                return  line1;
            }

            public static Boolean soglasn(String input)
            {

                Boolean a=false;

                char c = input.charAt(0);

                switch (c){
                    case 'b':{a=true;     break;}
                    case 'B':{a=true;     break;}
                    case 'c':{a=true;     break;}
                    case 'C':{a=true;     break;}
                    case 'd':{a=true;     break;}
                    case 'D':{a=true;     break;}
                    case 'f':{a=true;     break;}
                    case 'F':{a=true;     break;}
                    case 'g':{a=true;     break;}
                    case 'G':{a=true;     break;}
                    case 'h':{a=true;     break;}
                    case 'H':{a=true;     break;}
                    case 'q':{a=true;     break;}
                    case 'Q':{a=true;     break;}
                    case 'w':{a=true;     break;}
                    case 'W':{a=true;     break;}
                    case 'r':{a=true;     break;}
                    case 'R':{a=true;     break;}
                    case 't':{a=true;     break;}
                    case 'T':{a=true;     break;}
                    case 'p':{a=true;     break;}
                    case 'P':{a=true;     break;}
                    case 's':{a=true;     break;}
                    case 'S':{a=true;     break;}
                    case 'j':{a=true;     break;}
                    case 'J':{a=true;     break;}
                    case 'k':{a=true;     break;}
                    case 'K':{a=true;     break;}
                    case 'l':{a=true;     break;}
                    case 'L':{a=true;     break;}
                    case 'z':{a=true;     break;}
                    case 'Z':{a=true;     break;}
                    case 'x':{a=true;     break;}
                    case 'X':{a=true;     break;}
                    case 'v':{a=true;     break;}
                    case 'V':{a=true;     break;}
                    case 'n':{a=true;     break;}
                    case 'N':{a=true;     break;}
                    case 'm':{a=true;     break;}
                    case 'M':{a=true;     break;}
                }

                return a;
            }

        }

