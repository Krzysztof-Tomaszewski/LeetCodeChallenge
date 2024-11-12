package binaryTreeLevelOrderTraversal;

// Problem link: https://leetcode.com/problems/binary-tree-level-order-traversal/description/
// Description:
// Given the root of a binary tree, return the level order traversal of its nodes' values. (i.e., from left to right, level by level).
//
// Constraints:
// - The number of nodes in the tree is in the range [0, 2000].
// - -1000 <= Node.val <= 1000
//
// Example:
// Input: root = [3,9,20,null,null,15,7]
// Output: [[3],[9,20],[15,7]]

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class BinaryTreeLevelOrderTraversal {
    // Method to implement
    List<List<Integer>> levelOrder(TreeNode root) {
        // Your solution goes here
        List<List<Integer>> result = new ArrayList<>();
        Queue<Pair<Integer, TreeNode>> queue = new LinkedList<>();


        if (root == null) return result;
        result.add(List.of(root.val));
        if (root.left != null) {
            queue.offer(new Pair<>(1, root.left));
        }

        if (root.right != null) {
            queue.offer(new Pair<>(1, root.right));
        }


        while (!queue.isEmpty()) {
            Pair<Integer, TreeNode> pair = queue.poll();
            int currentLevel = pair.first();
            TreeNode currentNode = pair.second();

            if (result.size() <= currentLevel) {
                result.add(new ArrayList<>());
            }
            result.get(currentLevel).add(currentNode.val);


            if (currentNode.left != null) {
                queue.offer(new Pair<>(currentLevel + 1, currentNode.left));
            }

            if (currentNode.right != null) {
                queue.offer(new Pair<>(currentLevel + 1, currentNode.right));
            }

        }
        return result;
    }

    record Pair<T, U>(T first, U second) {

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Pair<?, ?> pair = (Pair<?, ?>) o;
            return first.equals(pair.first) && second.equals(pair.second);
        }

        @Override
        public String toString() {
            return "Pair{" +
                    "first=" + first +
                    ", second=" + second +
                    '}';
        }
    }
}