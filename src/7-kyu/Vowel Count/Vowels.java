import java.util.*;

public class Vowels {

    public static int getCount(String str) {
        return (int) Arrays.stream(str.split("")).filter(Vowels::isVowel).count();
    }

    private static boolean isVowel(String s) {
        String s1 = s.toLowerCase();
        return "a".equals(s1) || "e".equals(s1) || "i".equals(s1) || "o".equals(s1) || "u".equals(s1);
    }
}