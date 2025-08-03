import java.util.Arrays;

public class Counter {
    public static int countSheeps(Boolean[] arr) {     
        return (int) Arrays.stream(arr).filter(c -> c != null && c == true).count();
    }
}