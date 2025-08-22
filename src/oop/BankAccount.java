package oop;

public class BankAccount {

    int balance;
    String name ;

    BankAccount(String nameV, int balanceV){
        name = nameV;
        balance = balanceV;
        System.out.println("bank account constructor is called");
    }

    void deposit(int amount){
         balance = balance + amount;
    }


    public static void main(String[] args) {
        BankAccount darsh =  new BankAccount("Darsh",500);
        System.out.println(darsh.balance);
        darsh.deposit(1000);
        System.out.println(darsh.balance);
    }
}
