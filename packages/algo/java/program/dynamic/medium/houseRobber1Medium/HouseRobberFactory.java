package packages.algo.java.program.dynamic.medium.houseRobber1Medium;

public class HouseRobberFactory {
    public static HouseRobber getHouseRobber(String type) {
        return switch (type) {
            case "naive" -> new HouseRobberNaive();
            case "memoization" -> new HouseRobberMemoization();
            case "tabulation" -> new HouseRobberTabulation();
            case "optimizedTabulation" -> new HouseRobberOptimizedTabulation();
            default -> null;
        };
    }
}
