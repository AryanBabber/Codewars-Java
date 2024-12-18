public class Solution {
    public static String timeCorrect(String timestring) {
        if (timestring == null || !timestring.matches("\\d{2}:\\d{2}:\\d{2}")) {
            return null;
        }

        String[] t = timestring.split(":");
        int h = Integer.parseInt(t[0]);
        int m = Integer.parseInt(t[1]);
        int s = Integer.parseInt(t[2]);

        m += s / 60;
        s %= 60;
        h += m / 60;
        m %= 60;
        h %= 24;

        return String.format("%02d:%02d:%02d", h, m, s);
    }

}