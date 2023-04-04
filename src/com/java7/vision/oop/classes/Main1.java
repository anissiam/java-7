package com.java7.vision.oop.classes;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Car car = new Car();
        car.speed = 100;
        car.type = "dsads";
        car.color = "Red";
        car.name = "BMW";

        System.out.println(car.printData());
        car.convertSpeed();
        car.printSpeed();

        System.out.println("Plz enter speed");
        int speed = scanner.nextInt();
        Car car1 = new Car(speed, "Blue", "zsfdz", "Ford");
        car1.printSpeed();
        speed = scanner.nextInt();

        car1.speed = speed;
        System.out.println(car1.printData());


    }

    public static void convertSpeed(int speed) {
        double converter = speed * 0.621371;
        System.out.println(converter + " Miles");
    }
}
