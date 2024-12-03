
import java.util.Arrays;

public class Kata {
    public static String[] capMe(String[] strings) {
        return Arrays.stream(strings)
            .map(s -> s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase())
            .toArray(String[]::new);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(capMe(new String[] {"jo", "nelson", "jurie"})));
    }
}