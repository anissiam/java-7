package com.java7.vision.oop.classes;

public class Main {
   // static int x;
    public static void main(String[] args) {



        int w = 11;
        int z = 50;
        System.out.println(sum3(w, z ));
        System.out.println(sum3(50, 80));

        System.out.println(sub4(w, z));

        multi(w, z);
/*

        System.out.println(sum2() / 3);

        System.out.println(sum2()/10);
*/



        /*int w = sum1();
        System.out.println(w);
        System.out.println(sum1());*/

        //ava();
        /*System.out.println(10);

        sum();
        //sub();

        System.out.println("Done");
        int x = 10;*/
        /*int x1 = 10;
        int x2 = 20;
        System.out.println(x + y);*/
    }
    public static  void multi(int q , int w){
        System.out.println(q * w);
    }
    public static int sum3(int x , int y){

        return x + y;
    }

    public static int sub4(int x , int y){

        return x - y;
    }


    public static void ava(){
        int i = 10;
        int w = 50;
        int z = 30;

        System.out.println((i + w + z) / 3);
    }

    public static int sum2(){
        int i = 10;
        int w = 50;
        int z = 30;
        int res = i + w + z;
        return res;
    }
    public static void sum(){
        int x = 10;
        int y = 50;

        System.out.println(x + y);

    }

    public static int sum1(){
        int x = 10;
        int y = 50;
        int result = x + y;
        return result;
    }

    public static void sub(){
        System.out.println(10 - 50);
    }

}
