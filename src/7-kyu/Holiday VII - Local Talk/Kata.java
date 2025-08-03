public class Kata {
    public static String pak(final String s) {
        return String.join(" pak ", s.trim().split("\\s+"));
    }

}