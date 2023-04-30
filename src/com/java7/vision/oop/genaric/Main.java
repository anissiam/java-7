package com.java7.vision.oop.genaric;


import com.java7.vision.oop.enc.Animal;
import com.java7.vision.oop.inhr.Person;
import com.java7.vision.oop.play.A;
import com.java7.vision.oop.play.B;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Plz enter name ");
        String name = scanner.nextLine();
        ArrayList<Animal> animalArrayList = new ArrayList<>();
        Animal animal = new Animal(name, "Cat", 2);
        Animal animal1 = new Animal("zscdzd", "sadsa", 51);

        animalArrayList.add(animal);

      //  System.out.println(animalArrayList);


        for (Animal aaa :animalArrayList){
            System.out.println(aaa.getAge());
        }



       /* String[] sss = new String[3];
        System.out.println(sss);
        */
        /*ArrayList<String> names = new ArrayList<>();
        names.add("Anis");
        names.add("Sami");
        names.add("Ali");
        names.add(0,"SOSO");

        System.out.println(names.size());
        System.out.println(names);
        names.set(1, "Samia");
        names.remove("Anis");
        //names.clear();
        System.out.println(names.contains("ali"));
        System.out.println(names);

        System.out.println(names.isEmpty());

*/


        /*ArrayList<Object> array = new ArrayList<>();
        array.add(10);
        array.add("10");
        array.add(new Person());
        System.out.println(array.get(0));

        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i));
        }*/

//        System.out.println(array);



      /*  Test<String> test = new Test<>();
        test.printData("10");


        Test<A> a = new Test<>();
        A a1 = new A();
        A a2 = new B();
        a.printData(a2);*/

      //  Test<Person>
//        Test<int>
     /*   int x1 = 10;

        Integer  x = Integer.parseInt("10");
System.out.println(x.doubleValue());

        Integer.max(10, 50);

       // Integer x1 = Integer.valueOf("10");


        System.out.println(x);*/


      /*  Test<String , Object> number = new Test<>();
        number.printData(10);
        */




    }

}

