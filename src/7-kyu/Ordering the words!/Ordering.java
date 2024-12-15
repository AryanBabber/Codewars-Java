import java.util.Arrays;

public class Ordering {
    public String orderWord(String s) {
        // your great code here:
        if (s == "" || s == null)
            return "Invalid String!";
        char[] cArr = s.toCharArray();
        Arrays.sort(cArr);

        return new String(cArr);
    }
}