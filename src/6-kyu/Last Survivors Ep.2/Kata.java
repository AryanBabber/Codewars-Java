import java.util.*;

public class Kata {
    private static final Map<String, String> dict = new HashMap<>();

    static {
        dict.put("aa", "b");
        dict.put("bb", "c");
        dict.put("cc", "d");
        dict.put("dd", "e");
        dict.put("ee", "f");
        dict.put("ff", "g");
        dict.put("gg", "h");
        dict.put("hh", "i");
        dict.put("ii", "j");
        dict.put("jj", "k");
        dict.put("kk", "l");
        dict.put("ll", "m");
        dict.put("mm", "n");
        dict.put("nn", "o");
        dict.put("oo", "p");
        dict.put("pp", "q");
        dict.put("qq", "r");
        dict.put("rr", "s");
        dict.put("ss", "t");
        dict.put("tt", "u");
        dict.put("uu", "v");
        dict.put("vv", "w");
        dict.put("ww", "x");
        dict.put("xx", "y");
        dict.put("yy", "z");
        dict.put("zz", "a");
    }

    public static String lastSurvivors(String str) {
        if (str.length() == 0)
            return "";

        while (str.length() != new HashSet<>(Arrays.asList(str.split(""))).size()) {
            str = processString(str);
        }
        return str;
    }

    private static String processString(String str) {
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        str = new String(charArray);

        StringBuilder result = new StringBuilder();
        int i = 0;
        while (i < str.length()) {
            if (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
                String pair = str.substring(i, i + 2);
                result.append(dict.getOrDefault(pair, pair));
                i += 2;
            } else {
                result.append(str.charAt(i));
                i++;
            }
        }
        return result.toString();
    }

}
