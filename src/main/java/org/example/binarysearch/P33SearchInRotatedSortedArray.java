package org.example.binarysearch;

/**
 * ============================================================
 * LeetCode #33 - Search in Rotated Sorted Array
 * Difficulty: Medium
 * Category: Binary Search
 * ============================================================
 *
 * PROBLEM
 * -------
 * Given a sorted array rotated at an unknown pivot (all elements unique),
 * search for a target value. Return its index or -1 if not present.
 * Must run in O(log n).
 *
 * CONSTRAINTS
 * -----------
 * 1 <= nums.length <= 5000
 * -10^4 <= nums[i] <= 10^4
 * All elements are unique
 * nums is a rotated sorted array
 *
 * EXAMPLES
 * --------
 * nums=[4,5,6,7,0,1,2], target=0  → 4
 * nums=[4,5,6,7,0,1,2], target=3  → -1
 *
 * INTUITION & APPROACH
 * --------------------
 * Modified binary search. First determine which half is sorted by
 * comparing nums[mid] to nums[left]. If left half is sorted and target
 * falls within [nums[left], nums[mid]), search left; else search right.
 * If right half is sorted and target falls within (nums[mid], nums[right]],
 * search right; else search left.
 *
 * KEY CONCEPTS
 * ------------
 * Binary search, identifying which half is sorted in a rotated array
 *
 * COMPLEXITY TARGETS
 * ------------------
 * Time:  O(log n)
 * Space: O(1)
 * ============================================================
 */
public class P33SearchInRotatedSortedArray {

    public int search(int[] nums, int target) {
        // TODO: implement
        return -1;
    }

    public static void main(String[] args) {
        P33SearchInRotatedSortedArray sol = new P33SearchInRotatedSortedArray();
        System.out.println(sol.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 0)); // expected 4
        System.out.println(sol.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 3)); // expected -1
    }
}
