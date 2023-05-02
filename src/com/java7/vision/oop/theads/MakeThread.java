package com.java7.vision.oop.theads;

public class MakeThread extends Thread{
    @Override
    public void run() {
        super.run();
        System.out.println(getName());
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(500);

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
