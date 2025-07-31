package oop;
//### **Employee Payroll System**
//
//**Problem:**
//
//Create an `Employee` class with the following attributes:
//
//- Name
//
//- Employee ID
//
//- Basic Salary
//
//Include methods to:
//
//1. Calculate gross salary (Basic + HRA + DA).
//
//2. Calculate net salary (Gross Salary - Tax).
//
//3. Display employee details.

import java.util.Scanner;

public class Payroll {
    String name;
    String iD;
    int basic_Salary;
    Payroll(String namevalue, String idvalue, int salary){
        name = namevalue;
        iD = idvalue;
        basic_Salary = salary;


    }
    void calculate_gross(double HRApercentage, double DApercentage){
        double hraAmount = basic_Salary*(HRApercentage/100);
        double daAmount =  basic_Salary*(DApercentage/100);
        System.out.println("The gross salary is: "+(basic_Salary+hraAmount+daAmount));
    }


    void netSalary(int TAXpercentage){
        double Tax = basic_Salary*(TAXpercentage/100);
        System.out.println("The net salary is: "+(basic_Salary+Tax));

    }

    void details(){
        System.out.println("Name: "+name);
        System.out.println("ID: "+iD);
        System.out.println("Salary: "+basic_Salary);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String nameinput = sc.nextLine();
        System.out.println("Enter ID");
        String ID = sc.nextLine();
        System.out.println("Enter your base salary: ");
        int salary = sc.nextInt();
        System.out.println("Enter HRA: ");
        int HRA = sc.nextInt();
        System.out.println("Enter DA: ");
        int DA  = sc.nextInt();
        System.out.println("Enter Tax: ");
        int TAX = sc.nextInt();


        Payroll Employee_1  = new Payroll(nameinput,ID,salary);

        System.out.println("-----------------------Details----------------------------");
        Employee_1.details();
        System.out.println("------------------------net_Salary----------------------------");
        Employee_1.netSalary(TAX);
        System.out.println("-----------------------gross_salary--------------------------------------");
        Employee_1.calculate_gross(HRA,DA);
        System.out.println("-------------------------------------END---------------------------");
    }

}
