import java.util.Arrays;

public class EvenNumbers {
    public static int[] divisibleBy(int[] numbers, int divider) {
        return Arrays.stream(numbers).filter(v -> v % divider == 0).toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(divisibleBy(new int[] {1,2,3,4,5,6,7,8}, 4)));
    }
}