public class Car {
    Integer id;
    String license;
    Account driver;
    private Integer passenger;

    public Car(String license, Account driver) {
        this.license = license;
        this.driver = driver;
    }

    public void printDataCar(){
        System.out.println("Car license: "+this.license);
        System.out.println("Car driver: "+this.driver.name);
        System.out.println("Car passenger: "+this.passenger);
    }

    public Integer getPassenger() {
        return passenger;
    }

    public void setPassenger(Integer passenger) {
        if (passenger == 4) {
            this.passenger = passenger;
        }
        else{
            System.out.println("Invalid passenger");
        }
    }
    
}
