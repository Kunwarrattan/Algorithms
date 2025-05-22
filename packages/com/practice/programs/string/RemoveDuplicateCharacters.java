package packages.com.practice.programs.string;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * RemoveDuplicateCharacters - TODO: Implement this program
 */
public class RemoveDuplicateCharacters {

    String removeDuplicateCharacters(String str) {
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for (Character c : str.toCharArray()) {
            set.add(c);
        }
        StringBuilder sb = new StringBuilder();
        Iterator<Character> iterator = set.iterator();
        while (iterator.hasNext()) {
            sb.append(iterator.next());
        }
        return sb.toString();
    }


    public static void main(String[] args) {
        RemoveDuplicateCharacters obj = new RemoveDuplicateCharacters();
        String str = "Hello World";
        System.out.println(obj.removeDuplicateCharacters(str));
    }
}
