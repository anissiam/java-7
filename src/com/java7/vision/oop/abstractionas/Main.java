package com.java7.vision.oop.abstractionas;

public class Main {
    public static void main(String[] args) {
        Concat concat = new Concat();
        concat.doCode(10, 10);
        concat.printClassName();

        Addition addition = new Addition();
        addition.doCode(10, 10);
        addition.printClassName();


        //FastBMW fastBMW = new FastBMW();
    }
}
