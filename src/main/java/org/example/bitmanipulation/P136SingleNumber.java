package org.example.bitmanipulation;

/**
 * ============================================================
 * LeetCode #136 - Single Number
 * Difficulty: Easy
 * Category: Bit Manipulation
 * ============================================================
 *
 * PROBLEM
 * -------
 * Given a non-empty array of integers nums, every element appears twice
 * except for one. Find that single element and return it.
 * You must implement a solution with O(1) extra space.
 *
 * CONSTRAINTS
 * -----------
 * - 1 <= nums.length <= 3 * 10^4
 * - -3 * 10^4 <= nums[i] <= 3 * 10^4
 * - Every element appears exactly twice except for one element that appears once
 *
 * EXAMPLES
 * --------
 * Input: [2,2,1]       Output: 1
 * Input: [4,1,2,1,2]   Output: 4
 * Input: [1]            Output: 1
 *
 * INTUITION & APPROACH
 * --------------------
 * XOR all elements together:
 *   - x ^ x = 0  (a value XOR'd with itself cancels out)
 *   - x ^ 0 = x  (a value XOR'd with 0 is unchanged)
 *   - XOR is commutative and associative
 * Therefore, every pair cancels to 0, and only the unique element remains.
 * result = 0 ^ nums[0] ^ nums[1] ^ ... ^ nums[n-1]
 *
 * KEY CONCEPTS
 * ------------
 * - XOR properties: a ^ a = 0, a ^ 0 = a
 * - Commutative and associative — order does not matter
 * - Single pass, no extra space
 *
 * COMPLEXITY TARGETS
 * ------------------
 * Time:  O(n)
 * Space: O(1)
 * ============================================================
 */
public class P136SingleNumber {

    public int singleNumber(int[] nums) {
        // TODO: implement
        return 0;
    }

    public static void main(String[] args) {
        // P136SingleNumber sol = new P136SingleNumber();
        // System.out.println(sol.singleNumber(new int[]{4,1,2,1,2})); // 4
        // System.out.println(sol.singleNumber(new int[]{2,2,1}));      // 1
        // System.out.println(sol.singleNumber(new int[]{1}));           // 1
        System.out.println("P136SingleNumber — uncomment examples above to test.");
    }
}
