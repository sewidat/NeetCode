package org.example.intervals;

import java.util.ArrayList;
import java.util.List;

/**
 * ============================================================
 * LeetCode #57 - Insert Interval
 * Difficulty: Medium
 * Category: Intervals
 * ============================================================
 *
 * PROBLEM
 * -------
 * Given an array of non-overlapping intervals sorted in ascending order by
 * start time, and a newInterval to insert, insert the new interval and merge
 * any overlapping intervals. Return the resulting sorted, non-overlapping
 * interval list.
 *
 * CONSTRAINTS
 * -----------
 * - 0 <= intervals.length <= 10^4
 * - intervals is sorted by start time
 * - intervals are non-overlapping before insertion
 * - intervals[i].length == 2; newInterval.length == 2
 *
 * EXAMPLES
 * --------
 * Input: intervals=[[1,3],[6,9]], newInterval=[2,5]
 * Output: [[1,5],[6,9]]
 *
 * Input: intervals=[[1,2],[3,5],[6,7],[8,10],[12,16]], newInterval=[4,8]
 * Output: [[1,2],[3,10],[12,16]]
 *
 * INTUITION & APPROACH
 * --------------------
 * Three-phase linear scan:
 *   Phase 1 — Before overlap: add all intervals whose end < newInterval.start
 *             (they finish before the new interval begins).
 *   Phase 2 — Overlap / Merge: while current interval's start <= newInterval.end,
 *             the intervals overlap — expand newInterval to cover both:
 *             newInterval.start = min(...), newInterval.end = max(...).
 *             Add the merged newInterval.
 *   Phase 3 — After overlap: add all remaining intervals unchanged.
 *
 * KEY CONCEPTS
 * ------------
 * - Three-phase insertion (before / overlap / after)
 * - Overlap condition: interval.start <= newInterval.end AND
 *                      interval.end   >= newInterval.start
 * - Merge by taking min of starts and max of ends
 *
 * COMPLEXITY TARGETS
 * ------------------
 * Time:  O(n)
 * Space: O(n)
 * ============================================================
 */
public class P57InsertInterval {

    public int[][] insert(int[][] intervals, int[] newInterval) {
        // TODO: implement
        return new int[0][];
    }

    public static void main(String[] args) {
        // P57InsertInterval sol = new P57InsertInterval();
        // int[][] r1 = sol.insert(new int[][]{{1,3},{6,9}}, new int[]{2,5});
        // // expected [[1,5],[6,9]]
        // int[][] r2 = sol.insert(new int[][]{{1,2},{3,5},{6,7},{8,10},{12,16}}, new int[]{4,8});
        // // expected [[1,2],[3,10],[12,16]]
        System.out.println("P57InsertInterval — uncomment examples above to test.");
    }
}
