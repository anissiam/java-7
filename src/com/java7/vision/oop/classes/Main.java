package com.java7.vision.oop.classes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Student student = new Student();

        System.out.println(student.printData());

        System.out.println("Plz enter id");
        int id = scanner.nextInt();
        Student student1 = new Student(id, "ALi", "CS");

        System.out.println(student1.printData());
        /*Person person = new Person();
        person.name = "sami";
        person.printData();

        person = new Person("sami", 15, 2, 50.0);
        person.printData();

        Person person1 = new Person("Anis", 15, 1, 150);
        person1.printData();

        Person p1 = person1;  //null
        p1.printData();

        Person p2 = new Person();*/



      /*  Person person2 = new Person(10);
        System.out.println(person2.name);*/

        /*object.name = "Anis";
        System.out.println(object.name);
        object.printData();

        Person p1 = new Person();
        p1.printData();

        oooo();
*/
    }

    public static void oooo() {
        Person person = new Person();
    }
}
