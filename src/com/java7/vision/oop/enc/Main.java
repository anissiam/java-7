package com.java7.vision.oop.enc;

public class Main {
    public static void main(String[] args) {

        Student student = new Student();


     /*   student.setName("Anis");
        System.out.println(student.getName());
        student.setAge(31);
        System.out.println(student.printStudent());
*/

        Car car = new Car("BMW" , "Black" , 60.0,student);
        System.out.println(car.getStudent().printStudent());

        /*Animal animal = new Animal();
        animal.setName("Locy");
        animal.setAge(10);
        System.out.println(animal.getAge());

        animal.printAnimal();

        Animal animal1 = new Animal("locy", "cat", 4);
        animal1.printAnimal();*/


    }
}
