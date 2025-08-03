public class Kata {

    public static int golfScoreCalculator(String parList, String scoreList) {
        int score = 0;
        int par = 0;
        for (int i = 0; i < 18; i++) {
            score += Integer.parseInt(scoreList.substring(i, i + 1));
            par += Integer.parseInt(parList.substring(i, i + 1));
        }

        return score - par;
    }

    public static void main(String[] args) {
        System.out.println(golfScoreCalculator("443454444344544443", "353445334534445344"));
    }
}