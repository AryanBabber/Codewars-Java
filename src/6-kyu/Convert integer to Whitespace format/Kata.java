public class Kata {
    public static String whitespaceNumber(final int n) {
        String binary = Integer.toBinaryString(Math.abs(n));
        StringBuilder result = new StringBuilder();

        if (n == 0) {
            return " \n";
        }

        if (n < 0) {
            result.append("\t");
        } else {
            result.append(" ");
        }

        for (char bit : binary.toCharArray()) {
            if (bit == '1') {
                result.append("\t");
            } else {
                result.append(" ");
            }
        }

        result.append("\n");
        return result.toString();
    }
}