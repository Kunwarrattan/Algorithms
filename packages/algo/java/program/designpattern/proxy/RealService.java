package packages.algo.java.program.designpattern.proxy;

public class RealService implements Service {
    public void performOperation() {
        System.out.println("Executing operation in RealService.");
    }
}
