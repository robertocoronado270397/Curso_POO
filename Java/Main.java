package Java;

class Main{
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        Car car = new Car();
        car.license = "JMA-84-85";
        car.driver = "Julio Coronado";
        car.passenger = 4; 
        car.printDataCar();

        Car car2 = new Car();
        car2.license = "HJ";
        car2.driver = "Andrea";
        car2.passenger = 3;
        car2.printDataCar();
        
    }
}