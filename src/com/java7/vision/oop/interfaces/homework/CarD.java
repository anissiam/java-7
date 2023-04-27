package com.java7.vision.oop.interfaces.homework;

public class CarD extends Car implements Solar100{
    @Override
    public void chargeable() {

    }

    @Override
    public int solarNumber(int num) {
        return 0;
    }

    @Override
    public void printPower() {
        System.out.println(power);
    }
}
