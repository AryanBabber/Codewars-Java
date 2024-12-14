
import java.util.*;

class Crypto {

    public static String wordPattern(final String word) {
        StringBuilder sb = new StringBuilder();
        String lower = word.toLowerCase();
        Map<Character, Integer> charToIndex = new LinkedHashMap<>();
        int counter = 0;

        for (char c : lower.toCharArray()) {
            if(!charToIndex.containsKey(c)) {
                charToIndex.put(c, counter++);
            }
            sb.append(charToIndex.get(c)).append(".");
        }

        return sb.substring(0, sb.length() - 1);
    }

    public static void main(String[] args) {
        String[][] tests = {
            {"hello", "0.1.2.2.3"},
            {"heLlo", "0.1.2.2.3"},
            {"helLo", "0.1.2.2.3"},
            {"Hippopotomonstrosesquippedaliophobia", "0.1.2.2.3.2.3.4.3.5.3.6.7.4.8.3.7.9.7.10.11.1.2.2.9.12.13.14.1.3.2.0.3.15.1.13"},
        };

        for(String[] arr : tests) {
            System.out.printf("%s = %s? %s%n", arr[0], wordPattern(arr[0]), wordPattern(arr[0]).equals(arr[1]));
        }
    }
}