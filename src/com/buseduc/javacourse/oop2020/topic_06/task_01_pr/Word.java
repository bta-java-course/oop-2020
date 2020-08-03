package com.buseduc.javacourse.oop2020.topic_06.task_01_pr;

public class Word {
    String slovo;

    public Word(String slovo)
    {
        this.slovo=slovo;
    }

    public String getWord() {
        return slovo;
    }

    public void setSlovo(String slovo) {
        this.slovo = slovo;
    }

    public String toString()
    {
        return  "'" + getWord() + "'";
    }

    public Word(Word slovo1) {

        this.slovo=slovo1.slovo;

    }

    @Override
    public int hashCode() {
        int hash;
        char a;
        a=slovo.charAt(0);
        int num = a;
        hash = num*slovo.length()*7 + (slovo == null ? 0 : slovo.hashCode());
        return hash;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Word))
            return false;
        Word other = (Word) o;
        String slovoComp=slovo.toLowerCase();
        String otherslovoComp=other.slovo.toLowerCase();

        boolean slovoEquals = (this.slovo == null && other.slovo == null)
                || (this.slovo != null && slovoComp.equals(otherslovoComp));

        return slovoEquals ;
    }

}
