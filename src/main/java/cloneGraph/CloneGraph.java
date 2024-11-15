package cloneGraph;

// Link: https://leetcode.com/problems/clone-graph/description/
// Problem Description:
// Given a reference of a node in a connected undirected graph.
// Return a deep copy (clone) of the graph.
// Each node in the graph contains a value (int) and a list (List[Node]) of its neighbors.

// Constraints:
// - The number of nodes in the graph is in the range [0, 100].
// - 1 <= Node.val <= 100
// - Node.val is unique for each node.
// - There are no repeated edges and no self-loops in the graph.
// - The graph is connected and undirected.

import java.util.ArrayList;
import java.util.List;

class CloneGraph {
    // Definition for a Node.
    class Node {
        int val;
        List<Node> neighbors;

        Node() {
            val = 0;
            neighbors = new ArrayList<>();
        }

        Node(int val) {
            this.val = val;
            neighbors = new ArrayList<>();
        }

        Node(int val, List<Node> neighbors) {
            this.val = val;
            this.neighbors = neighbors;
        }
    }

    // Implement your solution here.
    Node cloneGraph(Node node) {
        // TODO: Implement the solution
        return null;
    }
}

