import java.util.*;
import java.util.function.Function;

public class Opstrings {

    public static String rot90Counter(String strng) {
        String[] arr = strng.split("\n");
        int n = arr.length;
        StringBuilder[] arr2 = new StringBuilder[n];

        for (int i = 0; i < n; i++) {
            arr2[i] = new StringBuilder();
        }

        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j < n; j++) {
                arr2[n - 1 - i].append(arr[j].charAt(i));
            }
        }

        return String.join("\n", Arrays.stream(arr2).map(StringBuilder::toString).toArray(String[]::new));
    }

    public static String diag2Sym(String strng) {
        String[] arr = strng.split("\n");
        int n = arr.length;
        StringBuilder[] arr2 = new StringBuilder[n];

        for (int i = 0; i < n; i++) {
            arr2[i] = new StringBuilder();
        }

        for (int i = n - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                arr2[n - 1 - i].append(arr[j].charAt(i));
            }
        }

        return String.join("\n", Arrays.stream(arr2).map(StringBuilder::toString).toArray(String[]::new));
    }

    public static String selfieDiag2Counterclock(String strng) {
        String[] arr = strng.split("\n");
        String[] arr2 = diag2Sym(strng).split("\n");
        String[] arr3 = rot90Counter(strng).split("\n");

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            result.append(arr[i]).append("|").append(arr2[i]).append("|").append(arr3[i]);
            if (i < arr.length - 1) {
                result.append("\n");
            }
        }

        return result.toString();
    }

    public static String oper(Function<String, String> operator, String s) {
        return operator.apply(s);
    }
}