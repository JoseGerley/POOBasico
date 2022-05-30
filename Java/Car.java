public class Car {
    Integer id;
    String license;
    String driver;
    Integer passenger;

    public void printDataCar(){
        System.out.println("Car license: "+this.license);
        System.out.println("Car driver: "+this.driver);
        System.out.println("Car passenger: "+this.passenger);
    }
    
}
