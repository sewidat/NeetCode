package org.example.linkedlist;
import org.example.common.ListNode;

/**
 * ============================================================
 * LeetCode #143 - Reorder List
 * Difficulty: Medium
 * Category: Linked List
 * ============================================================
 *
 * PROBLEM
 * -------
 * Given a singly linked list L0 → L1 → … → Ln-1 → Ln, reorder it in-place to:
 * L0 → Ln → L1 → Ln-1 → L2 → Ln-2 → …
 * You may not modify node values — only node pointers.
 *
 * CONSTRAINTS
 * -----------
 * - 1 to 5 * 10^4 nodes
 * - 1 <= Node.val <= 1000
 *
 * EXAMPLES
 * --------
 * Input: [1,2,3,4]   →  Output: [1,4,2,3]
 * Input: [1,2,3,4,5] →  Output: [1,5,2,4,3]
 *
 * INTUITION & APPROACH
 * --------------------
 * The solution has three distinct steps, each O(n): (1) Find the middle of
 * the list using slow and fast pointers — slow lands at the midpoint when fast
 * reaches the end. (2) Reverse the second half of the list in-place using the
 * standard three-pointer technique. (3) Merge the first half and the reversed
 * second half by alternating nodes: take one from front, one from back,
 * repeat. All three steps together keep time at O(n) and space at O(1).
 *
 * KEY CONCEPTS
 * ------------
 * - Find middle via slow/fast (tortoise and hare) pointers
 * - Reverse the second half in-place
 * - Interleave merge of two sub-lists without creating new nodes
 *
 * COMPLEXITY TARGETS
 * ------------------
 * Time:  O(n)
 * Space: O(1)
 * ============================================================
 */
public class P143ReorderList {

    public void reorderList(ListNode head) {
        // TODO: implement
    }

    public static void main(String[] args) {
        P143ReorderList sol = new P143ReorderList();

        // Example 1: [1,2,3,4] → [1,4,2,3]
        // ListNode head1 = ListNode.of(1, 2, 3, 4);
        // sol.reorderList(head1);
        // System.out.println(head1); // expected: 1->4->2->3

        // Example 2: [1,2,3,4,5] → [1,5,2,4,3]
        // ListNode head2 = ListNode.of(1, 2, 3, 4, 5);
        // sol.reorderList(head2);
        // System.out.println(head2); // expected: 1->5->2->4->3

        System.out.println("P143ReorderList — uncomment examples above to test.");
    }
}
