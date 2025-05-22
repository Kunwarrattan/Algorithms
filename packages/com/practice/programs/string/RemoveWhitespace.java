package packages.com.practice.programs.string;

/**
 * RemoveWhitespace - TODO: Implement this program
 */
public class RemoveWhitespace {
    String removeWhitespace(String str) {
        StringBuilder sb = new StringBuilder();
        for(Character c : str.toCharArray()){
            if(!Character.isWhitespace(c))
                sb.append(c);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        RemoveWhitespace obj = new RemoveWhitespace();
        System.out.println(obj.removeWhitespace("Hello World !"));
    }
}
