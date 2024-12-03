public class Kata {
    public static boolean validSpacing(String s) {
        // write your code here
        return s.equals(s.trim()) && s.equals(s.replaceAll("\\s{2,}", " "));
    }
}