public class TenMinWalk {
    public static boolean isValid(char[] walk) {
        if (walk.length != 10)
            return false;

        byte x = 0;
        byte y = 0;

        for (char c : walk) {
            switch (c) {
                case 'n' -> y++;
                case 's' -> y--;
                case 'e' -> x++;
                case 'w' -> x--;
            }
        }

        return x == 0 && y == 0;
    }
}