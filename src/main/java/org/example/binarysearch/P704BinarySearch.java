package org.example.binarysearch;

/**
 * ============================================================
 * LeetCode #704 - Binary Search
 * Difficulty: Easy
 * Category: Binary Search
 * ============================================================
 *
 * PROBLEM
 * -------
 * Given a sorted (ascending) integer array and a target value, return
 * the index of the target or -1 if not present.
 *
 * CONSTRAINTS
 * -----------
 * 1 <= nums.length <= 10^4
 * -10^4 < nums[i] < 10^4
 * All elements are distinct
 * Array is sorted in ascending order
 *
 * EXAMPLES
 * --------
 * nums=[-1,0,3,5,9,12], target=9  → 4
 * nums=[-1,0,3,5,9,12], target=2  → -1
 *
 * INTUITION & APPROACH
 * --------------------
 * Classic binary search. left=0, right=n-1. mid=(left+right)/2 computed
 * as left+(right-left)/2 to prevent integer overflow. If nums[mid]==target
 * return mid; if target < nums[mid] search left half; else search right
 * half. Continue until left > right.
 *
 * KEY CONCEPTS
 * ------------
 * Binary search, integer overflow prevention with left + (right - left) / 2
 *
 * COMPLEXITY TARGETS
 * ------------------
 * Time:  O(log n)
 * Space: O(1)
 * ============================================================
 */
public class P704BinarySearch {

    public int search(int[] nums, int target) {
        // TODO: implement
        return -1;
    }

    public static void main(String[] args) {
        P704BinarySearch sol = new P704BinarySearch();
        System.out.println(sol.search(new int[]{-1, 0, 3, 5, 9, 12}, 9));  // expected 4
        System.out.println(sol.search(new int[]{-1, 0, 3, 5, 9, 12}, 2));  // expected -1
    }
}
