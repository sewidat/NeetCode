package org.example.heap;
import java.util.PriorityQueue;

/**
 * ============================================================
 * LeetCode #215 - Kth Largest Element in an Array
 * Difficulty: Medium
 * Category: Heap / Priority Queue
 * ============================================================
 *
 * PROBLEM
 * -------
 * Given an integer array nums and an integer k, return the kth
 * largest element in the array. Note that it is the kth largest
 * element in sorted order, not the kth distinct element.
 * You must solve it without sorting.
 *
 * CONSTRAINTS
 * -----------
 * 1 <= k <= nums.length <= 10^5
 * -10^4 <= nums[i] <= 10^4
 *
 * EXAMPLES
 * --------
 * Input:  nums = [3,2,1,5,6,4], k = 2
 * Output: 5
 *
 * Input:  nums = [3,2,3,1,2,4,5,5,6], k = 4
 * Output: 4
 *
 * INTUITION & APPROACH
 * --------------------
 * Three approaches:
 * (1) Sort descending, return element at index k-1. O(n log n).
 * (2) Min-heap of size k: iterate all elements; if heap size < k
 *     add element, else if element > heap.peek() replace the
 *     minimum. The heap stores the k largest; peek is the kth
 *     largest. O(n log k).
 * (3) QuickSelect: similar to quicksort partition. Choose a pivot,
 *     partition array so left side > pivot and right side < pivot.
 *     If pivot is at index k-1, return it. Recurse on the correct
 *     side. O(n) average, O(n^2) worst case.
 *
 * KEY CONCEPTS
 * ------------
 * - Min-heap of size k (heap top = kth largest)
 * - QuickSelect (Lomuto or Hoare partition scheme)
 *
 * COMPLEXITY TARGETS
 * ------------------
 * Time:  O(n) average with QuickSelect
 * Space: O(1) with in-place QuickSelect
 * ============================================================
 */
public class P215KthLargestElementInArray {

    public int findKthLargest(int[] nums, int k) {
        // TODO: implement
        return 0;
    }

    public static void main(String[] args) {
        P215KthLargestElementInArray sol = new P215KthLargestElementInArray();
        // System.out.println(sol.findKthLargest(new int[]{3, 2, 1, 5, 6, 4}, 2)); // expected 5
        // System.out.println(sol.findKthLargest(new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6}, 4)); // expected 4
        System.out.println("P215KthLargestElementInArray — uncomment examples above to test.");
    }
}
