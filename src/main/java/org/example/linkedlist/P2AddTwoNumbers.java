package org.example.linkedlist;
import org.example.common.ListNode;

/**
 * ============================================================
 * LeetCode #2 - Add Two Numbers
 * Difficulty: Medium
 * Category: Linked List
 * ============================================================
 *
 * PROBLEM
 * -------
 * You are given two non-empty linked lists representing two non-negative
 * integers. The digits are stored in reverse order, and each of their nodes
 * contains a single digit. Add the two numbers and return the sum as a linked
 * list in reverse order (same format as input). You may assume the two numbers
 * do not have leading zeros, except the number 0 itself.
 *
 * CONSTRAINTS
 * -----------
 * - 1 to 100 nodes per list
 * - 0 <= Node.val <= 9
 * - No leading zeros except the number 0 itself
 *
 * EXAMPLES
 * --------
 * Input: l1 = [2,4,3], l2 = [5,6,4]  →  Output: [7,0,8]   (342 + 465 = 807)
 * Input: l1 = [0],     l2 = [0]       →  Output: [0]
 * Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]  →  Output: [8,9,9,9,0,0,0,1]
 *
 * INTUITION & APPROACH
 * --------------------
 * Simulate grade-school long addition digit by digit. Traverse both lists
 * simultaneously, adding corresponding digits together with any carry from the
 * previous position. The digit of the new node is (sum % 10) and the new carry
 * is (sum / 10). Use a dummy head to simplify building the result list. After
 * both lists are exhausted, if there is still a non-zero carry, append one more
 * node. This handles all cases, including lists of different lengths.
 *
 * KEY CONCEPTS
 * ------------
 * - Carry propagation: new carry = (digitA + digitB + carry) / 10
 * - Dummy sentinel head simplifies result list construction
 * - Simultaneous traversal using null-safe digit extraction (0 if exhausted)
 * - Final carry check after loop exits
 *
 * COMPLEXITY TARGETS
 * ------------------
 * Time:  O(max(m, n))
 * Space: O(max(m, n))  — for the result list
 * ============================================================
 */
public class P2AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // TODO: implement
        return null;
    }

    public static void main(String[] args) {
        P2AddTwoNumbers sol = new P2AddTwoNumbers();

        // Example 1: [2,4,3] + [5,6,4] → [7,0,8]  (342 + 465 = 807)
        // ListNode l1 = ListNode.of(2, 4, 3);
        // ListNode l2 = ListNode.of(5, 6, 4);
        // System.out.println(sol.addTwoNumbers(l1, l2)); // expected: 7->0->8

        // Example 2: [0] + [0] → [0]
        // System.out.println(sol.addTwoNumbers(ListNode.of(0), ListNode.of(0))); // expected: 0

        // Example 3: [9,9,9,9,9,9,9] + [9,9,9,9] → [8,9,9,9,0,0,0,1]
        // ListNode l3 = ListNode.of(9, 9, 9, 9, 9, 9, 9);
        // ListNode l4 = ListNode.of(9, 9, 9, 9);
        // System.out.println(sol.addTwoNumbers(l3, l4)); // expected: 8->9->9->9->0->0->0->1

        System.out.println("P2AddTwoNumbers — uncomment examples above to test.");
    }
}
