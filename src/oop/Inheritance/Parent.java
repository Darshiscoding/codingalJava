package oop.Inheritance;

public class Parent {
    void random(){
        System.out.println("Hello World");

    }
    int x = 12;


    public static void main(String[] args) {
        Parent darsh = new Parent();
        System.out.println("Value of X" + darsh.x);
        darsh.random();

        Child parth = new Child();
        System.out.println("Value of X"+ parth.x);
        parth.random();

    }

}

class Child extends Parent{

}

