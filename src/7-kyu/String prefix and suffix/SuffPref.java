
import java.util.regex.*;

public class SuffPref {
    public static int solve(String s) {
        Pattern pattern = Pattern.compile("^(.*).*(\\1)$");
        Matcher matcher = pattern.matcher(s);

        if (matcher.find()) {
            return matcher.group(1).length();
        }

        return 0;
    }
    
    public static void main(String[] args) {
        System.out.println(solve("abcdefabcd"));
    }
}