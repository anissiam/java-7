package com.java7.vision.oop.exp;

import com.java7.vision.oop.enc.Student;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static Student student;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            int x = scanner.nextInt();
            //int x = 10 / 0;
            System.out.println(student.printStudent()); //Throw

        }catch (ArithmeticException e){
            System.out.println(e);

        }catch (NullPointerException e){
            System.out.println(e);
            student = new Student();

            return;
        }catch (InputMismatchException e){
            System.out.println(e);
        }finally {
            System.out.println("Final");
        }

        System.out.println("Done");

    }
}
