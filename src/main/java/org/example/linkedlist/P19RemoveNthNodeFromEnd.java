package org.example.linkedlist;
import org.example.common.ListNode;

/**
 * ============================================================
 * LeetCode #19 - Remove Nth Node From End of List
 * Difficulty: Medium
 * Category: Linked List
 * ============================================================
 *
 * PROBLEM
 * -------
 * Given the head of a linked list, remove the nth node from the end of the
 * list and return the head.
 *
 * CONSTRAINTS
 * -----------
 * - 1 to 30 nodes
 * - 0 <= Node.val <= 100
 * - 1 <= n <= size of list (n is always valid)
 *
 * EXAMPLES
 * --------
 * Input: head = [1,2,3,4,5], n = 2  →  Output: [1,2,3,5]
 * Input: head = [1],          n = 1  →  Output: []
 * Input: head = [1,2],        n = 1  →  Output: [1]
 *
 * INTUITION & APPROACH
 * --------------------
 * Use a dummy head node so that removing the actual head is handled uniformly.
 * Place both a slow and a fast pointer at dummy. Advance fast pointer n+1
 * steps ahead (one extra to give slow a proper predecessor position). Then
 * advance both pointers together until fast reaches null. At that point,
 * slow.next is the node to remove — set slow.next = slow.next.next. Return
 * dummy.next as the new head.
 *
 * KEY CONCEPTS
 * ------------
 * - Two-pointer technique with a fixed gap of n between fast and slow
 * - Dummy sentinel head eliminates special-case handling for head removal
 * - Single pass O(n) — no need to compute list length first
 *
 * COMPLEXITY TARGETS
 * ------------------
 * Time:  O(n)
 * Space: O(1)
 * ============================================================
 */
public class P19RemoveNthNodeFromEnd {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        // TODO: implement
        return null;
    }

    public static void main(String[] args) {
        P19RemoveNthNodeFromEnd sol = new P19RemoveNthNodeFromEnd();

        // Example 1: [1,2,3,4,5], n=2 → [1,2,3,5]
        // ListNode head1 = ListNode.of(1, 2, 3, 4, 5);
        // System.out.println(sol.removeNthFromEnd(head1, 2)); // expected: 1->2->3->5

        // Example 2: [1], n=1 → []
        // System.out.println(sol.removeNthFromEnd(ListNode.of(1), 1)); // expected: null

        // Example 3: [1,2], n=1 → [1]
        // System.out.println(sol.removeNthFromEnd(ListNode.of(1, 2), 1)); // expected: 1

        System.out.println("P19RemoveNthNodeFromEnd — uncomment examples above to test.");
    }
}
