import java.util.*;

class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {

        List<int[]> result = new ArrayList<>();

        for (int[] interval : intervals) {

            // Case 1: Current interval is before newInterval
            if (interval[1] < newInterval[0]) {
                result.add(interval);
            }

            // Case 2: Current interval is after newInterval
            else if (interval[0] > newInterval[1]) {
                result.add(newInterval);
                newInterval = interval;
            }

            // Case 3: Overlap
            else {
                newInterval[0] = Math.min(newInterval[0], interval[0]);
                newInterval[1] = Math.max(newInterval[1], interval[1]);
            }
        }

        // Add the final merged interval
        result.add(newInterval);

        return result.toArray(new int[result.size()][]);
    }
}