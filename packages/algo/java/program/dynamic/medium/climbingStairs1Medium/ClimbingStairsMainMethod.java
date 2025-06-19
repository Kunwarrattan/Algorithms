package packages.algo.java.program.dynamic.medium.climbingStairs1Medium;

public class ClimbingStairsMainMethod {
    public static void main(String[] args) {
        System.out.println("Climbing Stairs");
        long nb;
        long sb = System.nanoTime();
        ClimbingStairs climbingStairs = ClimbingStairsFactory.createClimbingStairs("NaiveApproach");
        System.out.println(climbingStairs.climbStairs(30));
        nb = System.nanoTime() - sb;
        System.out.println("NaiveApproach Time = "+nb);

        sb = System.nanoTime();
        climbingStairs = ClimbingStairsFactory.createClimbingStairs("Memoization");
        System.out.println(climbingStairs.climbStairs(30));
        nb = System.nanoTime() - sb;
        System.out.println("Memoization Time = "+ nb);

        sb = System.nanoTime();
        climbingStairs = ClimbingStairsFactory.createClimbingStairs("Tabulation");
        System.out.println(climbingStairs.climbStairs(30));
        nb = System.nanoTime() - sb;
        System.out.println("Tabulation Time = " + nb);

        sb = System.nanoTime();
        climbingStairs = ClimbingStairsFactory.createClimbingStairs("OptimizedTabulation");
        System.out.println(climbingStairs.climbStairs(30));
        nb = System.nanoTime() - sb;
        System.out.println("OptimizedTabulation Time = " + nb);
    }
}
