import java.util.ArrayList;
import java.util.List;


interface Subscriber {
    void update(String message);
}


class Publisher {
    private List<Subscriber> subscribers = new ArrayList<>();

    public void subscribe(Subscriber sub) {
        subscribers.add(sub);
    }

    public void unsubscribe(Subscriber sub) {
        subscribers.remove(sub);
    }

    public void notifySubscribers(String message) {
        for (Subscriber sub : subscribers) {
            sub.update(message);
        }
    }
}


class EmailSubscriber implements Subscriber {
    private String name;

    public EmailSubscriber(String name) { this.name = name; }

    @Override
    public void update(String message) {
        System.out.println("Email для " + name + ": " + message);
    }
}

class SmsSubscriber implements Subscriber {
    private String phone;

    public SmsSubscriber(String phone) { this.phone = phone; }

    @Override
    public void update(String message) {
        System.out.println("SMS на " + phone + ": " + message);
    }
}
