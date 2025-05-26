package packages.com.practice.programs.string;

/**
 * CheckAnagramStrings - TODO: Implement this program
 */
public class CheckAnagramStrings {
    boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;
        int[] arr = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            arr[s1.charAt(i) - 'a']++;
            arr[s2.charAt(i) - 'a']--;
        }

        for (int i : arr) {
            if (i != 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        CheckAnagramStrings c = new CheckAnagramStrings();
        System.out.println(c.isAnagram("abca", "bcad"));
        System.out.println(c.isAnagram("abc", "bca"));
        System.out.println(c.isAnagram("abc", "abca"));
    }
}
