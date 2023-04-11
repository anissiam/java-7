package com.java7.vision.oop.inhr.shapeExample;

public class Main {
    public static void main(String[] args) {

        Squre squre = new Squre(10, 10);
        System.out.println(squre.area());
        System.out.println(squre.prameter());


        Circle circle = new Circle( 10);
        System.out.println(circle.area());
        System.out.println(circle.prameter());
    }
}
