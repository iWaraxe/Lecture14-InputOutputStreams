package com.coherentsolutions.java.webauto;

import java.io.*;

public class Ex04ConsoleInputToFile {

    public static void main(String[] args) throws IOException {

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileWriter fileOut = new FileWriter("copied_file.txt");) {

            System.out.println("Enter text to write to file:");
            String someStr = reader.readLine();
            fileOut.write(someStr);
        }
    }
}