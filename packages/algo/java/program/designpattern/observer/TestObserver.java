package packages.algo.java.program.designpattern.observer;

public class TestObserver {
    public static void main(String[] args) {
        NewsPublisher publisher = new NewsPublisher();

        Observer user1 = new EmailSubscriber("Alice");
        Observer user2 = new SMSSubscriber("Bob");

        publisher.subscribe(user1);
        publisher.subscribe(user2);

        publisher.notifyObservers("New article published on Strategy Pattern!");

        publisher.unsubscribe(user1);

        publisher.notifyObservers("Observer Pattern tutorial is live!");
    }
}
