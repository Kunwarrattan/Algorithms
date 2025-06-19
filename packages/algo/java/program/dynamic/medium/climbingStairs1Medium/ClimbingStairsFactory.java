package packages.algo.java.program.dynamic.medium.climbingStairs1Medium;


public class ClimbingStairsFactory {

    public static ClimbingStairs createClimbingStairs(String type) {
        if ("NaiveApproach".equalsIgnoreCase(type)) return new NaiveApproach();
        if ("Memoization".equalsIgnoreCase(type)) return new Memoization();
        if ("Tabulation".equalsIgnoreCase(type)) return new Tabulation();
        if ("OptimizedTabulation".equalsIgnoreCase(type)) return new OptimizedTabulation();
        throw new IllegalArgumentException("Unknown");
    }
}
