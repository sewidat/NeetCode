package org.example.binarysearch;

/**
 * ============================================================
 * LeetCode #4 - Median of Two Sorted Arrays
 * Difficulty: Hard
 * Category: Binary Search
 * ============================================================
 *
 * PROBLEM
 * -------
 * Given two sorted arrays nums1 and nums2, return the median of the
 * two sorted arrays combined. Must run in O(log(m+n)).
 *
 * CONSTRAINTS
 * -----------
 * 0 <= m, n <= 1000
 * -10^6 <= nums1[i], nums2[i] <= 10^6
 *
 * EXAMPLES
 * --------
 * nums1=[1,3], nums2=[2]     → 2.0
 * nums1=[1,2], nums2=[3,4]   → 2.5
 *
 * INTUITION & APPROACH
 * --------------------
 * Binary search on the smaller array. Find a partition point i in nums1
 * such that the left partition (i elements from nums1 + j elements from
 * nums2) has total size half = (m + n + 1) / 2. At a valid partition,
 * max(left partition) <= min(right partition). If maxLeft1 > minRight2,
 * move i left; if maxLeft2 > minRight1, move i right. Otherwise compute
 * median from the four boundary values.
 *
 * KEY CONCEPTS
 * ------------
 * Binary search on partition, half = (m+n+1)/2, check maxLeft <= minRight
 *
 * COMPLEXITY TARGETS
 * ------------------
 * Time:  O(log(min(m, n)))
 * Space: O(1)
 * ============================================================
 */
public class P4MedianOfTwoSortedArrays {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // TODO: implement
        return 0.0;
    }

    public static void main(String[] args) {
        P4MedianOfTwoSortedArrays sol = new P4MedianOfTwoSortedArrays();
        System.out.println(sol.findMedianSortedArrays(new int[]{1, 3}, new int[]{2}));     // expected 2.0
        System.out.println(sol.findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4})); // expected 2.5
    }
}
