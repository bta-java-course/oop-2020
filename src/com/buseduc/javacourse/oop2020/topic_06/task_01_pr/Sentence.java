package com.buseduc.javacourse.oop2020.topic_06.task_01_pr;

public class Sentence {

    private String predl="";

    public Sentence() {  }

    public Sentence(String predl) {  predl=""; }

    public Sentence(Sentence snt) {
        this.predl=snt.predl;
    }

    ///metody
    public void addWord(Word word) {

        if ((word.getWord().equals(".")) || (word.getWord().equals(",")) || (word.getWord().equals("!")) || (word.getWord().equals("?")) )   {predl =predl+word.getWord();}
        else {predl =predl+" " + word.getWord();}
    }

    public String getSentence() {
        return predl;
    }

    public String toString()
    {
        return  getSentence();
    }

    @Override
    public int hashCode() {
        int hash;
        char a;
        a=predl.charAt(0);
        int num = a;
        hash = num*predl.length()*7 + (predl == null ? 0 : predl.hashCode());
        return hash;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Sentence))
            return false;
        Sentence other = (Sentence) o;
        String st0= this.getSentence().replaceAll("\\s+","");
        String st =      other.getSentence().replaceAll("\\s+","");

        boolean sentEquals = (this.predl == null && other.predl == null)
                || (this.predl != null && st.equals(st0));

        return sentEquals ;
    }

}
