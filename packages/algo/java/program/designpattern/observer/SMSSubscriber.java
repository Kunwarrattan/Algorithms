package packages.algo.java.program.designpattern.observer;

public class SMSSubscriber implements Observer {
    private String name;

    public SMSSubscriber(String name) {
        this.name = name;
    }

    public void update(String message) {
        System.out.println(name + " received SMS update: " + message);
    }
}
