import java.util.List;

public class Kata {
  public static List<Object> filterList(final List<Object> list) {
    return list.stream().filter(v -> !v.getClass().getSimpleName().equals("String")).toList();
  }
}
