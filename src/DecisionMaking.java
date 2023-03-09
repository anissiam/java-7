import java.util.Scanner;

public class DecisionMaking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Plz enter num");
        int num = scanner.nextInt();
        switch (num) {
            case 1:
                System.out.println("1");
                break;
            case 2, 3:
                System.out.println("2 OR 3 ");
                break;
            case 4:
                System.out.println("4");
                break;
            default:
                System.out.println("Noting");

        }
        /*switch (num) {
            case 1:
                System.out.println("1");
                break;
            case 2:
            case 3:
                System.out.println("2 OR 3 ");
                break;
            case 4:
                System.out.println("4");break;
            default:
                System.out.println("Noting");

        }*/

        /*if(num==1){
            System.out.println("1");
        }else if(num ==2 || num==3){
            System.out.println("2 OR 3 ");
        }else if(num==4) {
            System.out.println("4");
        }else {
            System.out.println("Noting");
        }*/


       /* switch (num) {
            case 90:
                System.out.println(90);
                break;
            case 80:
                System.out.println(80);
                break;
            case 70:
                System.out.println(70);
                break;
            default:
                System.out.println("noting");

        }*/

       /* if (num == 90) {
            System.out.println(90);
        } else if (num == 80) {
            System.out.println(80);
        } else if (num == 70) {
            System.out.println(70);
        } else {
            System.out.println("noting");
        }*/

/*
        if(num!=0){
            if( num%2==0 ){
                System.out.println("Even");
            }else if(num%2==1 ){
                System.out.println("Odd");
            }
        }else {
            System.out.println("Zero");
        }

        if(num!=0 && num%2==0 ){
            System.out.println("Even");
        }else if(num!=0 &&num%2==1 ){
            System.out.println("Odd");
        }else {
            System.out.println("Zero");
        }
    }*/
        /*if(num==0){
            System.out.println("==0");
        }else if(num%2==0){
            System.out.println("Even");
        }else
            System.out.println("Odd");
        }
        */
        /*if(num==0){
            System.out.println("==0");
        }else if(num%2==0){
            System.out.println("Even");
        }else if(num%2!=0){
            System.out.println("Odd");
        }else {
            System.out.println("Noting");
        }*/

        /*System.out.println("Plz enter Line");
        String line = scanner.nextLine();

        if(line.isEmpty()){
            System.out.println("Empty");
            return;
        }

         if (line.contains("@")){
            System.out.println("EMAIL");
        }else if(line.contains("https://")){
           System.out.println("URL");
        }else {
            System.out.println("word");
        }
*/
        /*System.out.println("Plz enter number");
        int num = scanner.nextInt();

        if(num>50){
            System.out.println("Passed");
            if(num>=90){
                System.out.println("Exdvfb");
            }
        }else {
            System.out.println("Not passed");
        }*/

        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Plz enter line");
        String line = scanner.nextLine();
            //T        AND     F                 OR
        if (!line.isEmpty() & line.contains("@") || line.contains(".com")) {
            System.out.println("Email");
        } else {
            System.out.println("Maybe empty or not email");
        }*/

        /*System.out.println("Plz enter mark");
        int mark = scanner.nextInt();

        if (mark < 100) {
            if (mark >= 50) {
                System.out.println("Pass");
            } else {
                System.out.println("Failed");
            }
        } else {
            System.out.println("Not valid");
        }*/

        /*System.out.println("Plz enter Text");
        String line = scanner.nextLine();
        if(!line.isEmpty()){
            if(line.contains("@")){
                System.out.println("Email");
            } else {
                System.out.println("Not email");
            }
        }else {
            System.out.println("Line empty");
        }

        */
        /*if(line.isEmpty()){
            System.out.println("Line empty");
            return;
        }

        if(line.contains("@")){
            System.out.println("Email");
        } else {
            System.out.println("Not email");
        }*/

        /*System.out.println("Plz enter Mark");
        int mark = scanner.nextInt();

        if (mark > 100) {
            System.out.println("not correct grater than 100");
            return;
        }

        if (mark < 0) {
            System.out.println("not correct less than 0");
            return;
        }
        if(mark>=50){
            System.out.println("Pass");
        }else {
            System.out.println("Failed");
        }*/

        /*if(x>=0){
            int ww = 10;
            System.out.println("Up to 0 or equal ");
        }else {
            System.out.println("less than 0");
        }*/
       /* if(x<0){

        }*/


        /*System.out.println("Plz enter name");
        String name = scanner.nextLine();
        if(name.isEmpty()){
            System.out.println("Empty");
        }

        if(name.contains("@")){
            System.out.println("Email");
        }*/
    }
}
