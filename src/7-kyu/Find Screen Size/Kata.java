
import java.util.Arrays;

public class Kata {
    public static String findScreenHeight(int width, String ratio) {
        int[] ratioArr = Arrays.stream(ratio.split(":")).mapToInt(Integer::parseInt).toArray();
        int height = width * ratioArr[1] / ratioArr[0];

        return width + "x" + height;
    }

    public static void main(String[] args) {
        System.out.println(findScreenHeight(3840, "32:9"));
        System.out.println(findScreenHeight(1280, "16:9"));
        System.out.println(findScreenHeight(1024, "4:3"));
    }
}