class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        UberX uberX = new UberX("ABC-1234", new Account("Jose da Silva", "16847224"), "Chevrolet", "Onix"); 
        uberX.passenger = 3;
        uberX.printDataCar();
        /*
        Car car2 = new Car("DEF-5678",new Account("Maria da Silva", "10495327"));
        car2.passenger = 2;
        uberX.printDataCar();
        */
    }
}