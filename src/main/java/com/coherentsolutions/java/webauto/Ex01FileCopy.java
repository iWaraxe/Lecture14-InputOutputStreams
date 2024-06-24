package com.coherentsolutions.java.webauto;

import java.io.*;

public class Ex01FileCopy {

    public static void main(String[] args) throws IOException {
        FileInputStream fileIn = null;
        FileOutputStream fileOut = null;

        try {
            fileIn = new FileInputStream("file.txt");
            fileOut = new FileOutputStream("copied_file.txt");

            int a;
            // Copy the content of file.txt
            while ((a = fileIn.read()) != -1) {
                fileOut.write(a); // Read content from file.txt and write to copied_file.txt
            }
        } finally {
            if (fileIn != null) {
                fileIn.close();
            }
            if (fileOut != null) {
                fileOut.close();
            }
        }
    }
}