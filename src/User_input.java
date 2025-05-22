import java.util.Scanner;

public class User_input {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int x = sc.nextInt();
        System.out.println("Enter a decimal number:");
        float y = sc.nextFloat();
        System.out.println("Enter a string:");
        sc.nextLine();
        String z = sc.nextLine();
        System.out.println("Value of x,y,z respectively:"+x+y+z);
    }
}
