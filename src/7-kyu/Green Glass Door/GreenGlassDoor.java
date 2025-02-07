public class GreenGlassDoor {
    boolean stepThroughWith(String s) {
        char last = s.charAt(0);

        for(int i = 1; i < s.length(); i++) {
            if(last == s.charAt(i)) return true;
            last = s.charAt(i);
        }

        return false;
    }

    public static void main(String[] args) {
        GreenGlassDoor ggd = new GreenGlassDoor();
        System.out.println(ggd.stepThroughWith("comment"));
    }
}