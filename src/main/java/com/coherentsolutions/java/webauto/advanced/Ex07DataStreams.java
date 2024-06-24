package com.coherentsolutions.java.webauto.advanced;

import java.io.*;

public class Ex07DataStreams {

    public static void main(String[] args) throws IOException {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("data_output.txt"));
             DataInputStream dis = new DataInputStream(new FileInputStream("data_output.txt"))) {

            // Writing primitive data types to the file
            dos.writeInt(123);
            dos.writeFloat(4.56f);
            dos.writeUTF("Hello, World!");

            // Reading the data back
            System.out.println(dis.readInt());
            System.out.println(dis.readFloat());
            System.out.println(dis.readUTF());
        }
    }
}