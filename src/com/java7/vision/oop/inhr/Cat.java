package com.java7.vision.oop.inhr;

public class Cat extends Animal{
    private String food;

    public Cat(){
       super();
    }
    public Cat(String food ,int age , String name){
        super(age, name);
        this.food = food;
    }
    @Override
    public void makeNoise() {
        super.makeNoise();
        System.out.println("Meow meow meow");
    }

}
