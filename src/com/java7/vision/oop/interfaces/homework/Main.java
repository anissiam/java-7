package com.java7.vision.oop.interfaces.homework;

public class Main {
    public static void main(String[] args) {
        CarA carA = new CarA();

        CarB carB = new CarB();
        carB.chargeable();
        System.out.println(carB.solarNumber(5));
    }
}
