package org.example.linkedlist;

/**
 * ============================================================
 * LeetCode #287 - Find the Duplicate Number
 * Difficulty: Medium
 * Category: Linked List
 * ============================================================
 *
 * PROBLEM
 * -------
 * Given an array of integers nums containing n+1 integers where each integer
 * is in the range [1, n] inclusive, there is only one repeated number.
 * Return that repeated number. You must solve the problem without modifying
 * the array nums and uses only O(1) extra space, running in O(n) time.
 *
 * CONSTRAINTS
 * -----------
 * - 1 <= n <= 10^5
 * - nums.length == n + 1
 * - 1 <= nums[i] <= n
 * - There is only one repeated number, but it could be repeated more than once
 *
 * EXAMPLES
 * --------
 * Input: nums = [1,3,4,2,2]  →  Output: 2
 * Input: nums = [3,1,3,4,2]  →  Output: 3
 *
 * INTUITION & APPROACH
 * --------------------
 * Treat the array as an implicit linked list where index i points to index
 * nums[i]. The duplicate value creates two pointers into the same node,
 * forming a cycle. This is identical in structure to LeetCode #142 (Find
 * Cycle Entry). Apply Floyd's cycle detection: move slow one step (slow =
 * nums[slow]) and fast two steps (fast = nums[nums[fast]]) until they meet
 * inside the cycle. Then reset one pointer to index 0 and advance both one
 * step at a time; where they meet is the cycle entry, which is the duplicate.
 *
 * KEY CONCEPTS
 * ------------
 * - Implicit linked list: index i → nums[i] forms a functional graph
 * - Duplicate value creates two in-edges to the same node, causing a cycle
 * - Floyd's algorithm phase 1 finds intersection inside cycle
 * - Floyd's algorithm phase 2 finds cycle entry (the duplicate)
 *
 * COMPLEXITY TARGETS
 * ------------------
 * Time:  O(n)
 * Space: O(1)
 * ============================================================
 */
public class P287FindTheDuplicateNumber {

    public int findDuplicate(int[] nums) {
        // TODO: implement
        return -1;
    }

    public static void main(String[] args) {
        P287FindTheDuplicateNumber sol = new P287FindTheDuplicateNumber();

        // Example 1: [1,3,4,2,2] → 2
        // System.out.println(sol.findDuplicate(new int[]{1, 3, 4, 2, 2})); // expected: 2

        // Example 2: [3,1,3,4,2] → 3
        // System.out.println(sol.findDuplicate(new int[]{3, 1, 3, 4, 2})); // expected: 3

        System.out.println("P287FindTheDuplicateNumber — uncomment examples above to test.");
    }
}
