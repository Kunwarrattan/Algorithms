package packages.algo.java.program.designpattern.bridge;

//Purpose: Decouple abstraction from its implementation so that both can vary independently.
//Use Case: Multi-platform UI rendering, payment API abstraction, device control systems.
// Implementor interface
interface PaymentGateway {
    void processPayment(String account, double amount);
}

// Concrete Implementor 1
class PayPalGateway implements PaymentGateway {
    public void processPayment(String account, double amount) {
        System.out.println("Processing PayPal payment for " + account + " of $" + amount);
    }
}

// Concrete Implementor 2
class StripeGateway implements PaymentGateway {
    public void processPayment(String account, double amount) {
        System.out.println("Processing Stripe payment for " + account + " of $" + amount);
    }
}

// Abstraction
abstract class Payment {
    protected PaymentGateway gateway;

    public Payment(PaymentGateway gateway) {
        this.gateway = gateway;
    }

    public abstract void pay(String account, double amount);
}

// Refined Abstraction 1
class OnlineOrderPayment extends Payment {
    public OnlineOrderPayment(PaymentGateway gateway) {
        super(gateway);
    }

    public void pay(String account, double amount) {
        System.out.println("[OnlineOrderPayment] Initiating payment...");
        gateway.processPayment(account, amount);
    }
}

// Refined Abstraction 2
class SubscriptionPayment extends Payment {
    public SubscriptionPayment(PaymentGateway gateway) {
        super(gateway);
    }

    public void pay(String account, double amount) {
        System.out.println("[SubscriptionPayment] Charging recurring fee...");
        gateway.processPayment(account, amount);
    }
}

// Main.java
public class BridgePattern {
    public static void main(String[] args) {
        PaymentGateway paypal = new PayPalGateway();
        PaymentGateway stripe = new StripeGateway();

        Payment order1 = new OnlineOrderPayment(paypal);
        order1.pay("user1@example.com", 150.75);

        Payment order2 = new SubscriptionPayment(stripe);
        order2.pay("user2@example.com", 20.00);
    }
}

