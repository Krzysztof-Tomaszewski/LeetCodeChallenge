package cloneGraph;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CloneGraphTest {

    CloneGraph solution = new CloneGraph();

    @Test
    void testSingleNodeGraph() {
        CloneGraph.Node node = solution.new Node(1);
        CloneGraph.Node cloned = solution.cloneGraph(node);
        assertNotNull(cloned);
        assertEquals(1, cloned.val);
        assertTrue(cloned.neighbors.isEmpty());
    }

    @Test
    void testTwoNodeGraph() {
        CloneGraph.Node node1 = solution.new Node(1);
        CloneGraph.Node node2 = solution.new Node(2);
        node1.neighbors.add(node2);
        node2.neighbors.add(node1);

        CloneGraph.Node cloned = solution.cloneGraph(node1);
        assertNotNull(cloned);
        assertEquals(1, cloned.val);
        assertEquals(1, cloned.neighbors.size());
        assertEquals(2, cloned.neighbors.get(0).val);
    }

    @Test
    void testCycleGraph() {
        CloneGraph.Node node1 = solution.new Node(1);
        CloneGraph.Node node2 = solution.new Node(2);
        CloneGraph.Node node3 = solution.new Node(3);
        node1.neighbors.add(node2);
        node2.neighbors.add(node3);
        node3.neighbors.add(node1);

        CloneGraph.Node cloned = solution.cloneGraph(node1);
        assertNotNull(cloned);
        assertEquals(1, cloned.val);
        assertEquals(2, cloned.neighbors.get(0).val);
        assertEquals(3, cloned.neighbors.get(0).neighbors.get(0).val);
        assertEquals(1, cloned.neighbors.get(0).neighbors.get(0).neighbors.get(0).val);
    }

    @Test
    void testEmptyGraph() {
        CloneGraph.Node cloned = solution.cloneGraph(null);
        assertNull(cloned);
    }

    @Test
    void testComplexGraph() {
        CloneGraph.Node node1 = solution.new Node(1);
        CloneGraph.Node node2 = solution.new Node(2);
        CloneGraph.Node node3 = solution.new Node(3);
        CloneGraph.Node node4 = solution.new Node(4);

        node1.neighbors.add(node2);
        node1.neighbors.add(node4);
        node2.neighbors.add(node1);
        node2.neighbors.add(node3);
        node3.neighbors.add(node2);
        node3.neighbors.add(node4);
        node4.neighbors.add(node1);
        node4.neighbors.add(node3);

        CloneGraph.Node cloned = solution.cloneGraph(node1);
        assertNotNull(cloned);
        assertEquals(1, cloned.val);
        assertEquals(2, cloned.neighbors.get(0).val);
        assertEquals(4, cloned.neighbors.get(1).val);
    }
}
