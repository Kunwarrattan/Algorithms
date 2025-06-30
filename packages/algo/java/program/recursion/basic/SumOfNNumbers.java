package packages.algo.java.program.recursion.basic;

public class SumOfNNumbers {

    private static int sum(int n) {
        if (n == 1) return 1;
        System.out.println(n);
        return n + sum(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(sum(n));
    }
}
