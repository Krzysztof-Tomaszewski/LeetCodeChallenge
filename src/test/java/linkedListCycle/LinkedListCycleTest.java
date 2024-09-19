package linkedListCycle;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class LinkedListCycleTest {

    @Test
    void testCycleAtFirstNode() {
        // Example: head = [3,2,0,-4], pos = 1
        ListNode head = createCyclicList(new int[]{3, 2, 0, -4}, 1);
        LinkedListCycle solution = new LinkedListCycle();
        assertTrue(solution.hasCycle(head));
    }

    @Test
    void testCycleAtZeroIndex() {
        // Example: head = [1, 2], pos = 0
        ListNode head = createCyclicList(new int[]{1, 2}, 0);
        LinkedListCycle solution = new LinkedListCycle();
        assertTrue(solution.hasCycle(head));
    }

    @Test
    void testNoCycleSingleNode() {
        // Example: head = [1], pos = -1
        ListNode head = new ListNode(1);
        LinkedListCycle solution = new LinkedListCycle();
        assertFalse(solution.hasCycle(head));
    }

    @Test
    void testNoCycleMultipleNodes() {
        // Example: head = [1, 2, 3, 4], pos = -1 (no cycle)
        ListNode head = createCyclicList(new int[]{1, 2, 3, 4}, -1);
        LinkedListCycle solution = new LinkedListCycle();
        assertFalse(solution.hasCycle(head));
    }

    @Test
    void testEmptyList() {
        // Edge case: empty list
        LinkedListCycle solution = new LinkedListCycle();
        assertFalse(solution.hasCycle(null));
    }

    // Helper method to create a linked list with a cycle
    ListNode createCyclicList(int[] values, int pos) {
        if (values.length == 0) return null;
        ListNode head = new ListNode(values[0]);
        ListNode current = head;
        ListNode cycleNode = null;
        if (pos == 0) cycleNode = head;

        for (int i = 1; i < values.length; i++) {
            current.next = new ListNode(values[i]);
            current = current.next;
            if (i == pos) cycleNode = current;
        }
        if (cycleNode != null) current.next = cycleNode;
        return head;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}
