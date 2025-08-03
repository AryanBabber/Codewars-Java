
import java.util.regex.*;

public class IdentifierChecker {
    public static boolean isValid(String idn) {
        Pattern pattern = Pattern.compile("^[a-zA-Z$_][A-Za-z$_0-9]{0,}$");
        Matcher matcher = pattern.matcher(idn);

        return matcher.matches();
    }
}