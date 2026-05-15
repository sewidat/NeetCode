package org.example.intervals;

import java.util.Arrays;

/**
 * ============================================================
 * LeetCode #252 - Meeting Rooms
 * Difficulty: Easy
 * Category: Intervals
 * ============================================================
 *
 * PROBLEM
 * -------
 * Given an array of meeting time intervals where intervals[i] = [start_i, end_i],
 * determine if a person can attend all meetings (i.e., no two meetings overlap).
 * Return true if they can attend all meetings, false otherwise.
 *
 * Note: LeetCode #252 is a premium problem. NeetCode includes it as
 * "Meeting Schedule" in its free roadmap.
 *
 * CONSTRAINTS
 * -----------
 * - 0 <= intervals.length <= 10^4
 * - intervals[i].length == 2
 * - 0 <= start_i < end_i <= 10^6
 *
 * EXAMPLES
 * --------
 * Input: [[0,30],[5,10],[15,20]]  Output: false  ([0,30] overlaps with [5,10])
 * Input: [[7,10],[2,4]]           Output: true   (no overlap after sorting)
 *
 * INTUITION & APPROACH
 * --------------------
 * Sort intervals by start time. Then perform a single linear scan:
 * if any consecutive pair has intervals[i].end > intervals[i+1].start, the
 * two meetings overlap and the person cannot attend all — return false.
 * If no conflict is found, return true.
 *
 * KEY CONCEPTS
 * ------------
 * - Sort by start time
 * - Check each adjacent pair for overlap: prev.end > next.start
 * - Single pass after sorting
 *
 * COMPLEXITY TARGETS
 * ------------------
 * Time:  O(n log n)
 * Space: O(1)
 * ============================================================
 */
public class P252MeetingRooms {

    public boolean canAttendMeetings(int[][] intervals) {
        // TODO: implement
        return false;
    }

    public static void main(String[] args) {
        // P252MeetingRooms sol = new P252MeetingRooms();
        // System.out.println(sol.canAttendMeetings(new int[][]{{0,30},{5,10},{15,20}})); // false
        // System.out.println(sol.canAttendMeetings(new int[][]{{7,10},{2,4}}));          // true
        System.out.println("P252MeetingRooms — uncomment examples above to test.");
    }
}
