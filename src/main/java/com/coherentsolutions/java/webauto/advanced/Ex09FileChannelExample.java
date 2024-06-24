package com.coherentsolutions.java.webauto.advanced;

import java.io.*;
import java.nio.channels.FileChannel;

public class Ex09FileChannelExample {

    public static void main(String[] args) {
        try (FileChannel src = new FileInputStream("file.txt").getChannel();
             FileChannel dest = new FileOutputStream("file_copy.txt").getChannel()) {

            // Copying data from source file to destination file using FileChannel
            dest.transferFrom(src, 0, src.size());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}