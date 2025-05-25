package packages.algo.java.program.designpattern.singleton;

//Purpose: Ensure only one instance of a class exists globally.
//Use Case: Config manager, Logger, DB connection pool
public class TestSingleton {
    public static void main(String[] args) {
        Singleton obj1 = Singleton.getInstance();
        obj1.showMessage();
        Singleton obj2 = Singleton.getInstance();
        obj2.showMessage();
        System.out.println("Are both instances same? " + (obj1 == obj2));
    }
}
