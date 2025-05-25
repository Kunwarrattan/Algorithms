package packages.algo.java.program.designpattern.proxy;

public class ServiceProxy implements Service {
    private RealService realService;
    private boolean hasAccess;

    public ServiceProxy(boolean hasAccess) {
        this.hasAccess = hasAccess;
    }

    public void performOperation() {
        if (hasAccess) {
            if (realService == null) {
                realService = new RealService();
            }
            System.out.println("Proxy: Access granted.");
            realService.performOperation();
        } else {
            System.out.println("Proxy: Access denied.");
        }
    }
}


