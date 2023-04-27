package com.java7.vision.oop.interfaces.homework;

public class Car {
    private  boolean remoteControl ;
    private int batterySize;
    private double speed;

    public Car() {
    }

    public Car(boolean remoteControl, int batterySize, double speed) {
        this.remoteControl = remoteControl;
        this.batterySize = batterySize;
        this.speed = speed;
    }

    public boolean isRemoteControl() {
        return remoteControl;
    }

    public void setRemoteControl(boolean remoteControl) {
        this.remoteControl = remoteControl;
    }

    public int getBatterySize() {
        return batterySize;
    }

    public void setBatterySize(int batterySize) {
        this.batterySize = batterySize;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "remoteControl=" + remoteControl +
                ", batterySize=" + batterySize +
                ", speed=" + speed +
                '}';
    }
}
