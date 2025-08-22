package oop;
//4. Employee Bonus Calculator
//Question:
//Create an Employee class with id, name, basicSalary.
//
//Constructor should initialize values.
//
//Method calculateBonus() returns 10% bonus if salary > 50,000 else 5%.
//Print employee details along with bonus.


import java.util.Scanner;

class A{
    A(){
        System.out.println("constructor of A class");
    }
}

public class Employee_Bonus_Calculator extends A{
    String name;
    String id;
    int basicSalary;
//    Employee_Bonus_Calculator(){
//        System.out.println("Employee clas constructor");
//    }

    Employee_Bonus_Calculator(String nameValue, String ID, int Salary){
        name = nameValue;
        id = ID;
        basicSalary = Salary;
        System.out.println("Employee class constructor");
    }
    void details(){
        System.out.println("Name: "+name);
        System.out.println("ID: "+id);
        System.out.println("Basic Salary: "+basicSalary);
    }
    void calculateBonus(){
        if(basicSalary>50000) {
            int bonus = 10;
            System.out.println("You will get "+bonus+"% bonus");
            System.out.println("Your new Salary is: "+(basicSalary+(basicSalary*bonus/100)));

        }
        else{
            int bonus = 5;
            System.out.println("You will get "+bonus+"% bonus");
            System.out.println("Your new Salary is: "+(basicSalary+(basicSalary*bonus/100)));
        }
    }

}

//Parent ---> child
class Manager extends Employee_Bonus_Calculator{
     Manager(String nmValue, String id, int sal){
         super(nmValue,id,sal);
        System.out.println("Hello, I am the manager!");
    }
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your name: ");
//        String name = sc.nextLine();
//        System.out.println("Enter your ID: ");
//        String ID = sc.nextLine();
//        System.out.println("Enter your basic salary: ");
//        int basicSalary = sc.nextInt();
        Employee_Bonus_Calculator e_1 = new Employee_Bonus_Calculator("Darsh","12", 12);
//        e_1.details();
//        e_1.calculateBonus();

        Manager darsh = new Manager("aka","23",100);
        darsh.details();



    }
}
