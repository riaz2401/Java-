package com.general;

import java.io.IOException;

public class NotepadOpenInJava {
    public static void main(String[] args) {
        Runtime rs = Runtime.getRuntime();
        try{
            rs.exec("Notepad");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
