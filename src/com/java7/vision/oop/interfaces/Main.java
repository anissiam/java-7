package com.java7.vision.oop.interfaces;

public class Main {
    public static void main(String[] args) {

        String a = "Anis";
        String b = "sami";
        b = a;


        //String c = new String("Anis");
        System.out.println(a.equals(b));
        a = "Ahmad";

        System.out.println(b);

        BMW bmw = new BMW("BMW", 200, "2020");
        System.out.println(bmw.toString());
        System.out.println(bmw.showIsCharging());
        /*Person person = new Person("Sami", 10, "11111");

        Student student = new Student();
        student.printSuper();
        System.out.println(student.toString());


        CleaverStudent cleaverStudent = new CleaverStudent();
        cleaverStudent.showIQ();
*/

    }
}
