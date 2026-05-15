package org.example.linkedlist;
import java.util.HashMap;
import java.util.Map;

/**
 * ============================================================
 * LeetCode #138 - Copy List with Random Pointer
 * Difficulty: Medium
 * Category: Linked List
 * ============================================================
 *
 * PROBLEM
 * -------
 * A linked list of length n is given such that each node contains an additional
 * random pointer, which could point to any node in the list or null. Construct
 * a deep copy of the list. The deep copy must consist of exactly n brand-new
 * nodes where each new node has its value set to the value of its corresponding
 * original node. Both the next and random pointers of the new nodes should
 * point to new nodes in the copied list such that the original and copied lists
 * represent the same list state. None of the pointers in the new list should
 * point to nodes in the original list.
 *
 * CONSTRAINTS
 * -----------
 * - 0 to 1000 nodes
 * - -10^4 <= Node.val <= 10^4
 * - Node.random is null or points to some node in the list
 *
 * EXAMPLES
 * --------
 * Input:  [[7,null],[13,0],[11,4],[10,2],[1,0]]
 * Output: [[7,null],[13,0],[11,4],[10,2],[1,0]]  (deep copy, same structure)
 *
 * INTUITION & APPROACH
 * --------------------
 * HashMap approach: First pass traverses the original list and creates a new
 * copy node for each original node, storing the mapping old→new in a HashMap.
 * Second pass revisits each original node and sets the next and random pointers
 * of the corresponding copy using the map for O(1) lookup. This produces a
 * fully independent deep copy in O(n) time and O(n) space. An alternative
 * interleaves cloned nodes between originals (clone after each node) then
 * fixes random pointers, and finally extracts the clone list — achieving O(1)
 * extra space.
 *
 * KEY CONCEPTS
 * ------------
 * - HashMap mapping original nodes to their clones enables O(1) pointer lookup
 * - Two-pass algorithm: first create all nodes, then wire all pointers
 * - The random pointer can reference any node, so all copies must exist before
 *   wiring begins
 *
 * COMPLEXITY TARGETS
 * ------------------
 * Time:  O(n)
 * Space: O(n)
 * ============================================================
 */
public class P138CopyListWithRandomPointer {

    static class Node {
        int val;
        Node next;
        Node random;

        Node(int val) {
            this.val = val;
        }
    }

    public Node copyRandomList(Node head) {
        // TODO: implement
        return null;
    }

    public static void main(String[] args) {
        // Demo: create a small list with random pointers manually
        // Node n1 = new Node(7);
        // Node n2 = new Node(13);
        // Node n3 = new Node(11);
        // n1.next = n2; n2.next = n3;
        // n1.random = null; n2.random = n1; n3.random = n3;
        // P138CopyListWithRandomPointer sol = new P138CopyListWithRandomPointer();
        // Node copy = sol.copyRandomList(n1);
        // System.out.println(copy.val);           // expected: 7
        // System.out.println(copy.next.val);      // expected: 13
        // System.out.println(copy.next.random == copy); // expected: true (deep copy, not n1)

        System.out.println("P138CopyListWithRandomPointer — uncomment examples above to test.");
    }
}
