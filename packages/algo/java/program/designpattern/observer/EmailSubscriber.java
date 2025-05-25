package packages.algo.java.program.designpattern.observer;

public class EmailSubscriber implements Observer {
    private String name;

    public EmailSubscriber(String name) {
        this.name = name;
    }

    public void update(String message) {
        System.out.println(name + " received EMAIL update: " + message);
    }
}
