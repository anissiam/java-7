package com.java7.vision.oop.interfaces;

public class BMW extends Car implements ElecCar{
    private String model;

    public BMW() {
    }

    public BMW(String model) {
        this.model = model;
    }

    public BMW(String name, int price, String model) {
        super(name, price);
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "BMW{" +
                "model='" + model + '\'' +
                '}' + " "+
                super.toString();
    }

    @Override
    public boolean showIsCharging() {
        return isCharging;
    }
}
