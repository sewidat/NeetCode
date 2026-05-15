package org.example.linkedlist;
import org.example.common.ListNode;

/**
 * ============================================================
 * LeetCode #21 - Merge Two Sorted Lists
 * Difficulty: Easy
 * Category: Linked List
 * ============================================================
 *
 * PROBLEM
 * -------
 * Merge two sorted linked lists and return the head of the merged sorted list.
 * The list should be made by splicing together the nodes of the first two
 * lists (do not create new nodes).
 *
 * CONSTRAINTS
 * -----------
 * - 0 to 50 nodes per list
 * - -100 <= Node.val <= 100
 * - Both lists are sorted in non-decreasing order
 *
 * EXAMPLES
 * --------
 * Input: l1 = [1,2,4], l2 = [1,3,4]  →  Output: [1,1,2,3,4,4]
 * Input: l1 = [],      l2 = []         →  Output: []
 * Input: l1 = [],      l2 = [0]        →  Output: [0]
 *
 * INTUITION & APPROACH
 * --------------------
 * Create a dummy sentinel head node whose next will become the result head.
 * Maintain a current pointer starting at dummy. Compare the front values of
 * l1 and l2: attach the node with the smaller value to current.next, then
 * advance that list's pointer. Advance current. Repeat until one list is
 * exhausted, then attach the remaining non-null list directly. Return
 * dummy.next. This runs in O(n+m) time and O(1) space since no new nodes
 * are created.
 *
 * KEY CONCEPTS
 * ------------
 * - Dummy sentinel head simplifies edge cases (empty lists, first element)
 * - Two-pointer merge: advance whichever list has the smaller front value
 * - Append remaining tail directly after the loop exits
 *
 * COMPLEXITY TARGETS
 * ------------------
 * Time:  O(n + m)
 * Space: O(1)
 * ============================================================
 */
public class P21MergeTwoSortedLists {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // TODO: implement
        return null;
    }

    public static void main(String[] args) {
        P21MergeTwoSortedLists sol = new P21MergeTwoSortedLists();

        // Example 1: l1=[1,2,4], l2=[1,3,4] → [1,1,2,3,4,4]
        // ListNode l1 = ListNode.of(1, 2, 4);
        // ListNode l2 = ListNode.of(1, 3, 4);
        // System.out.println(sol.mergeTwoLists(l1, l2)); // expected: 1->1->2->3->4->4

        // Example 2: l1=[], l2=[] → []
        // System.out.println(sol.mergeTwoLists(null, null)); // expected: null

        // Example 3: l1=[], l2=[0] → [0]
        // System.out.println(sol.mergeTwoLists(null, ListNode.of(0))); // expected: 0

        System.out.println("P21MergeTwoSortedLists — uncomment examples above to test.");
    }
}
