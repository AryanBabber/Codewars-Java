public class FirstNonRepeated {
    public static Character firstNonRepeated(String source) {
        for(char s : source.toCharArray()) {
            if(source.indexOf(s) == source.lastIndexOf(s)) {
                return s;
            }
        }

        return null;
    }

    public static void main(String[] args) {
        System.out.println(firstNonRepeated("teeter"));
        System.out.println(firstNonRepeated("test"));
        System.out.println(firstNonRepeated("aabbcc"));
    }
}