public class Bud {
    public static int howManyYears(String date1, String date2) {
        int y1 = Integer.parseInt(date1.split("/")[0]);
        int y2 = Integer.parseInt(date2.split("/")[0]);

        return Math.abs(y1 - y2);
    }
}