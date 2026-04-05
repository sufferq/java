abstract class Transport {
    protected int currentPassengers;
    protected final int maxCapacity;

    public Transport(int maxCapacity) {
        this.maxCapacity = maxCapacity;
        this.currentPassengers = 0;
    }

    public boolean boardPassenger() {
        if (currentPassengers < maxCapacity) {
            currentPassengers++;
            System.out.println("Пассажир сел. Теперь: " + currentPassengers);
            return true;
        } else {
            System.out.println("Нет свободных мест!");
            return false;
        }
    }

    public boolean disembarkPassenger() {
        if (currentPassengers > 0) {
            currentPassengers--;
            System.out.println("Пассажир вышел. Осталось: " + currentPassengers);
            return true;
        } else {
            System.out.println("В транспорте нет пассажиров!");
            return false;
        }
    }

    public abstract void run(int distance);
}