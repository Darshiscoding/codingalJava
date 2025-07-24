package oop;

//God is SE

public class Human {
//    property
    String name = "Darsh";
    int age = 13;
;//    1. constructor
    Human(){
        System.out.println("consttructor is called");
    }
//    2.property : name , age --> variable

//   3. behaviour --> functions
    void Sleep(){
        System.out.println("sleeping");
    }
    void eat(){
        System.out.println("eating");
    }

    public static void main(String[] args) {
       Human darsh = new Human();
    }
}
//Animal class
