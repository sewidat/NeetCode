package org.example.binarysearch;

/**
 * ============================================================
 * LeetCode #153 - Find Minimum in Rotated Sorted Array
 * Difficulty: Medium
 * Category: Binary Search
 * ============================================================
 *
 * PROBLEM
 * -------
 * Given a sorted array that has been rotated at some unknown pivot
 * (all elements unique), find the minimum element. Must run in O(log n).
 *
 * CONSTRAINTS
 * -----------
 * n == nums.length
 * 1 <= n <= 5000
 * -5000 <= nums[i] <= 5000
 * All elements are unique
 * Array was sorted in ascending order and then rotated
 *
 * EXAMPLES
 * --------
 * [3,4,5,1,2]      → 1
 * [4,5,6,7,0,1,2]  → 0
 * [11,13,15,17]    → 11
 *
 * INTUITION & APPROACH
 * --------------------
 * Binary search. If nums[mid] > nums[right], the minimum lies in the
 * right half (rotation point is to the right of mid), so move left to
 * mid + 1. Otherwise the minimum is in the left half including mid, so
 * move right to mid. Continue until left == right.
 *
 * KEY CONCEPTS
 * ------------
 * Binary search on rotated array, compare mid to right boundary
 *
 * COMPLEXITY TARGETS
 * ------------------
 * Time:  O(log n)
 * Space: O(1)
 * ============================================================
 */
public class P153FindMinInRotatedSortedArray {

    public int findMin(int[] nums) {
        // TODO: implement
        return 0;
    }

    public static void main(String[] args) {
        P153FindMinInRotatedSortedArray sol = new P153FindMinInRotatedSortedArray();
        System.out.println(sol.findMin(new int[]{3, 4, 5, 1, 2}));     // expected 1
        System.out.println(sol.findMin(new int[]{4, 5, 6, 7, 0, 1, 2})); // expected 0
    }
}
