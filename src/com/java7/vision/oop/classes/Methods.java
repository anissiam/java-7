package com.java7.vision.oop.classes;

import java.util.Arrays;

public class Methods {
    // static int x;
    public static void main(String[] args) {

        int[] sssss = {10, 50, 90, 0, 8};
        int[] orderSSSS = orderArray(sssss);
        for (int i = 0; i <orderSSSS.length; i++) {
            System.out.println(orderSSSS[i]);
        }




       /* add(10,10);
        add("10","10");
        add();
        add(10,50 , "SOSO");*/

//        printSum();
//        System.out.println(printSum1());
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Plz enter first num");
        int x = scanner.nextInt();

        System.out.println("Plz enter sec. num");
        int y = scanner.nextInt();
        int c;
        do {
            System.out.println("1)Add\n2)Sub\n3)Multi\n4)Div\n5)Exit.");
             c = scanner.nextInt();
            switch (c) {
                case 1:
                    add(x, y);
                    break;
                case 2:
                    sub(x, y);
                    break;
                case 3:
                    System.out.println(multi(x, y));
                    break;
                case 4:
                    if(y==0){
                        System.out.println("Error");
                        return;
                    }
                    System.out.println(div(x, y));
                    break;
                case 5:
                    System.exit(0);
            }
        }while (c<5);*/




     /*   int w = 11;
        int z = 50;
        System.out.println(sum3(w, z ));
        System.out.println(sum3(50, 80));

        System.out.println(sub4(w, z));

        multi(w, z);*/
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




    public static int printSum1(){
        int sum = 0;
        int[] nums = {0, 5, 10, 4, 3};
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
       return sum;
    }


    public static void printSum(){
        int sum = 0;
        int[] nums = {0, 5, 10, 4, 3};
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        System.out.println(sum);
    }

    public static int div(int x, int y) {
        int result = x / y;
        return result;
    }

    public static int multi(int x, int y) {
        int result = x * y;
        return result;
    }

    public static void sub(int x, int y) {
        System.out.println(x - y);
    }

    public static void add(int x, int y) {
        System.out.println(x + y);
    }

    public static void add(int x, int y, String w) {

        System.out.println(x + y);
    }

    public static void add(int x, String y) {
        System.out.println(x + y);
    }

    public static void add(String x, int y) {
        System.out.println(x + y);
    }
    public static void add(String x, String y) {
        System.out.println(x + y);
    }

    public static void add(){
        System.out.println("Add");
    }

//    public static  void multi(int q , int w){
//        System.out.println(q * w);
//    }
//    public static int sum3(int x , int y){
//
//        return x + y;
//    }
//
//    public static int sub4(int x , int y){
//
//        return x - y;
//    }
//
//
//    public static void ava(){
//        int i = 10;
//        int w = 50;
//        int z = 30;
//
//        System.out.println((i + w + z) / 3);
//    }
//
//    public static int sum2(){
//        int i = 10;
//        int w = 50;
//        int z = 30;
//        int res = i + w + z;
//        return res;
//    }
//    public static void sum(){
//        int x = 10;
//        int y = 50;
//
//        System.out.println(x + y);
//
//    }
//
//    public static int sum1(){
//        int x = 10;
//        int y = 50;
//        int result = x + y;
//        return result;
//    }
//
//    public static void sub(){
//        System.out.println(10 - 50);
//    }

    public static int[] orderArray(int [] nums){
        Arrays.sort(nums);

        return nums;
    }
}
