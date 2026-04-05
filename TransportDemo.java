public class TransportDemo {
    public static void main(String[] args) {
        System.out.println("========== ТРАНСПОРТНАЯ СИСТЕМА ==========\n");

        Driver bikeDriver = new Driver("Алексей", "крутит педали!");
        Driver boatDriver = new Driver("Иван", "гребет веслами!");

        Bicycle bike = new Bicycle(bikeDriver);
        Boat boat = new Boat(boatDriver);
        Car car = new Car();
        Motorcycle bike2 = new Motorcycle();

        Transport[] transports = {bike, boat, car, bike2};

        System.out.println("--- ПОСАДКА ПАССАЖИРОВ ---");
        bike.boardPassenger();
        boat.boardPassenger();
        boat.boardPassenger();
        car.boardPassenger();
        car.boardPassenger();
        bike2.boardPassenger();

        System.out.println("\n--- ДВИЖЕНИЕ ---");
        bike.run(3);
        boat.run(2);

        System.out.println("\n--- ЗАПРАВКА ---");
        car.refuel(30);
        bike2.refuel(10);

        car.run(200);
        bike2.run(100);
        bike2.run(50);

        System.out.println("\n--- ВЫСАДКА ---");
        car.disembarkPassenger();
        boat.disembarkPassenger();

        System.out.println("\n--- ПОЛИМОРФИЗМ (все через Transport) ---");
        for (Transport t : transports) {
            System.out.println("Транспорт: " + t.getClass().getSimpleName());
            t.run(1);
            System.out.println();
        }
    }
}