class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Car car = new Car("ABC-1234",new Account("Jose da Silva", "16847224")); 
        car.passenger = 4;
        car.printDataCar();

        Car car2 = new Car("DEF-5678",new Account("Maria da Silva", "10495327"));
        car2.passenger = 2;
        car.printDataCar();
    }
}