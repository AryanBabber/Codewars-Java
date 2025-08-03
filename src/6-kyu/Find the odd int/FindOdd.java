
import java.util.*;

public class FindOdd {
    public static int findIt(int[] a) {
        return Arrays.stream(a).reduce(0, (k,v) -> k ^ v);
    }

    public static void main(String[] args) {
        System.out.println(findIt(new int[] {1,1,2,2,3,3,3,4,4,4,4}));
    }
}