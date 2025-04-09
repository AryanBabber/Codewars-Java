public class Solution {
    static String toCamelCase(String s) {
        String[] strArr = s.replaceAll("[-_]", " ").split(" ");

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strArr.length; i++) {
            if (i == 0) {
                sb.append(strArr[i]);
            } else {
                sb.append(strArr[i].substring(0, 1).toUpperCase())
                        .append(strArr[i].substring(1).toLowerCase());
            }
        }

        return sb.toString();
    }
}