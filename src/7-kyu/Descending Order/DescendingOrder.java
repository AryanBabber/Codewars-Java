
import java.util.Arrays;

public class DescendingOrder {
  public static int sortDesc(final int num) {
    int temp = num;
    int[] arr = Arrays.stream(String.valueOf(temp).split("")).mapToInt(Integer::parseInt).toArray();
    Arrays.sort(arr);

    int ans = 0;

    for(int i = arr.length - 1; i >= 0; i--) {
      ans = ans * 10 + arr[i];
    }

    return ans;
  }

  public static void main(String[] args) {
    System.out.println(sortDesc(412653));
  }
}