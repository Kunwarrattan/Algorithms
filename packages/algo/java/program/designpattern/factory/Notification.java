package packages.algo.java.program.designpattern.factory;

public interface Notification {
    void notifyUser();
}

class EmailNotification implements Notification {

    @Override
    public void notifyUser() {
        System.out.println("email notification");
    }
}

class SmsNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("sms notification");
    }
}
