package com.java7.vision.oop.enc;

public class Animal {
     String name;
    private String type;
    private int age;

    public Animal() {
        System.out.println("asdcsa");

    }

    public Animal(String name, String type, int age) {
        this.name = name;
        this.type = type;
        this.age = age;
    }
    /*public String printData() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", age=" + age +
                '}';
    }*/

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void printAnimal() {
        System.out.println("Name:" + name + " Type:" + type + " Age:" + age);
    }
}
