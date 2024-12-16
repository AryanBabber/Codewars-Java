class Nerd {
    public static String nerdify(String txt) {
        return txt
                .replaceAll("[aA]", "4")
                .replaceAll("l", "1")
                .replaceAll("[eE]", "3");
    }
}