public class Maskify {
    public static String maskify(String str) {
        return "#".repeat(Math.max(str.length() - 4, 0)) + str.substring(Math.max(str.length() - 4, 0));
    }
}
