package packages.com.practice.programs.string;

/**
 * StringPermutations - TODO: Implement this program
 */
public class StringPermutations {
    public static void permute(char[] chars, int index) {
        if (index == chars.length - 1) {
            System.out.println(chars);
            return;
        }

        for (int i = index; i < chars.length; i++) {
            swap(chars, index, i);
            permute(chars, index + 1);
            swap(chars, index, i);
        }
    }

    private static void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }

    public static void main(String[] args) {
        String str = "ABCD";
        permute(str.toCharArray(), 0);
    }
}
