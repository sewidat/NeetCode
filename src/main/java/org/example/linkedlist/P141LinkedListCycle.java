package org.example.linkedlist;
import org.example.common.ListNode;

/**
 * ============================================================
 * LeetCode #141 - Linked List Cycle
 * Difficulty: Easy
 * Category: Linked List
 * ============================================================
 *
 * PROBLEM
 * -------
 * Given the head of a linked list, determine if the linked list contains a
 * cycle. A cycle exists if some node can be reached again by continuously
 * following the next pointer.
 *
 * CONSTRAINTS
 * -----------
 * - 0 to 10^4 nodes
 * - -10^5 <= Node.val <= 10^5
 *
 * EXAMPLES
 * --------
 * [3,2,0,-4] where tail connects back to index 1  →  true
 * [1,2] where tail connects back to index 0        →  true
 * [1] with no cycle                                →  false
 *
 * INTUITION & APPROACH
 * --------------------
 * Floyd's cycle detection (tortoise and hare): use two pointers, slow moving
 * one step at a time and fast moving two steps at a time. If a cycle exists,
 * fast will eventually lap slow and they will meet at the same node. If there
 * is no cycle, fast will reach null (end of list) and we return false. This
 * runs in O(n) time and O(1) space. An alternative is to store visited nodes
 * in a HashSet, but that costs O(n) extra space.
 *
 * KEY CONCEPTS
 * ------------
 * - Floyd's tortoise and hare cycle detection algorithm
 * - Slow pointer advances 1 step, fast pointer advances 2 steps
 * - Meeting of pointers confirms cycle; null pointer confirms no cycle
 *
 * COMPLEXITY TARGETS
 * ------------------
 * Time:  O(n)
 * Space: O(1)
 * ============================================================
 */
public class P141LinkedListCycle {

    public boolean hasCycle(ListNode head) {
        // TODO: implement
        return false;
    }

    public static void main(String[] args) {
        // Note: constructing a cycle manually is required since ListNode.of() builds acyclic lists.
        // Example: build [3,2,0,-4] where node at index 3 points back to index 1
        // ListNode n0 = new ListNode(3);
        // ListNode n1 = new ListNode(2);
        // ListNode n2 = new ListNode(0);
        // ListNode n3 = new ListNode(-4);
        // n0.next = n1; n1.next = n2; n2.next = n3; n3.next = n1; // cycle at index 1
        // P141LinkedListCycle sol = new P141LinkedListCycle();
        // System.out.println(sol.hasCycle(n0)); // expected: true

        // Acyclic: [1] → false
        // System.out.println(sol.hasCycle(new ListNode(1))); // expected: false

        System.out.println("P141LinkedListCycle — cycle demo requires manual pointer setup; uncomment above to test.");
    }
}
