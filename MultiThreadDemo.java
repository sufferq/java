public class MultiThreadDemo {
    public static void main(String[] args) {
        // Поток через наследование
        SimpleThread threadA = new SimpleThread();
        threadA.setName("Поток A");

        // Потоки через Runnable
        Thread threadB = new Thread(new RunnableTask(), "Поток B");
        Thread threadC = new Thread(new RunnableTask(), "Поток C");

        threadA.start();
        threadB.start();
        threadC.start();
    }
}