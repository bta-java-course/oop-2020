package com.buseduc.javacourse.oop2020.topic_04.task_22_vs;

public class Task22Vs {
    public static void main(String[] args) {
        String text = " dkfj s, dfsdf , dfk      , sdfsd sdf .   ";
        System.out.println("INPUT: " + text);
        TextCleaner textCleaner = new TextCleaner();
        System.out.println("OUTPUT: "  + textCleaner.doClean(text));
    }

}