package com.java7.vision.basics;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        int nums[] = {7, 3, 2, 1, 9, 8};
        int temp = 0;

        java.util.Arrays.sort(nums);


        /*for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j <nums.length; j++) {
                if(nums[i]>nums[j]){
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }*/
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

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
