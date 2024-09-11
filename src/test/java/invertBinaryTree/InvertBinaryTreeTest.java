package invertBinaryTree;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class InvertBinaryTreeTest {

    // Helper method to compare two trees
    private boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;
        return p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

    @Test
    void testInvertTree_singleNode() {
        TreeNode root = new TreeNode(1);
        TreeNode expected = new TreeNode(1);
        assertTrue(isSameTree(new InvertBinaryTree().invertTree(root), expected));
    }

    @Test
    void testInvertTree_completeTree() {
        TreeNode root = new TreeNode(4, new TreeNode(2, new TreeNode(1), new TreeNode(3)), new TreeNode(7, new TreeNode(6), new TreeNode(9)));
        TreeNode expected = new TreeNode(4, new TreeNode(7, new TreeNode(9), new TreeNode(6)), new TreeNode(2, new TreeNode(3), new TreeNode(1)));
        assertTrue(isSameTree(new InvertBinaryTree().invertTree(root), expected));
    }

    @Test
    void testInvertTree_leftSkewedTree() {
        TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(3), null), null);
        TreeNode expected = new TreeNode(1, null, new TreeNode(2, null, new TreeNode(3)));
        assertTrue(isSameTree(new InvertBinaryTree().invertTree(root), expected));
    }

    @Test
    void testInvertTree_rightSkewedTree() {
        TreeNode root = new TreeNode(1, null, new TreeNode(2, null, new TreeNode(3)));
        TreeNode expected = new TreeNode(1, new TreeNode(2, new TreeNode(3), null), null);
        assertTrue(isSameTree(new InvertBinaryTree().invertTree(root), expected));
    }

    @Test
    void testInvertTree_nullTree() {
        TreeNode root = null;
        TreeNode expected = null;
        assertTrue(isSameTree(new InvertBinaryTree().invertTree(root), expected));
    }
}
