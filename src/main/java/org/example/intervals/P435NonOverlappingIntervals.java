package org.example.intervals;

import java.util.Arrays;

/**
 * ============================================================
 * LeetCode #435 - Non-overlapping Intervals
 * Difficulty: Medium
 * Category: Intervals
 * ============================================================
 *
 * PROBLEM
 * -------
 * Given an array of intervals where intervals[i] = [start_i, end_i], return
 * the minimum number of intervals you need to remove to make the rest of
 * the intervals non-overlapping.
 *
 * CONSTRAINTS
 * -----------
 * - 1 <= intervals.length <= 10^5
 * - intervals[i].length == 2
 * - -5 * 10^4 <= start_i < end_i <= 5 * 10^4
 *
 * EXAMPLES
 * --------
 * Input: [[1,2],[2,3],[3,4],[1,3]]  Output: 1  (remove [1,3])
 * Input: [[1,2],[1,2],[1,2]]        Output: 2  (remove two of the three)
 * Input: [[1,2],[2,3]]              Output: 0  (already non-overlapping)
 *
 * INTUITION & APPROACH
 * --------------------
 * This is the classic Interval Scheduling Maximisation problem in disguise.
 * The minimum removals = total intervals - maximum non-overlapping intervals.
 * Greedy: sort by end time. Maintain the end time of the last kept interval.
 * For each interval:
 *   - If its start < lastEnd, it overlaps — we must remove one; prefer to
 *     remove the one with the later end (i.e., keep whichever ends earlier).
 *     Since we sorted by end time, the current interval ends no earlier than
 *     lastEnd, so we remove the current interval (increment count).
 *   - If its start >= lastEnd, no overlap — keep it, update lastEnd.
 *
 * KEY CONCEPTS
 * ------------
 * - Sort by end time (greedy keeps earliest-ending intervals)
 * - Overlap when current.start < lastEnd
 * - Count intervals removed; keep count of non-overlapping subset implicitly
 *
 * COMPLEXITY TARGETS
 * ------------------
 * Time:  O(n log n)
 * Space: O(1)
 * ============================================================
 */
public class P435NonOverlappingIntervals {

    public int eraseOverlapIntervals(int[][] intervals) {
        // TODO: implement
        return 0;
    }

    public static void main(String[] args) {
        // P435NonOverlappingIntervals sol = new P435NonOverlappingIntervals();
        // System.out.println(sol.eraseOverlapIntervals(new int[][]{{1,2},{2,3},{3,4},{1,3}})); // 1
        // System.out.println(sol.eraseOverlapIntervals(new int[][]{{1,2},{1,2},{1,2}}));        // 2
        // System.out.println(sol.eraseOverlapIntervals(new int[][]{{1,2},{2,3}}));              // 0
        System.out.println("P435NonOverlappingIntervals — uncomment examples above to test.");
    }
}
