package org.example.trees;
import org.example.common.TreeNode;

/**
 * ============================================================
 * LeetCode #235 - Lowest Common Ancestor of a Binary Search Tree
 * Difficulty: Medium
 * Category: Trees
 * ============================================================
 *
 * PROBLEM
 * -------
 * Given a binary search tree (BST) and two nodes p and q, find their
 * Lowest Common Ancestor (LCA). The LCA is defined as the deepest node
 * that has both p and q as descendants (a node can be a descendant of
 * itself).
 *
 * CONSTRAINTS
 * -----------
 * - Number of nodes: 2 to 10^5
 * - -10^9 <= Node.val <= 10^9
 * - All node values are unique
 * - p != q
 * - Both p and q exist in the BST
 *
 * EXAMPLES
 * --------
 * Input:  root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 8
 * Output: 6
 *
 * Input:  root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 4
 * Output: 2
 *
 * INTUITION & APPROACH
 * --------------------
 * Exploit the BST property. Starting at root:
 *   - If both p and q are less than current node → LCA is in left subtree.
 *   - If both p and q are greater than current node → LCA is in right subtree.
 *   - Otherwise (they split, or one equals current) → current node is the LCA.
 * Iterative approach achieves O(1) space.
 *
 * KEY CONCEPTS
 * ------------
 * - BST property directs the search left or right
 * - The "split point" (where p and q diverge) is the LCA
 * - Iterative traversal avoids recursion stack overhead
 *
 * COMPLEXITY TARGETS
 * ------------------
 * Time:  O(h) — proportional to tree height (O(log n) balanced, O(n) worst)
 * Space: O(1) — iterative solution
 * ============================================================
 */
public class P235LowestCommonAncestorOfBST {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // TODO: implement
        return null;
    }

    public static void main(String[] args) {
        P235LowestCommonAncestorOfBST sol = new P235LowestCommonAncestorOfBST();
        TreeNode root = TreeNode.of(6, 2, 8, 0, 4, 7, 9, null, null, 3, 5);
        // p=2, q=8 → expected LCA val: 6
        // p=2, q=4 → expected LCA val: 2
        System.out.println("P235LowestCommonAncestorOfBST — see inline examples; uncomment to test with node references.");
    }
}
