package com.coherentsolutions.java.webauto.advanced;

import java.io.*;

public class Ex06BufferedStreams {

    public static void main(String[] args) throws IOException {
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream("file.txt"));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("buffered_copied_file.txt"))) {

            int a;
            // Copy the content of file.txt using buffered streams
            while ((a = bis.read()) != -1) {
                bos.write(a);
            }
        }
    }
}