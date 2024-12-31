public class ReverseWords {

    public static String reverseWords(String str) {
        String[] arr = str.split(" ");
        String[] ans = new String[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {
            ans[arr.length - i - 1] = arr[i];
        }

        return String.join(" ", ans);
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("This is a toyota"));
    }
}