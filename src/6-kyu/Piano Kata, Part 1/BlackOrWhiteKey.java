public class BlackOrWhiteKey {
    public static String blackOrWhiteKey(int keyPressCount) {
        return switch (((keyPressCount - 1) % 88) % 12) {
            case 1, 4, 6, 9, 11 -> "black";
            default -> "white";
        };
    }
}
