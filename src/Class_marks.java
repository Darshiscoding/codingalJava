import java.util.Scanner;

public class Class_marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks in Science:-->");
        int science_marks = sc.nextInt();
        System.out.println("Enter marks in Maths:--->");
        int maths_marks = sc.nextInt();
        System.out.println("Enter marks in SST:-->");
        int socialScience = sc.nextInt();

        int obtainedMarks = science_marks+maths_marks+socialScience;
        float total_Marks = 300.0f;

        float percentage = obtainedMarks/total_Marks*100;

        System.out.println("Your percentage is:--->");

        if (percentage>=90 &&  percentage<=100){
            System.out.println("A Grade");
        } else if (percentage>=80  &&  percentage<90) {
            System.out.println("B grade");
        }
        else {
            System.out.println("You need to work harder");
        }

    }
}
