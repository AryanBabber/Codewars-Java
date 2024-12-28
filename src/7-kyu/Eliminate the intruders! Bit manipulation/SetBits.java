public class SetBits {
    public static long eliminateUnsetBits(String number) {
        if (number.length() == 0)
            return 0;
        String ones = String.join("", number.split("0"));
        return Long.parseLong(ones, 2);
    }

    public static void main(String[] args) {
        System.out.println(eliminateUnsetBits("11010101010101"));
        System.out.println(eliminateUnsetBits(""));
    }
}