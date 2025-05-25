package packages.algo.java.program.designpattern.factory;


//Purpose: Create object without exposing creation logic.
//Use Case: Payment Gateway, Notification Service
public class TestFactory {
    public static void main(String[] args) {
        Notification notification = NotificationFactory.CreateNotification("Email");
        notification.notifyUser();

        Notification notification1 = NotificationFactory.CreateNotification("SMS");
        notification1.notifyUser();
    }
}
