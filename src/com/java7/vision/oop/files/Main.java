package com.java7.vision.oop.files;

import com.java7.vision.oop.enc.Student;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {
        //File file = new File("Hello.txt");
        //File file = new File("Hello1.txt");
        File file = new File("Hello2.txt");
        if (!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        /*Student student = new Student("Sami", "CS", 20);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(student);
            objectOutputStream.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
*/

        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Student student =  (Student) objectInputStream.readObject();
            System.out.println(student.printStudent());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


       /* try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write("Hello from java".getBytes());
            fileOutputStream.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/


       /* try {
            FileInputStream fileInputStream = new FileInputStream(file);
            int c = fileInputStream.read();
            while (c!=-1){
                System.out.print((char) c);
                c = fileInputStream.read();
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/


        //System.out.println(file.getAbsoluteFile());
        //file.delete();

       /* char[] cc = {'a', 'b', 'c'};
        try {
            FileWriter fileWriter = new FileWriter(file);
           // fileWriter.write(70);
            fileWriter.write("Hello form java\n");
            fileWriter.write(cc);
           *//* fileWriter.write('c');
            fileWriter.write(cc);*//*
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
*/

        /*try {
            FileReader fileReader = new FileReader(file);
            int c = fileReader.read();
            while (c!=-1){
                System.out.print((char) c);
                c = fileReader.read();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/

    }
}
