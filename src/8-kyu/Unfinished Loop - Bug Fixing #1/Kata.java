import java.util.*;

class Kata {
    public static List CreateList(int number) {
        List<Integer> list = new ArrayList<>();

        for (int count = 1; count <= number; count++) {
            list.add(count);
        }

        return list;
    }
}