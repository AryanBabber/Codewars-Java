public class ShortLongShort {
    public static String solution(String a, String b) {
        String shortStr = a.length() > b.length() ? b : a;
        String longStr = a.length() > b.length() ? a : b;

        return shortStr + longStr + shortStr;
    }
}