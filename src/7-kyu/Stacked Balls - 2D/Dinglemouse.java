public class Dinglemouse {

    public static double stackHeight2d(int layers) {
        if (layers == 0) {
            return 0;
        }
        return ((layers - 1) * Math.sqrt(3)) / 2 + 1;
    }

}
