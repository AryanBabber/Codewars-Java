import java.util.Arrays;

public class Solution {
    public static boolean isAllPossibilities(int[] arg) {
        Arrays.sort(arg);
        int[] arr = new int[arg.length];
        for (int i = 0; i < arg.length; i++) {
            arr[i] = i;
        }

        return Arrays.equals(arg, arr);
    }

    public static void main(String[] args) {
        System.out.println(isAllPossibilities(new int[] {0,2,1,3}));
        System.out.println(isAllPossibilities(new int[] {0,2,1,3, 5}));
    }
}