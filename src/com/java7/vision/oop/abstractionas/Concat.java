package com.java7.vision.oop.abstractionas;

public class Concat extends Test{

    @Override
    public void doCode(int x, int y) {
        System.out.println(x + " " + y);
    }

    @Override
    public void printClassName() {
        System.out.println(getClass().getName());
    }
}
