package com.buseduc.javacourse.oop2020.topic_06.task_01_pr;
import java.util.ArrayList;
import java.util.List;

public class Text {

    private List<Sentence> text = new ArrayList<>();
    private Sentence ttlText;

    public Text() {
    }

    public Text(Sentence sentence, Sentence ttlText) {
        this.ttlText = ttlText;
        text.add(0, this.ttlText);
        text.add(sentence);
    }

    public void addText(Sentence sentence) {
        text.add(sentence);
    }

    public void printText() {
        for (Sentence sentence : text) {
            System.out.println(sentence.toString());
        }
    }

   // @Override
   // public int hashCode() {
     //   String ttl;

       // int hash;
        //int num=text.size();

        //hash = num*7 + (ttlText == null ? 0 : ttlText.hashCode());
        //return hash;
    //}


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Text)) return false;

        Text text1 = (Text) o;

        if (text != null ? !text.equals(text1.text) : text1.text != null) return false;
        return ttlText.equals(text1.ttlText);
    }

    @Override
    public int hashCode() {
        int result = text != null ? text.hashCode() : 0;
        result = 31 * result + ttlText.hashCode();
        return result;
    }
}
