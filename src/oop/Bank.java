package oop;

public class Bank {
    String name;
    int Balance;
    String AccountNumber;

    Bank(String nameValue, int balanceValue, String accountNumberValue) {
        name = nameValue;
        Balance = balanceValue;
        AccountNumber = accountNumberValue;

    }
    void Bank_details(){
        System.out.println("Name: "+name);
        System.out.println("Account Balance: "+Balance);
        System.out.println("Account number: "+AccountNumber);
    }

    void deposit(int amount){
        Balance = Balance + amount;
    }
    void withdrawal(int amount){
        Balance = Balance - amount;
    }

    public static void main(String[] args) {
        Bank darsh = new Bank("Darsh",3000000,"5024098201");
        Bank tejasva = new Bank("Tejasva",300000,"7370987113");

        darsh.Bank_details();
        System.out.println("--------------------------------------------------------------");
        tejasva.Bank_details();
        darsh.deposit(30000);
        darsh.Bank_details();
        tejasva.deposit(100000);
        tejasva.Bank_details();
        darsh.withdrawal(30000);
        darsh.Bank_details();
        tejasva.withdrawal(100000);
        tejasva.Bank_details();
    }
}

