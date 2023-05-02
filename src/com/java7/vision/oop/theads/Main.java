package com.java7.vision.oop.theads;

public class Main {
    public static void main(String[] args) {

        /*new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("T1");
                for (int i = 0; i < 1000; i++) {
                    try {
                        Thread.sleep(500);
                        System.out.println(i);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                }
            }
        }).start();



        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("T2");
                for (int i = 0; i < 1000; i++) {
                    System.out.println(i);
                }
            }
        }).start();*/
        /*MakeThreadRun makeThreadRun = new MakeThreadRun();
        makeThreadRun.setName("T1");
        Thread thread = new Thread(makeThreadRun);
        thread.start();


        MakeThreadRun makeThreadRun1 = new MakeThreadRun();
        makeThreadRun1.setName("T2");
        Thread thread1 = new Thread(makeThreadRun1);
        thread1.start();*/


        MakeThread makeThread = new MakeThread();
        makeThread.start();
        try {
            makeThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        MakeThread makeThread1 = new MakeThread();
        makeThread1.start();
        //makeThread1.makeCode();
        /*for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }*/
    }
}
