package packages.algo.java.program.dynamic.medium.climbingStairs1Medium;

public class OptimizedTabulation implements ClimbingStairs {
    @Override
    public int climbStairs(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;

        int first = 1, second = 2;
        int sum = 0;
        for (int i = 3; i <= n; i++) {
            sum = first + second;
            first = second;
            second = sum;
        }
        return sum;
    }
}
