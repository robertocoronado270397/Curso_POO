package Java;

public class Car {
    Integer id;
    String license;
    Account driver;
    Integer passenger;

    public Car(String license, Account driver){
        this.license = license;
    }
    
    void printDataCar(){
        System.out.println("License: " + license + "Driver: " + driver);
    }
}
