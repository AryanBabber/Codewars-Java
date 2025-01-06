import java.util.Arrays;

class Solution {
    public static int solve(int[] arr) {
        Arrays.sort(arr);

        int x = arr[0];
        int y = arr[1];
        int z = arr[2];

        return Math.min(x + y, (x + y + z) / 2);
    }
}