package balancedBinaryTree;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class BalancedBinaryTreeTest {

    @Test
    void testBalancedTree() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        BalancedBinaryTree solution = new BalancedBinaryTree();
        assertTrue(solution.isBalanced(root));
    }

    @Test
    void testUnbalancedTree() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(3);
        root.left.left.left = new TreeNode(4);
        root.left.left.right = new TreeNode(4);

        BalancedBinaryTree solution = new BalancedBinaryTree();
        assertFalse(solution.isBalanced(root));
    }

    @Test
    void testEmptyTree() {
        BalancedBinaryTree solution = new BalancedBinaryTree();
        assertTrue(solution.isBalanced(null));
    }

    @Test
    void testSingleNodeTree() {
        TreeNode root = new TreeNode(1);

        BalancedBinaryTree solution = new BalancedBinaryTree();
        assertTrue(solution.isBalanced(root));
    }

    @Test
    void testAlmostBalancedTree() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.left.left = new TreeNode(5);

        BalancedBinaryTree solution = new BalancedBinaryTree();
        assertFalse(solution.isBalanced(root));
    }
}
