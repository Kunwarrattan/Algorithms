package packages.algo.java.program.strings;

public class AllPermutationsOfString {

    public static void main(String[] args) {
        String input = "ABC";
        System.out.println("All permutations of: " + input);
        permute(input, 0, input.length() - 1);
    }

    public static void permute(String str, int left, int right) {
        if (left == right) {
            System.out.println(str);
        } else {
            for (int i = left; i <= right; i++) {
                str = swap(str, left, i);           // swap current index with i
                permute(str, left + 1, right);      // recursively permute the rest
                str = swap(str, left, i);           // backtrack
            }
        }
    }

    private static String swap(String str, int i, int j) {
        char[] chars = str.toCharArray();
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
        return new String(chars);
    }
}

