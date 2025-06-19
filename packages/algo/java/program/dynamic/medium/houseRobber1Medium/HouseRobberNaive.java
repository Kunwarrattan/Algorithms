package packages.algo.java.program.dynamic.medium.houseRobber1Medium;

public class HouseRobberNaive implements HouseRobber {
    @Override
    public int rob(int[] numbs) {
        return robHelper(numbs, numbs.length - 1);
    }

    private int robHelper(int[] numbs, int i) {
        if (i <= 0) return numbs[0];
        int rob = numbs[i] + robHelper(numbs, i - 2);
        int skip = robHelper(numbs, i - 1);
        return Math.max(rob, skip);
    }
}
