import java.util.function.Function;

public class Opstrings {

    public static String rot90Clock(String str1) {
        String[] arr = str1.split("\n");
        int n = arr.length;
        StringBuilder[] arr2 = new StringBuilder[n];

        for (int i = 0; i < n; i++) {
            arr2[i] = new StringBuilder();
        }

        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j >= 0; j--) {
                arr2[i].append(arr[j].charAt(i));
            }
        }

        return String.join("\n", arr2);
    }

    public static String diag1Sym(String str1) {
        String[] arr = str1.split("\n");
        int n = arr.length;
        StringBuilder[] arr2 = new StringBuilder[n];

        for (int i = 0; i < n; i++) {
            arr2[i] = new StringBuilder();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr2[i].append(arr[j].charAt(i));
            }
        }

        return String.join("\n", arr2);
    }

    public static String selfieAndDiag1(String str1) {
        String[] arr = str1.split("\n");
        int n = arr.length;
        StringBuilder[] arr2 = new StringBuilder[n];

        for (int i = 0; i < n; i++) {
            arr2[i] = new StringBuilder(arr[i]).append("|");
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr2[i].append(arr[j].charAt(i));
            }
        }

        return String.join("\n", arr2);
    }

    public static String oper(Function<String, String> fct, String s) {
        return fct.apply(s);
    }
}
