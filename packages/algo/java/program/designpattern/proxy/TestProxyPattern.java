package packages.algo.java.program.designpattern.proxy;

public class TestProxyPattern {
    public static void main(String[] args) {
        Service user1 = new ServiceProxy(true);  // With access
        Service user2 = new ServiceProxy(false); // Without access

        user1.performOperation();
        user2.performOperation();
    }
}
