package packages.com.practice.programs.string;

/**
 * ReverseWordsInSentence - TODO: Implement this program
 */
public class ReverseWordsInSentence {
    String reverseWords(String str) {
        String[] words = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            sb.append(new StringBuilder(reverseWord(word)));
        }
        return sb.toString();
    }

    String reverseWord(String word) {
        StringBuilder sb = new StringBuilder();
        for (int i = word.length() - 1; i >= 0; i--) {
            sb.append(word.charAt(i));
        }
        return " " + sb.toString();
    }

    public static void main(String[] args) {
        String str = "Hello World ! My name is Kunwar";
        ReverseWordsInSentence rv = new ReverseWordsInSentence();
        System.out.println(" " + rv.reverseWords(str));
    }
}
