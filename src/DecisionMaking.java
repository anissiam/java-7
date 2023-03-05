import java.util.Scanner;

public class DecisionMaking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        if(x>=0){
            System.out.println("Up to 0 or equal ");
        }

        if(x<0){
            System.out.println("less than 0");
        }


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
