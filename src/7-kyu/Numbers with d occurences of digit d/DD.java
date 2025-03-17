public class DD {
    public static boolean isDD(int n) {
       String str = Integer.toString(n);
       if (str.length() - str.replace("1", "").length() == 1) return true;
       if (str.length() - str.replace("2", "").length() == 2) return true;
       if (str.length() - str.replace("3", "").length() == 3) return true;
       if (str.length() - str.replace("4", "").length() == 4) return true;
       if (str.length() - str.replace("5", "").length() == 5) return true;
       if (str.length() - str.replace("6", "").length() == 6) return true;
       if (str.length() - str.replace("7", "").length() == 7) return true;
       if (str.length() - str.replace("8", "").length() == 8) return true;
       if (str.length() - str.replace("9", "").length() == 9) return true;
       return false;
    }
}
