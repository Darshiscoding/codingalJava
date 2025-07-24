import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int x = sc.nextInt();
        int result = 0;
        for(int i=1; i<=x; i=i+1){
            result = result+i;
        }
        System.out.println("Summation of "+x+" is "+result);

    }
}
