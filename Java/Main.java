class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Car car = new Car();
        car.license = "ABC-1234";
        car.driver = "Jose da Silva";
        car.passenger = 4;
        car.printDataCar();

        Car car2 = new Car();
        car2.license = "DEF-5678";
        car2.driver = "Maria da Silva";
        car2.passenger = 2;
        car.printDataCar();
    }
}