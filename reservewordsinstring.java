import java.util.*;

public class reservewordsinstring {
    public static String reverseWords(String str) {

        String[] words = str.split("\\s+");
        StringBuilder reversed = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]).append(" ");
        }
        return reversed.toString().trim();
    }
    public static void main(String[] args) {
        // Example usage
        String input = "Hello A.K!";
        String reversed = reverseWords(input);
        System.out.println("Original: " + input);
        System.out.println("Reversed: " + reversed);
    }
}
