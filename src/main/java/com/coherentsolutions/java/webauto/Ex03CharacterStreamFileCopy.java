package com.coherentsolutions.java.webauto;

import java.io.*;

public class Ex03CharacterStreamFileCopy {

    public static void main(String[] args) throws IOException {

        try(FileReader fileIn = new FileReader("file.txt");
            FileWriter fileOut = new FileWriter("copied_file.txt")) {

            int a;
            // Copy the content of file.txt
            while ((a = fileIn.read()) != -1) {
                fileOut.write(a);
            }
        }
    }
}