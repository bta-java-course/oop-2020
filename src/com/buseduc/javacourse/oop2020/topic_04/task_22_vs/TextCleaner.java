package com.buseduc.javacourse.oop2020.topic_04.task_22_vs;

import java.util.ArrayList;
import java.util.List;

public class TextCleaner {
    public String doClean(String inputText) {
        List<TextElement> result = analyze(inputText);
        result = clean(result);
        String res = "";
        for(TextElement elem: result) {
            res += elem;
        }
        return res;
    }

    List<TextElement> clean(List<TextElement> input) {
        TextElement previous = null;
        List<TextElement> result = new ArrayList<>();
        for(TextElement next : input) {
            if(previous instanceof Space) {
                if(next instanceof Word) {
                    result.add(previous);
                }
            } else if(previous != null){
                result.add(previous);
            }
            previous = next;
        }

        return result;

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
