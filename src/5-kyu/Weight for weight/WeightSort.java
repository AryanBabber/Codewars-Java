import java.util.Arrays;

public class WeightSort {

    public static String orderWeight(String strng) {
        if (strng == null || strng.isEmpty()) {
            return "";
        }

        String[] nums = strng.split(" ");

        Arrays.sort(nums, (String s1, String s2) -> {
            int weight1 = calculateWeight(s1);
            int weight2 = calculateWeight(s2);
            
            if (weight1 != weight2) {
                return Integer.compare(weight1, weight2);
            } else {
                return s1.compareTo(s2); // Alphabetical comparison
            }
        });

        return String.join(" ", nums);
    }

    private static int calculateWeight(String s) {
        int weight = 0;
        for (char c : s.toCharArray()) {
            weight += Character.getNumericValue(c);
        }
        return weight;
    }
}