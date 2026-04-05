class Driver {
    private String name;
    private String action;

    public Driver(String name, String action) {
        this.name = name;
        this.action = action;
    }

    public void push() {
        System.out.println(name + " " + action);
    }
}

abstract class MuscleTransport extends Transport {
    protected Driver driver;

    public MuscleTransport(int maxCapacity, Driver driver) {
        super(maxCapacity);
        this.driver = driver;
    }
}

class Bicycle extends MuscleTransport {
    private int wheelCount;

    public Bicycle(Driver driver) {
        super(1, driver);
        this.wheelCount = 2;
    }

    @Override
    public void run(int distance) {
        System.out.println("\nВелосипед едет " + distance + " км:");
        for (int i = 1; i <= distance; i++) {
            driver.push();
            System.out.println("Пройдено " + i + " км");
        }
        System.out.println("Велосипед прибыл!");
    }
}

class Boat extends MuscleTransport {
    private String type;

    public Boat(Driver driver) {
        super(4, driver);
        this.type = "лодка-гребля";
    }

    @Override
    public void run(int distance) {
        System.out.println("\n" + type + " плывет " + distance + " км:");
        for (int i = 1; i <= distance; i++) {
            driver.push();
            System.out.println("Проплыто " + i + " км");
        }
        System.out.println("Лодка причалила!");
    }
}