package com.java7.vision.oop.play.calcEx;

public class Main {
    public static void main(String[] args) {
        Addition addition = new Addition();
        doCalc(addition,10,10);

        Sub sub = new Sub();
        doCalc(sub, 10, 10);


    }

    public static void doCalc(Calc calc , int x , int y) {
        calc.test(x,y);
    }
}
