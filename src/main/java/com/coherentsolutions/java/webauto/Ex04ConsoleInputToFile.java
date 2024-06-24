package com.coherentsolutions.java.webauto;

import java.io.*;

public class Ex04ConsoleInputToFile {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileWriter fileOut = null;

        try {
            System.out.println("Enter text to write to file:");
            String someStr = reader.readLine();
            fileOut = new FileWriter("copied_file.txt");
            fileOut.write(someStr);
        } finally {
            reader.close();
            if (fileOut != null) {
                fileOut.close();
            }
        }
    }
}