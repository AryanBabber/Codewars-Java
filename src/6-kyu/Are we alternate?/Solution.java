
public class Solution {
    public static boolean isAlt(String word) {
        String vowels = "aeiou";

        for (int i = 1; i < word.length(); i++) {
            boolean isPrevVowel = vowels.indexOf(word.charAt(i - 1)) != -1;
            boolean isCurrVowel = vowels.indexOf(word.charAt(i)) != -1;

            if (isPrevVowel == isCurrVowel) {
                return false;
            }
        }

        return true;
    }
}