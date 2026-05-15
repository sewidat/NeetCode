package org.example.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * ============================================================
 * LeetCode #1 - Two Sum
 * Difficulty: Easy
 * Category: Arrays & Hashing
 * ============================================================
 *
 * PROBLEM
 * -------
 * Given an integer array nums and an integer target, return the indices of the
 * two numbers such that they add up to target. You may assume exactly one
 * solution exists, and you may not use the same element twice.
 *
 * CONSTRAINTS
 * -----------
 * - 2 <= nums.length <= 10^4
 * - -10^9 <= nums[i] <= 10^9
 * - -10^9 <= target <= 10^9
 * - Exactly one valid solution exists
 *
 * EXAMPLES
 * --------
 * Input: nums = [2,7,11,15], target = 9  → Output: [0,1]
 * Input: nums = [3,2,4],     target = 6  → Output: [1,2]
 *
 * INTUITION & APPROACH
 * --------------------
 * Brute force: O(n²) nested loops checking every pair — straightforward but too slow.
 * Optimal "store as you go": use a HashMap mapping value → index. For each element,
 * compute its complement (target - nums[i]) and check if the complement is already
 * in the map. If yes, we found the pair; if no, store nums[i] → i and continue.
 * This single-pass approach guarantees we never use the same index twice, because
 * a number is only in the map if it was seen at an earlier index.
 *
 * KEY CONCEPTS
 * ------------
 * - HashMap for O(1) complement lookup
 * - "Store as you go" single-pass pattern
 * - Complement relationship: target - current = needed partner
 *
 * COMPLEXITY TARGETS
 * ------------------
 * Time:  O(n) — single pass, each lookup and insert is O(1) average
 * Space: O(n) — HashMap stores at most n entries
 * ============================================================
 */
public class P1TwoSum {

    public int[] twoSum(int[] nums, int target) {
        // TODO: implement
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i <nums.length ; i++) {
            if (map.containsKey(nums[i])) {
                return new int[]{map.get(nums[i]), i};
            }
            map.put(Math.abs(target-nums[i]),i);

        }
        return new int[]{};
    }

    public static void main(String[] args) {
        P1TwoSum sol = new P1TwoSum();
        // Example 1: expected [0, 1]
         System.out.println(Arrays.toString(sol.twoSum(new int[]{2,7,11,15}, 9)));
        // Example 2: expected [1, 2]
         System.out.println(Arrays.toString(sol.twoSum(new int[]{3,2,4}, 6)));
        System.out.println("P1TwoSum — uncomment examples above to test.");
    }
}
