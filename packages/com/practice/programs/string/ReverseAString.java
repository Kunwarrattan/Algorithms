package packages.com.practice.programs.string;

/**
 * ReverseAString - TODO: Implement this program
 */
public class ReverseAString {
    String reverse(String str) {
        StringBuilder sb = new StringBuilder(str);

        for(int i=sb.length()-1;i>=0;i--){
            sb.append(sb.charAt(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        ReverseAString obj = new ReverseAString();
        System.out.println(obj.reverse(" Hello World "));
    }

}
