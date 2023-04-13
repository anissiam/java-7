package com.java7.vision.oop.abstractionas;

public abstract class Test {
    public abstract void doCode( int x , int y );

    public void printClassName(){
        System.out.println(this.getClass().getName());
    }
}
