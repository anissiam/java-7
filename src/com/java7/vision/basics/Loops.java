import java.util.Scanner;

public class Loops {

    public static void main(String[] args) {

        /*for (int i = 0; i < 4; i++) {
            System.out.println("Week " +(i+1));
            for (int j = 0; j < 7; j++) {
                System.out.print("Day" + (j + 1) + " ");
            }
            System.out.println();
        }*/


        /*for (int i = 0; i < 5; i++) {
            for (int j = 0; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }*/

        /*for (int i = 0; i <3 ; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
*/


        /*int i = 0;
        if (i==0){
            System.out.println(i);
        }*/

        /*int i = 0;
        for (; ; ) {

            System.out.println(i);
            i++;
        }*/

        /*Scanner scanner = new Scanner(System.in);
        int num;
        for (;;){
            System.out.println("Plz enter num");
            num = scanner.nextInt();
            if(num==0){
                continue;
            }else if(num%2==0){
                System.out.println("Even");
            }else {
                System.out.println("Odd");
            }

        }*/


        /*String text;
        for (;;){
            System.out.println("Plz enter name ");
            text = scanner.nextLine();
            if(text.equalsIgnoreCase("Stop")){
                break;
            }
        }*/


        /*System.out.println("Plz enter num ");
        int num = scanner.nextInt();
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        System.out.println(fact);*/


        /*int sum = 0;
        for (int i = 0; i <= 100; i++) {
            if(i%2==0){
                sum += i;
            }
        }
        System.out.println(sum);*/



        /*for (int i = 0; i < 10; i++) {
            if(i==9){
                System.out.print("1/"+(i+1 ));
            }else {
                System.out.print("1/"+(i+1 ) + "+  ");
            }

        }*/

        /*Scanner scanner = new Scanner(System.in);
        int num ;
        int max = 0;
        int min = 0;
        for (int i = 0; i < 6; i++) {
            System.out.println("Plz enter num ");
             num = scanner.nextInt();
             if(i==0){ // لفة
                 min = num;
                 max = num;
                 continue;
             }
            if(max<num){
                max = num;
            }

            if(min>num){
                min = num;
            }
        }
        System.out.println("Max is " + max);
        System.out.println("Min is " + min);*/


        /*
        int num = 0;
        int sum = 0;
        int count = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Plz enter num ");
            num = scanner.nextInt();
            sum += num;
            count++;
        }
        System.out.println(sum / count);*/


//        int i = 5;
//        if(i%2!=0){
//            System.out.println();
//        }



        /*for (int i = 0; i < 100; i+=2) {
                System.out.println(i+1);
        }*/

        /*for (int i = 0; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }*/

        /*int fact = 1;
        for (int i = 1 ; i<=7 ;i++){
            fact *= i;
        }
        System.out.println(" Fact is " + fact);*/

        /*int sum = 0;
        for (int i = 0 ; i<=3;i++){
            sum += i;
        }
        System.out.println("Sum is " + sum);*/


      /*  int i = 5;
        do {
            System.out.println(i);
        } while (i < 5);
*/

        /*
        System.out.println("Plz enter text");
        String text = scanner.nextLine();
        while (true) {
            if (text.equalsIgnoreCase("Anis")) {
                System.out.println("Found");
                continue;
            }
            System.out.println("Plz enter text");
            text = scanner.nextLine();
        }*/


        /*while (!text.equalsIgnoreCase("Stop")) {
            System.out.println("Plz enter new text");
            text = scanner.nextLine();
        }*/



        /*while (true){
            System.out.println("Plz enter text");
            text = scanner.nextLine();
            if(text.equalsIgnoreCase("Stop")){
                System.out.println("App is stopped");
                break;
            }
        }*/


        /*int i = 0;
        int sum = 0;
        int x;
        while (i<5){
            System.out.println("Plz enter num");
            x = scanner.nextInt();
            sum = sum + x;
            i++;
        }
        System.out.println(sum/i);
*/

       /* System.out.println("Hello"); //i=0
        System.out.println("Hello"); //i=1
        System.out.println("Hello"); //i=2
        System.out.println("Hello"); //i=3
        System.out.println("Hello"); //i=4*/

        /*int i = 0;

        while (i < 100) {
            System.out.println(i+1);
            i +=2;
        }*/

        /*int i = 0;

        while (i <= 10) {
            i++;//
            if (i % 2 == 0) {
                System.out.println(i);
            }

        }*/

        /*int i = 10;
        while (i>=0){
            System.out.println(i);
            i--;
        }*/

        /*int i = 0;
        int sum = 0;
        while (i<3){
            System.out.println(i);
            sum = sum + i;//sum+=i
            i++; //-> i = i+1
        }
        System.out.println(sum);*/


    }
}
