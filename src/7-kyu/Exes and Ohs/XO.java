public class XO {
    public static boolean getXO(String str) {
        int xs = 0;
        int os = 0;

        for (char c : str.toCharArray()) {
            if (Character.toLowerCase(c) == 'x')
                xs++;
            else if (Character.toLowerCase(c) == 'o')
                os++;
        }

        return xs == os;
    }
}