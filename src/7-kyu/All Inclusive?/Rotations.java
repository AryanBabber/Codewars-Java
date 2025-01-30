import java.util.List;

public class Rotations {
    
    public static boolean containAllRots(String str, List<String> arr) {
        for (int i = 0; i < str.length(); i++) {
            String rotation = str.substring(i) + str.substring(0, i);
            if (!arr.contains(rotation)) {
                return false;
            }
        }
        return true;
    }
}