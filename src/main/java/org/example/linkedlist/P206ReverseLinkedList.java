package org.example.linkedlist;
import org.example.common.ListNode;

/**
 * ============================================================
 * LeetCode #206 - Reverse Linked List
 * Difficulty: Easy
 * Category: Linked List
 * ============================================================
 *
 * PROBLEM
 * -------
 * Given the head of a singly linked list, reverse the list and return the
 * reversed list's head.
 *
 * CONSTRAINTS
 * -----------
 * - 0 <= number of nodes <= 5000
 * - -5000 <= Node.val <= 5000
 *
 * EXAMPLES
 * --------
 * Input: head = [1,2,3,4,5]  →  Output: [5,4,3,2,1]
 * Input: head = [1,2]         →  Output: [2,1]
 * Input: head = []            →  Output: []
 *
 * INTUITION & APPROACH
 * --------------------
 * Iterative: maintain three pointers — prev (starts null), curr (starts at
 * head), and next. On each step, save curr.next, point curr.next to prev,
 * then advance prev to curr and curr to next. When curr is null, prev is the
 * new head. This is O(n) time and O(1) space. Alternatively, the recursive
 * approach defines the base case as null or a single node, recurses on
 * head.next, then sets head.next.next = head and head.next = null to reverse
 * the link — elegant but uses O(n) call-stack space.
 *
 * KEY CONCEPTS
 * ------------
 * - Three-pointer iterative reversal (prev, curr, next)
 * - Recursive reversal with link inversion after return
 * - In-place, no extra data structures required
 *
 * COMPLEXITY TARGETS
 * ------------------
 * Time:  O(n)
 * Space: O(1) iterative / O(n) recursive (call stack)
 * ============================================================
 */
public class P206ReverseLinkedList {

    public ListNode reverseList(ListNode head) {
        // TODO: implement
        return null;
    }

    public static void main(String[] args) {
        P206ReverseLinkedList sol = new P206ReverseLinkedList();

        // Example 1: [1,2,3,4,5] → [5,4,3,2,1]
        // ListNode head1 = ListNode.of(1, 2, 3, 4, 5);
        // System.out.println(sol.reverseList(head1)); // expected: 5 -> 4 -> 3 -> 2 -> 1

        // Example 2: [1,2] → [2,1]
        // ListNode head2 = ListNode.of(1, 2);
        // System.out.println(sol.reverseList(head2)); // expected: 2 -> 1

        // Example 3: [] → []
        // System.out.println(sol.reverseList(null)); // expected: null

        System.out.println("P206ReverseLinkedList — uncomment examples above to test.");
    }
}
