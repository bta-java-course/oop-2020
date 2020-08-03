package com.buseduc.javacourse.oop2020.topic_06.task_01_pr;

/**
 * Тема 6.
 * Задание 1. Создать объект класса Текст, используя классы Предложение, Слово. Методы:
 * дополнить текст, вывести на консоль текст, заголовок текста.
 */

public class Task_01_pr {
    public static void main(String[] args) {

        Word word = new Word("Aaaaa");
        Word word1 = new Word("bbbbb");
        Word word2 = new Word("ccccc");
        Word word3 = new Word("ddddd");
        Word word4 = new Word(word2);
        Word word5 = new Word(word1);

        Word tck = new Word(".");
        Word zpt = new Word(",");
        Word vopr = new Word("?");
        Word vskl = new Word("!");

        Sentence predl1=new Sentence();
        predl1.addWord(word);
        predl1.addWord(word1);
        predl1.addWord(word2);
        predl1.addWord(word3);
        predl1.addWord(zpt);
        predl1.addWord(word4);
        predl1.addWord(word5);
        predl1.addWord(tck);

        Sentence predl2=new Sentence();
        predl2.addWord(word);
        predl2.addWord(word1);
        predl2.addWord(word2);
        predl2.addWord(word3);
        predl2.addWord(word4);
        predl2.addWord(word5);
        predl2.addWord(vopr);

        System.out.println("Sentence 1");
        System.out.println(predl1.toString());
        System.out.println(".................................");
        System.out.println("Sentence 2 ");
        System.out.println(predl2.toString());
        System.out.println(".................................");

        Sentence titleText=new Sentence();
        Word title = new Word("Title");
        System.out.println("Title ");

        titleText.addWord(title);
        System.out.println(titleText.toString());
        System.out.println(".................................");
        System.out.println("Text ");
        Text text1= new Text(predl1, titleText);
        text1.addText(predl2);
        text1.printText();

        System.out.println("............Hash code of the text.....................");
        System.out.println(text1.hashCode());

    }

}
