class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        UberX uberX = new UberX("ABC-1234", new Account("Jose da Silva", "16847224"), "Chevrolet", "Onix"); 
        uberX.setPassenger(4);
        uberX.printDataCar();

        System.out.println();
        
        UberVan uberVan = new UberVan("DEF-5678",new Driver("Maria da Silva", "10495327"));
        uberVan.setPassenger(6);
        uberVan.printDataCar();
    }
}