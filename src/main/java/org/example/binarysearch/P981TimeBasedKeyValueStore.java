package org.example.binarysearch;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ============================================================
 * LeetCode #981 - Time Based Key-Value Store
 * Difficulty: Medium
 * Category: Binary Search
 * ============================================================
 *
 * PROBLEM
 * -------
 * Design a time-based key-value store:
 * - set(key, value, timestamp): stores value associated with key at time.
 * - get(key, timestamp): returns the value stored at the largest timestamp
 *   less than or equal to the given timestamp. If no such value, return "".
 * Timestamps passed to set are strictly increasing per key.
 *
 * CONSTRAINTS
 * -----------
 * 1 <= key.length, value.length <= 100
 * 1 <= timestamp <= 10^7
 * At most 2*10^5 calls to set and get
 * All timestamps in set calls are strictly increasing
 *
 * EXAMPLES
 * --------
 * set("foo","bar",1), get("foo",1)="bar", get("foo",3)="bar",
 * set("foo","bar2",4), get("foo",4)="bar2", get("foo",5)="bar2"
 *
 * INTUITION & APPROACH
 * --------------------
 * Map<String, List<int[]{timestamp, value}>> for each key keeps a list
 * sorted by timestamp (guaranteed by the strictly increasing constraint).
 * get() binary searches for the largest timestamp <= target using the
 * sorted list. Return "" if no entry satisfies the condition.
 *
 * KEY CONCEPTS
 * ------------
 * HashMap + sorted list per key, binary search for floor timestamp
 *
 * COMPLEXITY TARGETS
 * ------------------
 * Time:  O(1) set, O(log n) get
 * Space: O(n)
 * ============================================================
 */
public class P981TimeBasedKeyValueStore {

    static class TimeMap {
        public TimeMap() { /* TODO */ }
        public void set(String key, String value, int timestamp) { /* TODO */ }
        public String get(String key, int timestamp) { /* TODO: return ""; */ return ""; }
    }

    public static void main(String[] args) {
        // TimeMap map = new TimeMap();
        // map.set("foo", "bar", 1);
        // System.out.println(map.get("foo", 1));  // expected "bar"
        // System.out.println(map.get("foo", 3));  // expected "bar"
        // map.set("foo", "bar2", 4);
        // System.out.println(map.get("foo", 4));  // expected "bar2"
        // System.out.println(map.get("foo", 5));  // expected "bar2"
        System.out.println("P981TimeBasedKeyValueStore — uncomment examples above to test.");
    }
}
