package lowestCommonAncestorOfABinarySearchTree;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LowestCommonAncestorOfABinarySearchTreeTest {

    // Helper method to create a binary search tree from an array
    private TreeNode createBSTFromArray(int[] values) {
        TreeNode root = null;
        for (int value : values) {
            root = insertIntoBST(root, value);
        }
        return root;
    }

    private TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }
        if (val < root.val) {
            root.left = insertIntoBST(root.left, val);
        } else {
            root.right = insertIntoBST(root.right, val);
        }
        return root;
    }

    @Test
    void testCase1() {
        LowestCommonAncestorOfABinarySearchTree solver = new LowestCommonAncestorOfABinarySearchTree();
        int[] values = {6, 2, 8, 0, 4, 7, 9, 3, 5};
        TreeNode root = createBSTFromArray(values);
        TreeNode p = new TreeNode(2);
        TreeNode q = new TreeNode(8);
        assertEquals(6, solver.lowestCommonAncestor(root, p, q).val);
    }

    @Test
    void testCase2() {
        LowestCommonAncestorOfABinarySearchTree solver = new LowestCommonAncestorOfABinarySearchTree();
        int[] values = {6, 2, 8, 0, 4, 7, 9, 3, 5};
        TreeNode root = createBSTFromArray(values);
        TreeNode p = new TreeNode(2);
        TreeNode q = new TreeNode(4);
        assertEquals(2, solver.lowestCommonAncestor(root, p, q).val);
    }

    @Test
    void testCase3() {
        LowestCommonAncestorOfABinarySearchTree solver = new LowestCommonAncestorOfABinarySearchTree();
        int[] values = {6, 2, 8, 0, 4, 7, 9, 3, 5};
        TreeNode root = createBSTFromArray(values);
        TreeNode p = new TreeNode(3);
        TreeNode q = new TreeNode(5);
        assertEquals(4, solver.lowestCommonAncestor(root, p, q).val);
    }

    @Test
    void testCase4() {
        LowestCommonAncestorOfABinarySearchTree solver = new LowestCommonAncestorOfABinarySearchTree();
        int[] values = {2, 1};
        TreeNode root = createBSTFromArray(values);
        TreeNode p = new TreeNode(2);
        TreeNode q = new TreeNode(1);
        assertEquals(2, solver.lowestCommonAncestor(root, p, q).val);
    }

    @Test
    void testCase5() {
        LowestCommonAncestorOfABinarySearchTree solver = new LowestCommonAncestorOfABinarySearchTree();
        int[] values = {5, 3, 6, 2, 4, 1};
        TreeNode root = createBSTFromArray(values);
        TreeNode p = new TreeNode(1);
        TreeNode q = new TreeNode(6);
        assertEquals(5, solver.lowestCommonAncestor(root, p, q).val);
    }
}
