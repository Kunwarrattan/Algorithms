package packages.algo.java.program.recursion.basic;

public class Print1toN {
    private static void print(int n, int i) {
        if (i > n) return;
        System.out.println(i);
        print(n, i + 1);
    }

    public static void main(String[] args) {
        int n = 5;
        print(n, 1);
    }
}
