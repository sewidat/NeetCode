package org.example.linkedlist;
import org.example.common.ListNode;

/**
 * ============================================================
 * LeetCode #25 - Reverse Nodes in k-Group
 * Difficulty: Hard
 * Category: Linked List
 * ============================================================
 *
 * PROBLEM
 * -------
 * Given the head of a linked list, reverse the nodes of the list k at a time,
 * and return the modified list. k is a positive integer and is less than or
 * equal to the length of the linked list. If the number of nodes is not a
 * multiple of k then left-out nodes at the end should remain as is. You may
 * not alter the values in the list's nodes, only nodes themselves may be
 * changed.
 *
 * CONSTRAINTS
 * -----------
 * - n == number of nodes
 * - 1 <= k <= n <= 5000
 * - 0 <= Node.val <= 1000
 *
 * EXAMPLES
 * --------
 * Input: head = [1,2,3,4,5], k = 2  →  Output: [2,1,4,3,5]
 * Input: head = [1,2,3,4,5], k = 3  →  Output: [3,2,1,4,5]
 *
 * INTUITION & APPROACH
 * --------------------
 * Use a dummy head node. For each group, first check whether at least k nodes
 * remain by counting from the current position — if not, leave them in place
 * and stop. Reverse exactly k nodes using the standard three-pointer reversal,
 * tracking the group's original head (which becomes the tail after reversal)
 * and the new head (last node processed). Connect the previous group's tail to
 * the new group head, and the new group's tail to the next group's start.
 * Advance the pointer to the next group's start and repeat. The overall
 * complexity is O(n) since every node is visited at most twice.
 *
 * KEY CONCEPTS
 * ------------
 * - Count k nodes before reversing to detect a partial tail group
 * - Standard three-pointer reversal applied to a bounded sublist of length k
 * - Connect groups correctly: previous tail → new group head, new group tail → next start
 * - Dummy head prevents special-casing the very first group
 *
 * COMPLEXITY TARGETS
 * ------------------
 * Time:  O(n)
 * Space: O(1) iterative / O(n/k) recursive (call stack)
 * ============================================================
 */
public class P25ReverseNodesInKGroup {

    public ListNode reverseKGroup(ListNode head, int k) {
        // TODO: implement
        return null;
    }

    public static void main(String[] args) {
        P25ReverseNodesInKGroup sol = new P25ReverseNodesInKGroup();

        // Example 1: [1,2,3,4,5], k=2 → [2,1,4,3,5]
        // ListNode head1 = ListNode.of(1, 2, 3, 4, 5);
        // System.out.println(sol.reverseKGroup(head1, 2)); // expected: 2->1->4->3->5

        // Example 2: [1,2,3,4,5], k=3 → [3,2,1,4,5]
        // ListNode head2 = ListNode.of(1, 2, 3, 4, 5);
        // System.out.println(sol.reverseKGroup(head2, 3)); // expected: 3->2->1->4->5

        System.out.println("P25ReverseNodesInKGroup — uncomment examples above to test.");
    }
}
