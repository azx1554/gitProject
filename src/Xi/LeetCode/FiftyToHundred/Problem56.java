package Xi.LeetCode.FiftyToHundred;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Given a collection of intervals, merge all overlapping intervals.
 * <p>
 * Input: [[1,3],[2,6],[8,10],[15,18]] <br>
 * Output: [[1,6],[8,10],[15,18]] <br>
 * Explanation: Since intervals [1,3] and [2,6] overlaps, merge them into [1,6].
 */
public class Problem56 {
    public List<Interval> merge(List<Interval> intervals) {

        LinkedList<Interval> result = new LinkedList<>();

        Collections.sort(intervals, (o1, o2) -> {
            if (o1.start == o2.start)
                return 0;
            return o1.start > o2.start ? 1 : -1;
        });

        for (Interval interval : intervals) {
            if (result.isEmpty() || result.getLast().end < interval.start) {
                result.add(interval);
            } else if (result.getLast().end < interval.end) {
                result.getLast().end = interval.end;
            }
        }

        return result;

    }

    class Interval {
        int start;
        int end;

        Interval() {
            start = 0;
            end = 0;
        }

        Interval(int s, int e) {
            start = s;
            end = e;
        }
    }
}


