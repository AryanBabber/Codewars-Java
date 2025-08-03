
import java.util.Arrays;

public class Solution {
    public static String[] createArrayOfTiers(int num) {
        int n = Integer.toString(num).length();

        String[] tiers = new String[n];
        
        for (int i = 0; i < tiers.length; i++) {
            tiers[i] = Integer.toString(num).substring(0, i+1);
        }

        return tiers;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(createArrayOfTiers(80085)));
    }
}