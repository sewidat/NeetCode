package org.example.trees;
import org.example.common.TreeNode;
import java.util.HashMap;
import java.util.Map;

/**
 * ============================================================
 * LeetCode #105 - Construct Binary Tree from Preorder and Inorder Traversal
 * Difficulty: Medium
 * Category: Trees
 * ============================================================
 *
 * PROBLEM
 * -------
 * Given two integer arrays preorder and inorder where preorder is the
 * preorder traversal of a binary tree and inorder is the inorder traversal
 * of the same tree, construct and return the binary tree.
 *
 * CONSTRAINTS
 * -----------
 * - Number of nodes: 1 to 3000
 * - -3000 <= preorder[i], inorder[i] <= 3000
 * - preorder and inorder are permutations of the same values
 * - All values are unique
 *
 * EXAMPLES
 * --------
 * Input:  preorder = [3,9,20,15,7], inorder = [9,3,15,20,7]
 * Output: [3,9,20,null,null,15,7]
 *
 * Input:  preorder = [-1], inorder = [-1]
 * Output: [-1]
 *
 * INTUITION & APPROACH
 * --------------------
 * Key insight: preorder[0] is always the root. Find root's index in inorder
 * (call it idx). Elements inorder[0..idx-1] form the left subtree; elements
 * inorder[idx+1..] form the right subtree. The left subtree has (idx) nodes,
 * so preorder[1..idx] are its preorder traversal. Recurse on both halves.
 * Use a HashMap for O(1) index lookups in inorder instead of O(n) scan.
 *
 * KEY CONCEPTS
 * ------------
 * - Preorder gives the root first; inorder splits left and right subtrees
 * - HashMap<value, inorderIndex> enables O(1) root-position lookup
 * - Pass index boundaries to avoid array copying at each recursion level
 *
 * COMPLEXITY TARGETS
 * ------------------
 * Time:  O(n) — each node processed once with O(1) HashMap lookups
 * Space: O(n) — HashMap storage plus O(h) recursion stack
 * ============================================================
 */
public class P105ConstructBinaryTreeFromPreorderAndInorder {

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        // TODO: implement
        return null;
    }

    public static void main(String[] args) {
        P105ConstructBinaryTreeFromPreorderAndInorder sol =
                new P105ConstructBinaryTreeFromPreorderAndInorder();
        int[] preorder = {3, 9, 20, 15, 7};
        int[] inorder  = {9, 3, 15, 20, 7};
        TreeNode result = sol.buildTree(preorder, inorder);
        System.out.println("P105ConstructBinaryTreeFromPreorderAndInorder — buildTree result root val "
                + "(expected 3): " + (result != null ? result.val : "null"));
    }
}
