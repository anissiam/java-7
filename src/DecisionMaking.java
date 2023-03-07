import java.util.Scanner;

public class DecisionMaking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Plz enter line");
        String line = scanner.nextLine();
            //T        AND     F                 OR
        if (!line.isEmpty() & line.contains("@") || line.contains(".com")) {
            System.out.println("Email");
        } else {
            System.out.println("Maybe empty or not email");
        }

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
