package com.buseduc.javacourse.oop2020.topic_01.task04_RP;

public class PasswordComparator {

    private final String defaultPassword;

    public PasswordComparator(String defaultPassword) {
        this.defaultPassword = defaultPassword;
    }

    public String getDefaultPassword() {
        return defaultPassword;
    }

    public boolean compare(String password) {
        return defaultPassword.equals(password);
    }
}
