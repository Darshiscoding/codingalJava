package oop;
//4. Employee Bonus Calculator
//Question:
//Create an Employee class with id, name, basicSalary.
//
//Constructor should initialize values.
//
//Method calculateBonus() returns 10% bonus if salary > 50,000 else 5%.
//Print employee details along with bonus.

import java.net.IDN;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Employee_Bonus_Calculator {
    String name;
    String id;
    int basicSalary;

    Employee_Bonus_Calculator(String nameValue, String ID, int Salary){
        name = nameValue;
        id = ID;
        basicSalary = Salary;
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Enter your ID: ");
        String ID = sc.nextLine();
        System.out.println("Enter your basic salary: ");
        int basicSalary = sc.nextInt();
        Employee_Bonus_Calculator e_1 = new Employee_Bonus_Calculator(name,ID,basicSalary);
        e_1.details();
        e_1.calculateBonus();

    }
}
