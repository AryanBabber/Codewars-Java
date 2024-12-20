
import java.util.Arrays;


public class ArrayReverser {
    public static String[] reverse(String[] a) {
        StringBuilder str = new StringBuilder();

        for (String s : a) {
            str.append(s);
        }

        int start = 0;
        String[] ans = new String[a.length];
        String rev = str.reverse().toString();

        for (int i = 0; i < a.length; i++) {
            int len = a[i].length();
            ans[i] = rev.substring(start, start+len);
            start += len;
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(reverse(new String[] {"I", "like", "latinas"})));
    }
}