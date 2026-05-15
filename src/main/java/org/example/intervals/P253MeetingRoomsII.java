package org.example.intervals;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * ============================================================
 * LeetCode #253 - Meeting Rooms II
 * Difficulty: Medium
 * Category: Intervals
 * ============================================================
 *
 * PROBLEM
 * -------
 * Given an array of meeting time intervals where intervals[i] = [start_i, end_i],
 * return the minimum number of conference rooms required to hold all meetings
 * simultaneously without any conflicts.
 *
 * Note: LeetCode #253 is a premium problem. NeetCode includes it as
 * "Meeting Schedule II" in its free roadmap.
 *
 * CONSTRAINTS
 * -----------
 * - 1 <= intervals.length <= 10^4
 * - 0 <= start_i < end_i <= 10^6
 *
 * EXAMPLES
 * --------
 * Input: [[0,30],[5,10],[15,20]]  Output: 2
 * Input: [[7,10],[2,4]]           Output: 1
 *
 * INTUITION & APPROACH
 * --------------------
 * Sort meetings by start time. Use a min-heap that stores the end times of
 * currently-occupied rooms.
 * For each meeting:
 *   - If the room that ends earliest (heap.peek()) finishes at or before the
 *     current meeting's start, reuse that room: pop its end time and push
 *     the current meeting's end time.
 *   - Otherwise, all rooms are busy — allocate a new room: push current end.
 * The heap size at any point equals the number of rooms in use. The answer
 * is the maximum heap size, which equals the final heap size after processing
 * all meetings.
 *
 * KEY CONCEPTS
 * ------------
 * - Sort by start time
 * - Min-heap of end times tracks the earliest-available room
 * - Reuse room if heap.peek() <= current.start; else add new room
 * - Final heap size = minimum rooms needed
 *
 * COMPLEXITY TARGETS
 * ------------------
 * Time:  O(n log n)
 * Space: O(n)
 * ============================================================
 */
public class P253MeetingRoomsII {

    public int minMeetingRooms(int[][] intervals) {
        // TODO: implement
        return 0;
    }

    public static void main(String[] args) {
        // P253MeetingRoomsII sol = new P253MeetingRoomsII();
        // System.out.println(sol.minMeetingRooms(new int[][]{{0,30},{5,10},{15,20}})); // 2
        // System.out.println(sol.minMeetingRooms(new int[][]{{7,10},{2,4}}));          // 1
        System.out.println("P253MeetingRoomsII — uncomment examples above to test.");
    }
}
