package com.java7.vision.oop.inhr;

public class Superman extends Person{
    private String power;
    public void setPower(String power) {
        this.power = power;
    }

    public void superPower(){
        System.out.println(power);
    }

    @Override
    public void printData() {
        System.out.println(power);

    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "Superman{" +
                "power='" + power + '\'' +
                '}';
    }
}
