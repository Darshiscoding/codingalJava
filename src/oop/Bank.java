package oop;

public class Bank {
    String name;
    int Balance;
    String AccountNumber;

    Bank(String nameValue, int balance, String accountNumber) {
        name = nameValue;
        Balance = balance;
        AccountNumber = accountNumber;

    }
    void Bank_details(){
        System.out.println("Name: "+name);
        System.out.println("Account Balance: "+Balance);
        System.out.println("Account number: "+AccountNumber);
    }

    public static void main(String[] args) {
        Bank darsh = new Bank("Darsh",3000000,"5024098201");
        Bank tejasva = new Bank("Tejasva",300000,"7370987113");

        darsh.Bank_details();
        System.out.println("--------------------------------------------------------------");
        tejasva.Bank_details();
    }
}

