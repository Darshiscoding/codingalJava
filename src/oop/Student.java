package oop;

import java.sql.SQLOutput;

public class Student {
    String name;
     int Roll_call;
     int math;
     int Chemistry;
     int Physics;
     //constructor
    Student(String nameValue, int Roll_number, int math_marks, int Chemistry_marks, int Physics_marks) {
        System.out.println("Constructor is called");
        name = nameValue;
        Roll_call = Roll_number;
        math = math_marks;
        Chemistry = Chemistry_marks;
        Physics = Physics_marks;

        }
        void details(){
            System.out.println("Name "+name);
            System.out.println("The total Marks: "+math+Chemistry+Physics);
            System.out.println("Average marks are: "+(math+Chemistry+Physics)/3);
            System.out.println("Percentage in the three subjects is: "+(math+Chemistry+Physics/300)*100);



    }

        void getGrade() {
            double percentage = (math + Chemistry + Physics) / 300.0 * 100;
            if (percentage <=100 && percentage>=90) {
                System.out.println(name+" has gotten A Grade");
            }
            else if (percentage<=90 && percentage>=80){
                System.out.println(name+" has gotten B Grade");
            }
            else if (percentage<=80 && percentage>=70) {
                System.out.println(name+" has gotten C Grade");
            }
            else{
                    System.out.println("Better luck next time");
                }

        }



    public static void main(String[] args) {
        Student darsh = new Student("Darsh",17,92,87,91);
        Student aman = new Student("Aman",4,76,98,83);
        Student akash = new Student("Akash",2,90,87,83);

        darsh.details();
        akash.details();
        aman.details();
        darsh.getGrade();
        akash.getGrade();


    }
}
