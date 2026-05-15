package org.example.heap;
import java.util.PriorityQueue;

/**
 * ============================================================
 * LeetCode #703 - Kth Largest Element in a Stream
 * Difficulty: Easy
 * Category: Heap / Priority Queue
 * ============================================================
 *
 * PROBLEM
 * -------
 * Design a class to find the kth largest element in a stream.
 * KthLargest(k, nums) initializes the object with integer k and
 * the stream of integers nums. add(val) appends the integer val
 * to the stream and returns the element representing the kth
 * largest element in the stream.
 *
 * CONSTRAINTS
 * -----------
 * 1 <= k <= 10^4
 * 0 <= nums.length <= 10^4
 * -10^4 <= nums[i], val <= 10^4
 * There will always be at least k elements in the array when add() is called.
 *
 * EXAMPLES
 * --------
 * KthLargest kl = new KthLargest(3, [4,5,8,2]);
 * kl.add(3)  -> 4
 * kl.add(5)  -> 5
 * kl.add(10) -> 8
 * kl.add(9)  -> 8
 * kl.add(4)  -> 8
 *
 * INTUITION & APPROACH
 * --------------------
 * Maintain a min-heap of size k. The heap always stores the k
 * largest elements seen so far. Because it is a min-heap, the
 * top (smallest element in the heap) is always the kth largest
 * overall. On each add: push the value onto the heap, then if
 * the heap grows beyond k elements pop the minimum. The heap
 * peek is the answer.
 *
 * KEY CONCEPTS
 * ------------
 * - Min-heap of exactly k elements
 * - Heap top == kth largest element
 * - PriorityQueue default order is ascending (min-heap)
 *
 * COMPLEXITY TARGETS
 * ------------------
 * Time:  O(log k) per add()
 * Space: O(k)
 * ============================================================
 */
public class P703KthLargestElementInAStream {

    static class KthLargest {
        public KthLargest(int k, int[] nums) {
            // TODO: implement
        }

        public int add(int val) {
            // TODO: implement
            return 0;
        }
    }

    public static void main(String[] args) {
        // KthLargest kl = new KthLargest(3, new int[]{4, 5, 8, 2});
        // System.out.println(kl.add(3));  // expected 4
        // System.out.println(kl.add(5));  // expected 5
        // System.out.println(kl.add(10)); // expected 8
        // System.out.println(kl.add(9));  // expected 8
        // System.out.println(kl.add(4));  // expected 8
        System.out.println("P703KthLargestElementInAStream — uncomment examples above to test.");
    }
}
