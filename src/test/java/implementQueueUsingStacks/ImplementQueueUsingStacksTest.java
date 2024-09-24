package implementQueueUsingStacks;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ImplementQueueUsingStacksTest {

    @Test
    void testQueueOperations() {
        MyQueue queue = new MyQueue();

        // Test 1: Push and Peek
        queue.push(1);
        assertEquals(1, queue.peek(), "Test 1 failed: peek should return 1 after pushing 1.");

        // Test 2: Push more elements and Peek
        queue.push(2);
        assertEquals(1, queue.peek(), "Test 2 failed: peek should return 1 after pushing 2.");

        // Test 3: Pop and check if the queue is behaving correctly
        assertEquals(1, queue.pop(), "Test 3 failed: pop should return 1.");
        assertEquals(2, queue.peek(), "Test 3 failed: peek should return 2 after popping 1.");

        // Test 4: Pop the remaining element
        assertEquals(2, queue.pop(), "Test 4 failed: pop should return 2.");
        assertTrue(queue.empty(), "Test 4 failed: queue should be empty after popping all elements.");

        // Test 5: Check empty queue
        queue.push(3);
        assertFalse(queue.empty(), "Test 5 failed: queue should not be empty after pushing an element.");
        assertEquals(3, queue.peek(), "Test 5 failed: peek should return 3 after pushing 3.");
    }
}