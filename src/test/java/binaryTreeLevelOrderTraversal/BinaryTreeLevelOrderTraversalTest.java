package binaryTreeLevelOrderTraversal;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.List;

class BinaryTreeLevelOrderTraversalTest {

    @Test
    void testSingleElementTree() {
        TreeNode root = new TreeNode(1);
        BinaryTreeLevelOrderTraversal traversal = new BinaryTreeLevelOrderTraversal();
        List<List<Integer>> result = traversal.levelOrder(root);
        assertEquals(List.of(List.of(1)), result);
    }

    @Test
    void testNullTree() {
        TreeNode root = null;
        BinaryTreeLevelOrderTraversal traversal = new BinaryTreeLevelOrderTraversal();
        List<List<Integer>> result = traversal.levelOrder(root);
        assertEquals(List.of(), result);
    }

    @Test
    void testTwoLevelTree() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        BinaryTreeLevelOrderTraversal traversal = new BinaryTreeLevelOrderTraversal();
        List<List<Integer>> result = traversal.levelOrder(root);
        assertEquals(List.of(List.of(3), List.of(9, 20)), result);
    }

    @Test
    void testComplexTree() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        BinaryTreeLevelOrderTraversal traversal = new BinaryTreeLevelOrderTraversal();
        List<List<Integer>> result = traversal.levelOrder(root);
        assertEquals(List.of(List.of(3), List.of(9, 20), List.of(15, 7)), result);
    }

    @Test
    void testAllLeftTree() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.left.left = new TreeNode(4);
        BinaryTreeLevelOrderTraversal traversal = new BinaryTreeLevelOrderTraversal();
        List<List<Integer>> result = traversal.levelOrder(root);
        assertEquals(List.of(List.of(1), List.of(2), List.of(3), List.of(4)), result);
    }
}
