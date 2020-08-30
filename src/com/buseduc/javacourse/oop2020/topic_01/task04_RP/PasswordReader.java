package com.buseduc.javacourse.oop2020.topic_01.task04_RP;

import java.util.Scanner;

public class PasswordReader {

    private Scanner scanner;

    public PasswordReader() {
        this.scanner = new Scanner(System.in);
    }

    public String readPassword() {
        System.out.println("Please enter password:");
        return scanner.nextLine();
    }
}