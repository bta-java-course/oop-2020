package com.buseduc.javacourse.oop2020.topic_04.task_22_vs;

public class TextElement {
    private String content;

    public TextElement(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return content;
    }
}
