import java.util.*;

public class SimpleLetterRemoval {
    public static String solve(String s, int k) {
        List<Character> chars = new ArrayList<>();
        for (char c : s.toCharArray()) {
            chars.add(c);
        }

        for (char letter = 'a'; letter <= 'z' && k > 0; letter++) {
            Iterator<Character> iterator = chars.iterator();
            while (iterator.hasNext() && k > 0) {
                if (iterator.next() == letter) {
                    iterator.remove();
                    k--;
                }
            }
        }

        StringBuilder result = new StringBuilder();
        for (char c : chars) {
            result.append(c);
        }
        return result.toString();
    }
}