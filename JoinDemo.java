public class JoinDemo {
    static class FirstThread extends Thread {
        @Override
        public void run() {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Первый поток: Сообщение " + i);
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    static class SecondThread extends Thread {
        @Override
        public void run() {
            System.out.println("Второй поток начинает работу после первого");
            for (int i = 1; i <= 3; i++) {
                System.out.println("Второй поток: Действие " + i);
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        FirstThread first = new FirstThread();
        SecondThread second = new SecondThread();

        first.start();
        first.join();
        second.start();
    }
}