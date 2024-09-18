package balancedBinaryTree;

// Link to the problem: https://leetcode.com/problems/balanced-binary-tree/description/
//
// Problem statement:
// Given a binary tree, determine if it is height-balanced.
//
// For this problem, a height-balanced binary tree is defined as:
// a binary tree in which the left and right subtrees of every node differ in height by no more than 1.
//
// Example 1:
// Input: root = [3,9,20,null,null,15,7]
// Output: true
//
// Example 2:
// Input: root = [1,2,2,3,3,null,null,4,4]
// Output: false
//
// Example 3:
// Input: root = []
// Output: true

class BalancedBinaryTree {

    boolean isBalanced(TreeNode root) {
        if (root == null || (root.left == null && root.right == null)) {
            return true;
        }
        int depthL = 0;
        int depthR = 0;
        if (root.left != null) {
            depthL = depthOfNode(root.left, 1);
        }
        if (root.right != null) {
            depthR = depthOfNode(root.right, 1);
        }
        boolean isBalanced;
        if (depthL > depthR) {
            isBalanced = (depthL - 1) <= depthR;
        } else {
            isBalanced = (depthR - 1) <= depthL;
        }

        if(isBalanced){
            if(isBalanced(root.left)) {
                if(isBalanced(root.right)) {
                    return true;
                }
            }
        }
        return false;
    }

    int depthOfNode(TreeNode node, int actual) {
        int depthL = 0;
        int depthR = 0;
        if (node.left == null && node.right == null) {
            return actual;
        }
        if (node.left != null) {
            depthL = depthOfNode(node.left, actual + 1);
        }
        if (node.right != null) {
            depthR = depthOfNode(node.right, actual + 1);
        }
        return Math.max(depthL, depthR);
    }
}

