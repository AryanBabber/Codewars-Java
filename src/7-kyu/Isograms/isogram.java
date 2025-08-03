
import java.util.regex.Pattern;

public class isogram {
    public static boolean isIsogram(String str) {
        return !Pattern.compile("(?i)([a-z]).*\\1").matcher(str).find();
    }
}