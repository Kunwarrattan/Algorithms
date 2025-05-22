package packages.com.practice.programs.string;

/**
 * CountVowelsConsonants - TODO: Implement this program
 */
public class CountVowelsConsonants {

    public void countVowelsConsonants(String str) {
        int vowels = 0;
        int consonants = 0;
        for (char c : str.toCharArray()) {
            if (c == ' ') {
                continue;
            }
            if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' || c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowels++;
            } else {
                consonants++;
            }
        }
        System.out.println("Vowels: " + vowels + " Consonants: " + consonants + "");
    }

    public static void main(String[] args) {
        CountVowelsConsonants countVowelsConsonants = new CountVowelsConsonants();
        countVowelsConsonants.countVowelsConsonants("Hello World");
    }
}
