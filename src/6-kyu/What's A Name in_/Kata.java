public class Kata {

    public static boolean nameInStr(String str, String name) {
        str = str.toLowerCase();
        name = name.toLowerCase();
        int pointer = 0;
        for (char c : str.toCharArray()) {
            if (pointer < name.length() && c == name.charAt(pointer))
                pointer++;
        }
        return pointer == name.length();
    }
}