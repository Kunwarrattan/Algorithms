package packages.algo.java.program.dynamic.medium.climbingStairs1Medium;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Memoization implements ClimbingStairs {
    private final Map<Integer, Integer> memo = new ConcurrentHashMap<>();

    @Override
    public int climbStairs(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;
        if (!memo.containsKey(n))
            memo.put(n, climbStairs(n - 1) + climbStairs(n - 2));
        return memo.get(n);
    }
}
