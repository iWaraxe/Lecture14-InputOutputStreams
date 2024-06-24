package com.coherentsolutions.java.webauto;

import java.io.*;

public class Ex03CharacterStreamFileCopy {

    public static void main(String[] args) throws IOException {
        FileReader fileIn = null;
        FileWriter fileOut = null;

        try {
            fileIn = new FileReader("file.txt");
            fileOut = new FileWriter("copied_file.txt");

            int a;
            // Copy the content of file.txt
            while ((a = fileIn.read()) != -1) {
                fileOut.write(a);
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