package org.example.heap;
import java.util.PriorityQueue;

/**
 * ============================================================
 * LeetCode #295 - Find Median from Data Stream
 * Difficulty: Hard
 * Category: Heap / Priority Queue
 * ============================================================
 *
 * PROBLEM
 * -------
 * The MedianFinder class supports two operations on a stream of
 * integers:
 * - addNum(int num): adds the integer num to the data structure.
 * - findMedian(): returns the median of all elements so far.
 *   If the count is even, the median is the average of the two
 *   middle values.
 *
 * CONSTRAINTS
 * -----------
 * -10^5 <= num <= 10^5
 * There will be at least one element before findMedian is called.
 * At most 5 * 10^4 calls will be made to addNum and findMedian.
 *
 * EXAMPLES
 * --------
 * MedianFinder mf = new MedianFinder();
 * mf.addNum(1);
 * mf.addNum(2);
 * mf.findMedian() -> 1.5
 * mf.addNum(3);
 * mf.findMedian() -> 2.0
 *
 * INTUITION & APPROACH
 * --------------------
 * Maintain two heaps:
 * - maxHeap (lower half): a max-heap containing the smaller half
 *   of all numbers. The top is the largest of the lower half.
 * - minHeap (upper half): a min-heap containing the larger half
 *   of all numbers. The top is the smallest of the upper half.
 *
 * Invariant: maxHeap.size() == minHeap.size()  (even total)
 *         or maxHeap.size() == minHeap.size() + 1  (odd total, extra in lower)
 *
 * On addNum:
 *   1. Add to maxHeap.
 *   2. If maxHeap.peek() > minHeap.peek(), move maxHeap top to minHeap.
 *   3. Rebalance sizes: if minHeap.size() > maxHeap.size(), move
 *      minHeap top to maxHeap.
 *
 * findMedian:
 *   - Odd total: return maxHeap.peek() (the middle element).
 *   - Even total: return average of both tops.
 *
 * KEY CONCEPTS
 * ------------
 * - Two-heap partition: max-heap for lower half, min-heap for upper half
 * - Balance invariant: size difference is at most 1, lower half can be larger
 *
 * COMPLEXITY TARGETS
 * ------------------
 * Time:  O(log n) per addNum, O(1) per findMedian
 * Space: O(n)
 * ============================================================
 */
public class P295FindMedianFromDataStream {

    static class MedianFinder {

        public MedianFinder() {
            // TODO: implement
        }

        public void addNum(int num) {
            // TODO: implement
        }

        public double findMedian() {
            // TODO: implement
            return 0.0;
        }
    }

    public static void main(String[] args) {
        // MedianFinder mf = new MedianFinder();
        // mf.addNum(1);
        // mf.addNum(2);
        // System.out.println(mf.findMedian()); // expected 1.5
        // mf.addNum(3);
        // System.out.println(mf.findMedian()); // expected 2.0
        System.out.println("P295FindMedianFromDataStream — uncomment examples above to test.");
    }
}
