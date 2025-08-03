public class Solution {
    public static String decode(int[] code, int key) {
        String nString = Integer.toString(key);
        int[] arr = new int[nString.length()];
        for (int i = 0; i < nString.length(); i++) {
            arr[i] = Character.getNumericValue(nString.charAt(i));
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0, j = 0; i < code.length; i++) {
            if (j >= arr.length) {
                j = 0;
            }
            int decodedValue = code[i] - arr[j];
            result.append((char) (decodedValue + 96));
            j++;
        }

        return result.toString();
    }
}