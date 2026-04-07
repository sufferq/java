public class Main {
    public static void main(String[] args) {
        Publisher newsPublisher = new Publisher();

        Subscriber alice = new EmailSubscriber("alice@mail.com");
        Subscriber bob = new SmsSubscriber("+79123456789");

        newsPublisher.subscribe(alice);
        newsPublisher.subscribe(bob);

        newsPublisher.notifySubscribers("Новая статья!");
    }
}