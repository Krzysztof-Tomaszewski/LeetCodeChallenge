package reverseLinkedList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class ReverseLinkedListTest {

    @Test
    void testSingleElement() {
        ListNode head = new ListNode(1);
        ListNode reversed = new ReverseLinkedList().reverseList(head);
        assertEquals(1, reversed.val);
        assertNull(reversed.next);
    }

    @Test
    void testTwoElements() {
        ListNode head = new ListNode(1, new ListNode(2));
        ListNode reversed = new ReverseLinkedList().reverseList(head);
        assertEquals(2, reversed.val);
        assertEquals(1, reversed.next.val);
        assertNull(reversed.next.next);
    }

    @Test
    void testMultipleElements() {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode reversed = new ReverseLinkedList().reverseList(head);
        assertEquals(5, reversed.val);
        assertEquals(4, reversed.next.val);
        assertEquals(3, reversed.next.next.val);
        assertEquals(2, reversed.next.next.next.val);
        assertEquals(1, reversed.next.next.next.next.val);
        assertNull(reversed.next.next.next.next.next);
    }

    @Test
    void testEmptyList() {
        ListNode head = null;
        ListNode reversed = new ReverseLinkedList().reverseList(head);
        assertNull(reversed);
    }

    @Test
    void testSingleNodeWithNegativeValue() {
        ListNode head = new ListNode(-1);
        ListNode reversed = new ReverseLinkedList().reverseList(head);
        assertEquals(-1, reversed.val);
        assertNull(reversed.next);
    }
}
