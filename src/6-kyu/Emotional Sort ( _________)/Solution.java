import java.util.Arrays;

public class Solution {

    public static String[] sortEmotions(boolean order, String[] arr) {
        String[] emotions = { ":D", ":)", ":|", ":(", "T_T" };

        Arrays.sort(arr, (a, b) -> {
            int indexA = Arrays.asList(emotions).indexOf(a);
            int indexB = Arrays.asList(emotions).indexOf(b);
            return order ? Integer.compare(indexA, indexB) : Integer.compare(indexB, indexA);
        });

        return arr;
    }

}