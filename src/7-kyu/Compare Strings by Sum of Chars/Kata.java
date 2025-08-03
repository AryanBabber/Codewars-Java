public class Kata {
    public static boolean compare(String str1, String str2) {
        str1 = (str1 != null) ? str1 : "";
        str2 = (str2 != null) ? str2 : "";

        if (!isAlphabetic(str1))
            str1 = "";
        if (!isAlphabetic(str2))
            str2 = "";

        str1 = str1.toUpperCase();
        str2 = str2.toUpperCase();

        return sumAscii(str1) == sumAscii(str2);
    }

    private static boolean isAlphabetic(String str) {
        return str.matches("^[a-zA-Z]*$");
    }

    private static int sumAscii(String str) {
        return str.chars().map(c -> (int) c).sum();
    }
}
