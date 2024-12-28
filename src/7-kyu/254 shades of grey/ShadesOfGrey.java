public class ShadesOfGrey {
    static String[] shadesOfGrey(int num) {
        if (num < 0)
            return new String[0];

        String[] ans = new String[Math.min(num, 254)];

        for (int i = 0; i < ans.length; i++) {
            String g = String.format("%02x", (i + 1));
            ans[i] = ("#" + g.repeat(3));
        }

        return ans;
    }
}