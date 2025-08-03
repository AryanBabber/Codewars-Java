import java.util.Arrays;
import java.util.List;

class MinMax {
    static int[] getMinMax(List<Integer> list) {
        int min = list.stream().min(Integer::compareTo).get();
        int max = list.stream().max(Integer::compareTo).get();
        
        return new int[] {min, max};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(getMinMax(List.of(1))));
    }
}