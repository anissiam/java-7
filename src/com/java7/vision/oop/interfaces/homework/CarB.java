package com.java7.vision.oop.interfaces.homework;

public class CarB extends Car implements Solar{
    @Override
    public void chargeable() {
        System.out.println("YEs");
    }

    @Override
    public int solarNumber(int num) {
        return num;
    }


}
