package packages.algo.java.program.designpattern.singleton;

public class Singleton {
    private static volatile Singleton instance;

    private Singleton() {
    }

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello from Singleton!");
    }
}
