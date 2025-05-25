package packages.algo.java.program.designpattern.decorator;

// Component Interface
interface Notifier {
    void send(String message);
}

// Concrete Component
class BasicNotifier implements Notifier {
    public void send(String message) {
        System.out.println("Sending basic notification: " + message);
    }
}

// Base Decorator
abstract class NotifierDecorator implements Notifier {
    protected Notifier notifier;

    public NotifierDecorator(Notifier notifier) {
        this.notifier = notifier;
    }

    public void send(String message) {
        notifier.send(message);
    }
}

// Concrete Decorators
class EmailNotifier extends NotifierDecorator {
    public EmailNotifier(Notifier notifier) {
        super(notifier);
    }

    public void send(String message) {
        super.send(message);
        System.out.println("Sending EMAIL notification: " + message);
    }
}

class SMSNotifier extends NotifierDecorator {
    public SMSNotifier(Notifier notifier) {
        super(notifier);
    }

    public void send(String message) {
        super.send(message);
        System.out.println("Sending SMS notification: " + message);
    }
}

public class TestDecorator {
    public static void main(String[] args) {
        Notifier baseNotifier = new BasicNotifier();

        // Add Email functionality
        Notifier emailNotifier = new EmailNotifier(baseNotifier);

        // Add both Email and SMS functionality
        Notifier fullNotifier = new SMSNotifier(emailNotifier);

        fullNotifier.send("Message updated.");
    }
}