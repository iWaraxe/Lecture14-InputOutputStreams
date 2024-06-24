package com.coherentsolutions.java.webauto;

import java.io.*;
import java.nio.file.*;

public class Ex05SimplerFileRead {

    private static final String FILES_PATH = "src/main/resources/";

    public static void main(String[] args) throws IOException {
        String content = Files.readString(Path.of(FILES_PATH + "file.txt"));
        System.out.println(content);
    }
}