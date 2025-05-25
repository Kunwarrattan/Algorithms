package packages.algo.java.program.designpattern.factory;

public class NotificationFactory {

    public static Notification CreateNotification(String type){
        if("Email".equalsIgnoreCase(type)){
            return new EmailNotification();
        }else if("SMS".equalsIgnoreCase(type))
            return new SmsNotification();
        throw new IllegalArgumentException("Unknown");
    }
}

