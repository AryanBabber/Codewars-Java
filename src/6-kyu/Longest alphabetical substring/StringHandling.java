import java.util.*;

public class StringHandling {
    public static String longestAlpabeticalSubstring(String text) {
        String st = "abcdefghijklmnopqrstuvwxyz";
        List<String> arr = new ArrayList<>();
        StringBuilder s = new StringBuilder();
        int index = -1;

        for (int i = 0; i <= text.length(); i++) {
            if (i < text.length() && st.indexOf(text.charAt(i)) >= index) {
                index = st.indexOf(text.charAt(i));
                s.append(text.charAt(i));
            } else {
                if (s.length() > 0) {
                    arr.add(s.toString());
                }
                if (i < text.length()) {
                    i--;
                }
                index = -1;
                s.setLength(0);
            }
        }

        int max = arr.stream().mapToInt(String::length).max().orElse(0);
        return arr.stream().filter(v -> v.length() == max).findFirst().orElse("");
    }
}