public class Kata {
    public static boolean bestFriend(String txt, char a, char b) {
        if (txt.endsWith(String.valueOf(a)))
            return false;

        while (txt.contains(String.valueOf(a))) {
            int aIndex = txt.indexOf(a);
            if (txt.charAt(aIndex + 1) != b)
                return false;
            txt = txt.substring(aIndex + 1);
        }

        return true;
    }
}