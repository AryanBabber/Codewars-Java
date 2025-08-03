

public class SpinWords {

    public String spinWords(String sentence) {
        String[] strArr = sentence.split(" ");
        String[] solution = new String[strArr.length];

        for(int i = 0; i < strArr.length; i++) {
            String s = strArr[i];
            if(s.length() >= 5) {
                solution[i] = reverseString(s);
            } else {
                solution[i] = s;
            }
        }

        return String.join(" ", solution);
    }

    public String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static void main(String[] args) {
        SpinWords s = new SpinWords();
        System.out.println(s.spinWords("Hey fellow warriors"));
    }
}