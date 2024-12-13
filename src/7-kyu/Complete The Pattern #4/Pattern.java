public class Pattern {

	public static String pattern(int n) {
        if(n <= 0) return "";
        String[] ans = new String[n];
        for (int j = 1; j <= n; j++) {
            String temp = "";
            for(int i = j; i <= n; i++) {
                temp += i;
            }
            ans[j-1] = temp;
        }

        return String.join("\n", ans);
    }
}
