package com.java7.vision.oop.theads;

public class MakeThreadRun implements Runnable{

    private String name;
    @Override
    public void run() {
        System.out.println(getName());
        for (int i = 0; i < 10000; i++) {
            System.out.println(i);
            try {
                Thread.sleep(500);

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
