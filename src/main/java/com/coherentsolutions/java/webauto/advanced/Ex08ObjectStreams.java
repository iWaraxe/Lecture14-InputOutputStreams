package com.coherentsolutions.java.webauto.advanced;

import java.io.*;

public class Ex08ObjectStreams {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("object_output.txt"));
             ObjectInputStream ois = new ObjectInputStream(new FileInputStream("object_output.txt"))) {

            // Creating a sample object
            Person person = new Person("John", 30);

            // Writing object to the file
            oos.writeObject(person);

            // Reading the object back
            Person readPerson = (Person) ois.readObject();
            System.out.println(readPerson);
        }
    }
}

class Person implements Serializable {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}