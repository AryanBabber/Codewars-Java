class Composing {

    public static String compose(String s1, String s2) {

        String[] lines1 = s1.split("\n");
        String[] lines2 = s2.split("\n");

        int n = lines1.length;
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < n; i++) {

            String part1 = lines1[i].substring(0, i + 1);

            String part2 = lines2[n - i - 1].substring(0, n - i);

            result.append(part1).append(part2);
            if (i < n - 1) {
                result.append("\n");
            }
        }

        return result.toString();
    }

}