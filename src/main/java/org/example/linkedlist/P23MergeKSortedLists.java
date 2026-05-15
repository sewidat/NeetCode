package org.example.linkedlist;
import org.example.common.ListNode;
import java.util.PriorityQueue;

/**
 * ============================================================
 * LeetCode #23 - Merge K Sorted Lists
 * Difficulty: Hard
 * Category: Linked List
 * ============================================================
 *
 * PROBLEM
 * -------
 * You are given an array of k linked lists, each linked list is sorted in
 * ascending order. Merge all the linked lists into one sorted linked list and
 * return it.
 *
 * CONSTRAINTS
 * -----------
 * - k == lists.length
 * - 0 <= k <= 10^4
 * - 0 <= lists[i].length <= 500
 * - -10^4 <= Node.val <= 10^4
 * - All lists are sorted in ascending order
 * - Total number of nodes across all lists will not exceed 10^4
 *
 * EXAMPLES
 * --------
 * Input: lists = [[1,4,5],[1,3,4],[2,6]]
 * Output: [1,1,2,3,4,4,5,6]
 *
 * Input: lists = []   →  Output: []
 * Input: lists = [[]] →  Output: []
 *
 * INTUITION & APPROACH
 * --------------------
 * Min-heap approach: insert the head node of each non-null list into a
 * PriorityQueue ordered by node value. Repeatedly poll the minimum node,
 * append it to the result, and push its next node (if any) into the heap.
 * The heap never holds more than k nodes, so each poll/offer is O(log k), and
 * across all N total nodes the total cost is O(N log k). Divide and conquer is
 * an elegant O(N log k) alternative: pair up lists and merge pairs repeatedly
 * until one list remains, similar to merge sort.
 *
 * KEY CONCEPTS
 * ------------
 * - Min-heap (PriorityQueue) of size at most k for O(log k) minimum extraction
 * - Dummy sentinel head simplifies result list construction
 * - Divide and conquer merging reduces the problem depth to O(log k) levels
 *
 * COMPLEXITY TARGETS
 * ------------------
 * Time:  O(N log k) where N = total nodes across all lists
 * Space: O(k) for the heap
 * ============================================================
 */
public class P23MergeKSortedLists {

    public ListNode mergeKLists(ListNode[] lists) {
        // TODO: implement
        return null;
    }

    public static void main(String[] args) {
        P23MergeKSortedLists sol = new P23MergeKSortedLists();

        // Example 1: [[1,4,5],[1,3,4],[2,6]] → [1,1,2,3,4,4,5,6]
        // ListNode[] lists = {
        //     ListNode.of(1, 4, 5),
        //     ListNode.of(1, 3, 4),
        //     ListNode.of(2, 6)
        // };
        // System.out.println(sol.mergeKLists(lists)); // expected: 1->1->2->3->4->4->5->6

        // Example 2: empty input → null
        // System.out.println(sol.mergeKLists(new ListNode[]{})); // expected: null

        System.out.println("P23MergeKSortedLists — uncomment examples above to test.");
    }
}
