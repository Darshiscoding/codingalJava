package oop.Inheritance;

public class Vehicle {
    String vehicle_name;
    String speed;

    Vehicle(String nameV, String speedV){
        vehicle_name = nameV;
        speed = speedV;
    }
    void Details(){
        System.out.println("name of the vehicle is: "+vehicle_name);
        System.out.println("Speed of the vehicle is: "+speed);
    }


}
class Car extends Vehicle{
       String feul_Efficiency;
    Car(String nameVal, String speedVal, String efficiencyVal){
        super(nameVal,speedVal);
        feul_Efficiency = efficiencyVal;
    }
    void eff_val(){
        System.out.println("Efficiency of feul is: "+feul_Efficiency);
    }
    public static void main(String[] args) {
        Vehicle Aeroplane = new Vehicle("Aeroplane","500 mph");
        Aeroplane.Details();
        Car car = new Car("Mercedes","50 mph","24.4 miles per gallon (mpg)");
        car.Details();
        car.eff_val();
    }

}
class Bike extends Car{
    String Engine_Capacity;
    Bike(String nameVal, String speedVal, String efficiencyVal, String Engine_Cap){
        super(nameVal,speedVal,efficiencyVal);
        Engine_Capacity = Engine_Cap;

    }
    void Engine_C(){
        System.out.println("Engine Capacity is: "+Engine_Capacity);
    }
    public static void main(String[] args) {
        Vehicle Aeroplane = new Vehicle("Aeroplane","500 mph");
        Aeroplane.Details();
        Car car = new Car("Mercedes","50 mph","24.4 miles per gallon (mpg)");
        car.Details();
        car.eff_val();
        Bike Bike = new Bike("Yamaha r15","150 km/h","40 km/l","155 cc");
        Bike.Details();
        Bike.eff_val();
        Bike.Engine_C();
    }
}
