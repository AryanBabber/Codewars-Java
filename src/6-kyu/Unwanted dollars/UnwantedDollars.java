public class UnwantedDollars {
    public static double moneyValue(String money) {
        String cleaned = money.replaceAll("\\s+|\\$", "");
        try {
            return Double.parseDouble(cleaned);
        } catch (NumberFormatException e) {
            return 0.0;
        }
    }
}
