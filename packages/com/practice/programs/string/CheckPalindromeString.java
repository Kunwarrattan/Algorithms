package packages.com.practice.programs.string;

/**
 * CheckPalindromeString - TODO: Implement this program
 */
public class CheckPalindromeString {
    boolean isPalindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "madam";
        CheckPalindromeString checkPalindromeString = new CheckPalindromeString();
        System.out.println(checkPalindromeString.isPalindrome(str));
    }
}
