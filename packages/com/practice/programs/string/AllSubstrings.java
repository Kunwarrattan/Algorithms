package packages.com.practice.programs.string;

/**
 * AllSubstrings - TODO: Implement this program
 */
public class AllSubstrings {
    public static void allSubString(String subString) {
        for (int i = 0; i < subString.length(); i++) {
            for (int j = i + 1; j <= subString.length(); j++) {
                System.out.println(subString.substring(i, j));
            }
        }
    }

    public static void main(String[] args) {
        allSubString("abcd");
    }
}
