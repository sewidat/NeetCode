package org.example.heap;
import java.util.PriorityQueue;

/**
 * ============================================================
 * LeetCode #1046 - Last Stone Weight
 * Difficulty: Easy
 * Category: Heap / Priority Queue
 * ============================================================
 *
 * PROBLEM
 * -------
 * You are given an array of integers stones where stones[i] is
 * the weight of the ith stone. On each turn, smash the two
 * heaviest stones together. Suppose the two heaviest stones have
 * weights x and y where x <= y. If x == y, both stones are
 * destroyed. If x != y, x is destroyed and y becomes y - x.
 * Return the weight of the last remaining stone, or 0 if none remain.
 *
 * CONSTRAINTS
 * -----------
 * 1 <= stones.length <= 30
 * 1 <= stones[i] <= 1000
 *
 * EXAMPLES
 * --------
 * Input:  stones = [2,7,4,1,8,1]
 * Output: 1
 * Explanation: Smash 8 and 7 -> 1 remains; smash 4 and 2 -> 2 remains;
 *              smash 2 and 1 -> 1 remains; smash 1 and 1 -> nothing;
 *              1 stone left with weight 1.
 *
 * INTUITION & APPROACH
 * --------------------
 * Use a max-heap to always efficiently retrieve the two heaviest
 * stones. Poll the two largest, compute the result of smashing,
 * and if the result is non-zero push it back. Repeat until 0 or
 * 1 stone remains. Java's PriorityQueue is a min-heap by default,
 * so pass a reversed comparator (Collections.reverseOrder()) to
 * simulate a max-heap.
 *
 * KEY CONCEPTS
 * ------------
 * - Max-heap via PriorityQueue with reversed comparator
 * - Simulation of repeated smashing
 *
 * COMPLEXITY TARGETS
 * ------------------
 * Time:  O(n log n)
 * Space: O(n)
 * ============================================================
 */
public class P1046LastStoneWeight {

    public int lastStoneWeight(int[] stones) {
        // TODO: implement
        return 0;
    }

    public static void main(String[] args) {
        P1046LastStoneWeight sol = new P1046LastStoneWeight();
        // System.out.println(sol.lastStoneWeight(new int[]{2, 7, 4, 1, 8, 1})); // expected 1
        System.out.println("P1046LastStoneWeight — uncomment examples above to test.");
    }
}
