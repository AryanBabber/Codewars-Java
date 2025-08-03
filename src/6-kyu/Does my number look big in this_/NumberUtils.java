public class NumberUtils {

    public static boolean isNarcissistic(int value) {
        String numStr = Integer.toString(value);
        int length = numStr.length();
        int sum = 0;

        for (int i = 0; i < length; i++) {
            int digit = Character.getNumericValue(numStr.charAt(i));
            sum += Math.pow(digit, length);
        }

        return sum == value;
    }

}