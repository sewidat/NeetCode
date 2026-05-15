package org.example.trees;
import org.example.common.TreeNode;

/**
 * ============================================================
 * LeetCode #230 - Kth Smallest Element in a BST
 * Difficulty: Medium
 * Category: Trees
 * ============================================================
 *
 * PROBLEM
 * -------
 * Given the root of a binary search tree and an integer k, return the kth
 * smallest value (1-indexed) of all the values of the nodes in the tree.
 *
 * CONSTRAINTS
 * -----------
 * - Number of nodes: 1 to 10^4
 * - 0 <= Node.val <= 10^4
 * - 1 <= k <= number of nodes
 *
 * EXAMPLES
 * --------
 * Input:  root = [3,1,4,null,2], k = 1
 * Output: 1
 *
 * Input:  root = [5,3,6,2,4,null,null,1], k = 3
 * Output: 3
 *
 * INTUITION & APPROACH
 * --------------------
 * BST inorder traversal (left → root → right) visits nodes in ascending sorted
 * order. The kth node visited is the kth smallest. Can be done recursively with
 * a counter, or iteratively with an explicit stack for early stopping the moment
 * count reaches k, avoiding unnecessary traversal.
 *
 * KEY CONCEPTS
 * ------------
 * - BST inorder traversal yields nodes in ascending order
 * - Iterative inorder with explicit stack enables early termination at count = k
 * - Recursive approach with mutable counter also works
 *
 * COMPLEXITY TARGETS
 * ------------------
 * Time:  O(H + k) where H = tree height (O(log n) balanced, O(n) skewed)
 * Space: O(H) — stack depth
 * ============================================================
 */
public class P230KthSmallestElementInBST {

    public int kthSmallest(TreeNode root, int k) {
        // TODO: implement
        return 0;
    }

    public static void main(String[] args) {
        P230KthSmallestElementInBST sol = new P230KthSmallestElementInBST();
        TreeNode root1 = TreeNode.of(3, 1, 4, null, 2);
        System.out.println("P230KthSmallestElementInBST — kthSmallest([3,1,4,null,2], 1) expected 1: "
                + sol.kthSmallest(root1, 1));
        TreeNode root2 = TreeNode.of(5, 3, 6, 2, 4, null, null, 1);
        System.out.println("P230KthSmallestElementInBST — kthSmallest([5,3,6,2,4,null,null,1], 3) expected 3: "
                + sol.kthSmallest(root2, 3));
    }
}
