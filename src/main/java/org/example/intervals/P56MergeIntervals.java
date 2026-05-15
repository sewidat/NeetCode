package org.example.intervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ============================================================
 * LeetCode #56 - Merge Intervals
 * Difficulty: Medium
 * Category: Intervals
 * ============================================================
 *
 * PROBLEM
 * -------
 * Given an array of intervals where intervals[i] = [start_i, end_i], merge
 * all overlapping intervals and return an array of the non-overlapping
 * intervals that cover all the intervals in the input.
 *
 * CONSTRAINTS
 * -----------
 * - 1 <= intervals.length <= 10^4
 * - intervals[i].length == 2
 * - 0 <= start_i <= end_i <= 10^4
 *
 * EXAMPLES
 * --------
 * Input: [[1,3],[2,6],[8,10],[15,18]]  Output: [[1,6],[8,10],[15,18]]
 * Input: [[1,4],[4,5]]                 Output: [[1,5]]
 *
 * INTUITION & APPROACH
 * --------------------
 * Sort intervals by start time. Maintain a result list, initialised with
 * the first interval. For each subsequent interval:
 *   - If its start <= last interval's end, they overlap — merge by updating
 *     last interval's end to max(last.end, current.end).
 *   - Otherwise, no overlap — append current interval to result.
 * Sorting ensures we only need to compare with the last merged interval.
 *
 * KEY CONCEPTS
 * ------------
 * - Sort by start time first
 * - Merge condition: current.start <= prev.end
 * - Merge by extending prev.end = max(prev.end, current.end)
 *
 * COMPLEXITY TARGETS
 * ------------------
 * Time:  O(n log n)
 * Space: O(n)
 * ============================================================
 */
public class P56MergeIntervals {

    public int[][] merge(int[][] intervals) {
        // TODO: implement
        return new int[0][];
    }

    public static void main(String[] args) {
        // P56MergeIntervals sol = new P56MergeIntervals();
        // int[][] r1 = sol.merge(new int[][]{{1,3},{2,6},{8,10},{15,18}});
        // // expected [[1,6],[8,10],[15,18]]
        // int[][] r2 = sol.merge(new int[][]{{1,4},{4,5}});
        // // expected [[1,5]]
        System.out.println("P56MergeIntervals — uncomment examples above to test.");
    }
}
