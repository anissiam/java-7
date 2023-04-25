package com.java7.vision.oop.interfaces;

public class CleaverStudent extends Student  implements Cleaver{
    @Override
    public void showIQ() {
        System.out.println(IQ);
    }
}
