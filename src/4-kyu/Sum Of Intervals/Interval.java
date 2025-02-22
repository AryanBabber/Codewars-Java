import java.util.Arrays;

public class Interval {
    public static int sumIntervals(int[][] intervals) {
        if (intervals == null || intervals.length == 0)
            return 0;

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        int totalLength = 0;
        int start = intervals[0][0];
        int end = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {
            int currentStart = intervals[i][0];
            int currentEnd = intervals[i][1];

            if (currentStart <= end) {

                end = Math.max(end, currentEnd);
            } else {
                totalLength += end - start;
                start = currentStart;
                end = currentEnd;
            }
        }

        totalLength += end - start;

        return totalLength;
    }
}
