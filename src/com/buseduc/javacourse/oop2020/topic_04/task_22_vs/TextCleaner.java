package com.buseduc.javacourse.oop2020.topic_04.task_22_vs;

import java.util.ArrayList;
import java.util.List;

public class TextCleaner {
    public String doClean(String inputText) {
        System.out.println(analyze(inputText).toString());
        return inputText;
    }

    List<TextElement> analyze(String inputText) {
        List<TextElement> result = new ArrayList<>();
        String nextWord = "";
        for(char next : inputText.toCharArray()) {
            if(Character.isAlphabetic(next)) {
                nextWord += next;
            } else {
                if (nextWord != null && nextWord.length() > 0) {
                    result.add(new Word(nextWord));
                    nextWord = "";
                }
                if (next == ' ') {
                    result.add(new Space());
                } else {
                    result.add(new PunktMark(String.valueOf(next)));
                }
            }
        }
        return result;
    }
}
