package packages.com.practice.programs.string;

/**
 * RemoveSpacesFromString - TODO: Implement this program
 */
public class RemoveSpacesFromString {
    String removeSpaces(String str) {
        StringBuilder sb = new StringBuilder();
        for(Character c : str.toCharArray()){
            if(!Character.isWhitespace(c))
                sb.append(c);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        RemoveSpacesFromString obj = new RemoveSpacesFromString();
        System.out.println(obj.removeSpaces("Hello World !"));
    }
}
