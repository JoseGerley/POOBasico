public class Car {
    Integer id;
    String license;
    Account driver;
    Integer passenger;

    public Car(String license, Account driver) {
        this.license = license;
        this.driver = driver;
    }

    public void printDataCar(){
        System.out.println("Car license: "+this.license);
        System.out.println("Car driver: "+this.driver.name);
        System.out.println("Car passenger: "+this.passenger);
    }
    
}
