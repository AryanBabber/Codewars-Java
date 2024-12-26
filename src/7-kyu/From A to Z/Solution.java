public class Solution {
    public static String gimmeTheLetters(String s) {
        String[] parts = s.split("-");
        char start = parts[0].charAt(0);
        char end = parts[1].charAt(0);

        StringBuilder result = new StringBuilder();

        for (char c = start; c <= end; c++) {
            result.append(c);
        }

        return result.toString();
    }
}