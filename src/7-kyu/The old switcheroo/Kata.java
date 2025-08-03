public class Kata {
    public static String vowel2Index(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (isVowel(s.toLowerCase().charAt(i))) {
                sb.append(i + 1);
            } else
                sb.append(s.charAt(i));
        }

        return sb.toString();
    }

    private static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
