package com.java7.vision.basics;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {

        String[][] names = new String[2][6];
        System.out.println(names.length); // Num of row
        System.out.println(names[0].length);
        System.out.println((names.length) * (names[0].length));
        /*String [] names1= {"sami", "ali", "soso", "ahmad" , "wrwesg"};
        String [] names2= {"FOFO", "Nani", "Anis", "Momen" , "sami"};


        for (int i = 0; i < names1.length; i++) {
            for (int j = 0; j < names2.length; j++) {
                if(names1[i].equalsIgnoreCase(names2[j])){
                    System.out.println(names1[i]);
                }
            }
        }*/
        /*for (int i = 0; i < names.length; i++) {
            for (int j = 0; j < i; j++) {
                if(names[i].equalsIgnoreCase(names[j])){
                    System.out.println(names[i]);
                }
            }
        }*/
        /*int i  =0;
        for (String s:names) {
            System.out.println(s + " " + i);
            i++;
        }*/


        //names[names.length - 1] = "Hello java";
        /*for (int i = 0; i < names.length; i++) {
            if(i == names.length-1){
                names[i] = "Hello java";
            }

        }*/
       /* int mult = 1; // يخزن بها ناتج الضرب
        int sum = 0;
        int max = 0;
        int min = 0;

        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[10];
        for (int i = 0; i < nums.length; i++) {
            System.out.println("plz enter num");
            nums[i] = scanner.nextInt();
            mult *= nums[i];
            sum += nums[i];

            if(nums[i]==10){
                System.out.println("Found");
            }

            if (i == 0) {
                max = nums[i];
                min = nums[i];
                continue;
            }

            if (max < nums[i]) {
                max = nums[i];
            }

            if (min > nums[i]) {
                min = nums[i];
            }

        }

        System.out.println("mult :" + mult);
        System.out.println("Sum :" + sum);
        System.out.println("Ava :" + sum / nums.length);
        System.out.println("Max :" + max);
        System.out.println("Min :" + min);
*/

        /*int nums[] = {7, 3, 2, 1, 9, 8};
        int temp = 0;

        java.util.Arrays.sort(nums);*/


        /*for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j <nums.length; j++) {
                if(nums[i]>nums[j]){
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }*/
       /* for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }*/

        /*Scanner scanner = new Scanner(System.in);
        String[] names = {"Anis", "ALi", "Sami", "Lena", "Ahmad"};
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        System.out.println("search for:");
        String search = scanner.nextLine();
        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(search)) {
                System.out.println("Found");
                System.out.println("Plz enter new name");
                String name = scanner.nextLine();
                names[i] = name;
                System.out.println("Updated");
                break;
            }
        }

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }*/
        /*int[] nums = new int[5];
        for (int i = 0; i < nums.length; i++) {
            System.out.println("Plz enter num");
            nums[i] = scanner.nextInt();
        }
        int max = nums[0];
        int min = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if(max<nums[i]){
                max = nums[i];
            }
            if (min>nums[i]){
                min = nums[i];
            }
        }
        System.out.println("Max " + max);
        System.out.println("Min " + min);*/

        /*int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            // sum = sum + nums[i];
            sum += nums[i];
        }
        System.out.println(sum/ nums.length);*/

        /*String[] names = new String[5];
        for (int i = 0; i < names.length; i++) {
            System.out.println("Plz enter name");
            names[i] = scanner.nextLine();
        }


        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }*/



        /*int nums[] = {10, 50, 60, 7, 8 , 9};

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }*/


        //System.out.println(nums.length);

        /*int[] nums = new int[5]; //
        System.out.println(nums.length);
        System.out.println(nums[0]);

        //0  = 5 = nums[0] = 5
        nums[0] = 5;
        // 0  = 5  = x=5
        int x = nums[0];
        //0 = 5 = nums[1]
        nums[1] = x;

        //System.out.println(nums[-1]);
        //System.out.println(nums[5]);
        int size = nums.length;
        for (int i = 0; i < size; i++) {
            System.out.print(nums[i] + " ");
        }*/

    }
}
