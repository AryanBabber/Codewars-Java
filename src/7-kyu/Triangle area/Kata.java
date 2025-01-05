public class Kata {
    public static float tArea(String tStr) {
        float a = -2f;
        for (int i = 0; i < tStr.length(); i++) {
            if (tStr.charAt(i) == '\n') {
                a++;
            }
        }
        return (float) (Math.pow(a, 2) / 2);
    }
}