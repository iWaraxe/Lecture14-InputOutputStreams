package com.coherentsolutions.java.webauto;

import java.io.*;

public class Ex02FileCopyWithResources {

    public static void main(String[] args) throws IOException {
        try (FileInputStream fileIn = new FileInputStream("file.txt");
             FileOutputStream fileOut = new FileOutputStream("copied_file.txt")) {

            int a;
            // Copy the content of file.txt
            while ((a = fileIn.read()) != -1) {
                fileOut.write(a); // Read content from file.txt and write to copied_file.txt
            }
        }
    }
}