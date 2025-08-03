import java.util.*;

public class CompoundArray {
  public static int[] compoundArray(int[] a, int[] b) {
    List<Integer> li = new ArrayList<>();
    int min = Math.min(a.length, b.length);

    for (int i = 0; i < min; i++) {
      li.add(a[i]);
      li.add(b[i]);
    }

    for (int i = min; i < Math.max(a.length, b.length); i++) {
      if (i >= b.length) {
        li.add(a[i]);
      } else {
        li.add(b[i]);
      }
    }

    return li.stream().mapToInt(Integer::intValue).toArray();
  }
}