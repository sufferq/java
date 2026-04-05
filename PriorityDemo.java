public class PriorityDemo {
    static class PriorityThread extends Thread {
        public PriorityThread(String name, int priority) {
            super(name);
            setPriority(priority);
        }

        @Override
        public void run() {
            for (int i = 1; i <= 10; i++) {
                System.out.println(getName() + ": итерация " + i);
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        PriorityThread high = new PriorityThread("Высокоприоритетный", Thread.MAX_PRIORITY);
        PriorityThread low = new PriorityThread("Низкоприоритетный", Thread.MIN_PRIORITY);

        high.start();
        low.start();
    }
}
