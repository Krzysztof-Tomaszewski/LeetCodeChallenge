package lowestCommonAncestorOfABinarySearchTree;

// Problem link: https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/description/

/*
    Problem:
    Given a binary search tree (BST), find the lowest common ancestor (LCA) of two given nodes in the BST.

    The lowest common ancestor is defined between two nodes p and q as the lowest node in the tree that has both p and q as descendants
    (where we allow a node to be a descendant of itself).

    Constraints:
    - The number of nodes in the tree is in the range [2, 10^5].
    - -10^9 <= Node.val <= 10^9
    - All Node.val are unique.
    - p != q
    - p and q will exist in the BST.
*/

class LowestCommonAncestorOfABinarySearchTree {

    TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        if (root.val == p.val || root.val == q.val) {
            return root;
        }

        boolean pExistsInBranchLeft = existsInBranch(root.left, p.val);
        boolean qExistsInBranchLeft = existsInBranch(root.left, q.val);
        boolean pExistsInBranchRight = existsInBranch(root.right, p.val);
        boolean qExistsInBranchRight = existsInBranch(root.right, q.val);

        if ((pExistsInBranchLeft && qExistsInBranchRight) || (pExistsInBranchRight && qExistsInBranchLeft)) {
            return root;
        }
        if (pExistsInBranchLeft && qExistsInBranchLeft) {
            return lowestCommonAncestor(root.left, p, q);
        }
        if (pExistsInBranchRight && qExistsInBranchRight) {
            return lowestCommonAncestor(root.right, p, q);
        }
        return null;
    }

    boolean existsInBranch(TreeNode node, int val) {
        if (node.val == val) return true;
        if (node.left != null && existsInBranch(node.left, val)) return true;
        return node.right != null && existsInBranch(node.right, val);
    }
}

