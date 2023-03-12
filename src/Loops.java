import java.util.Scanner;

public class Loops {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = 0;
        while (i<5){
            i++;
            if (i==3){
                continue;
            }
            System.out.println(i);
        }

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
