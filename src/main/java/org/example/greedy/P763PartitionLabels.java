package org.example.greedy;

import java.util.ArrayList;
import java.util.List;

/**
 * ============================================================
 * LeetCode #763 - Partition Labels
 * Difficulty: Medium
 * Category: Greedy
 * ============================================================
 *
 * PROBLEM
 * -------
 * Given a string s, partition it into as many parts as possible so that
 * each letter appears in at most one part. Return a list of integers
 * representing the size of each part.
 *
 * CONSTRAINTS
 * -----------
 * - 1 <= s.length <= 500
 * - s consists of lowercase English letters only
 *
 * EXAMPLES
 * --------
 * Input: s = "ababcbacadefegdehijhklij"  Output: [9, 7, 8]
 *        (partitions: "ababcbaca", "defegde", "hijhklij")
 * Input: s = "eccbbbbdec"               Output: [10]
 *
 * INTUITION & APPROACH
 * --------------------
 * First pass: record the last occurrence index of each character in s.
 * Second pass (greedy): maintain the farthest end of the current partition
 * (end = max of last occurrences of all characters seen so far).
 * When the current index i reaches end, the current partition is complete:
 *   - Record its size (i - start + 1)
 *   - Start a new partition at i+1
 *
 * KEY CONCEPTS
 * ------------
 * - Precompute last occurrence of each character (26-element array)
 * - Greedy: extend current partition end to the last occurrence of every
 *   new character encountered
 * - Partition finalised when index equals the current end
 *
 * COMPLEXITY TARGETS
 * ------------------
 * Time:  O(n)
 * Space: O(1)  (26-character last-occurrence array)
 * ============================================================
 */
public class P763PartitionLabels {

    public List<Integer> partitionLabels(String s) {
        // TODO: implement
        return new ArrayList<>();
    }

    public static void main(String[] args) {
        // P763PartitionLabels sol = new P763PartitionLabels();
        // System.out.println(sol.partitionLabels("ababcbacadefegdehijhklij")); // [9, 7, 8]
        // System.out.println(sol.partitionLabels("eccbbbbdec"));                // [10]
        System.out.println("P763PartitionLabels — uncomment examples above to test.");
    }
}
