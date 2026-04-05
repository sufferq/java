abstract class SelfDrivingTransport extends Transport {
    protected double fuelLevel;
    protected double fuelConsumption;
    protected double tankCapacity;

    public SelfDrivingTransport(int maxCapacity, double fuelConsumption, double tankCapacity) {
        super(maxCapacity);
        this.fuelConsumption = fuelConsumption;
        this.tankCapacity = tankCapacity;
        this.fuelLevel = 0;
    }

    public void refuel(double amount) {
        if (fuelLevel + amount > tankCapacity) {
            fuelLevel = tankCapacity;
            System.out.println("Бак полон! Залито: " + (tankCapacity - fuelLevel + amount) + " л");
        } else {
            fuelLevel += amount;
            System.out.println("Заправлено " + amount + " л. Теперь топлива: " + fuelLevel + " л");
        }
    }
}

class Car extends SelfDrivingTransport {
    private String fuelType;

    public Car() {
        super(5, 0.1, 50);
        this.fuelType = "АИ-95";
    }

    @Override
    public void run(int distance) {
        double needed = distance * fuelConsumption;
        System.out.println("\nАвтомобиль едет " + distance + " км (нужно " + needed + " л топлива)");

        if (fuelLevel >= needed) {
            fuelLevel -= needed;
            System.out.println("Дорога комфортная, радио играет...");
            System.out.println("Остаток топлива: " + fuelLevel + " л");
            System.out.println("Автомобиль прибыл!");
        } else {
            System.out.println("Не хватает топлива! Есть " + fuelLevel + " л, нужно " + needed);
        }
    }
}

class Motorcycle extends SelfDrivingTransport {
    private boolean hasHelmet;

    public Motorcycle() {
        super(1, 0.05, 15);
        this.hasHelmet = true;
    }

    @Override
    public void run(int distance) {
        double needed = distance * fuelConsumption;
        System.out.println("\nМотоцикл едет " + distance + " км (нужно " + needed + " л топлива)");

        if (fuelLevel >= needed) {
            fuelLevel -= needed;
            System.out.println("Ветер в лицо, скорость ветра!");
            System.out.println("Остаток топлива: " + fuelLevel + " л");
            System.out.println("Мотоцикл прибыл!");
        } else {
            System.out.println("Нет топлива! Есть " + fuelLevel + " л, нужно " + needed);
        }
    }
}