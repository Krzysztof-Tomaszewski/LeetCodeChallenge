package mergeTwoSortedLists;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MergeTwoSortedListsTest {

    @Test
    void testExample1() {
        MergeTwoSortedLists solution = new MergeTwoSortedLists();
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode expected = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(4))))));
        assertTrue(areEqual(expected, solution.mergeTwoLists(l1, l2)));
    }

    @Test
    void testEmptyList1() {
        MergeTwoSortedLists solution = new MergeTwoSortedLists();
        ListNode l1 = null;
        ListNode l2 = new ListNode(0);
        ListNode expected = new ListNode(0);
        assertTrue(areEqual(expected, solution.mergeTwoLists(l1, l2)));
    }

    @Test
    void testEmptyList2() {
        MergeTwoSortedLists solution = new MergeTwoSortedLists();
        ListNode l1 = new ListNode(0);
        ListNode l2 = null;
        ListNode expected = new ListNode(0);
        assertTrue(areEqual(expected, solution.mergeTwoLists(l1, l2)));
    }

    @Test
    void testBothEmptyLists() {
        MergeTwoSortedLists solution = new MergeTwoSortedLists();
        ListNode l1 = null;
        ListNode l2 = null;
        assertNull(solution.mergeTwoLists(l1, l2));
    }

    @Test
    void testDifferentLengthLists() {
        MergeTwoSortedLists solution = new MergeTwoSortedLists();
        ListNode l1 = new ListNode(1, new ListNode(2));
        ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode expected = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4)))));
        assertTrue(areEqual(expected, solution.mergeTwoLists(l1, l2)));
    }

    private boolean areEqual(ListNode l1, ListNode l2) {
        while (l1 != null && l2 != null) {
            if (l1.val != l2.val) {
                return false;
            }
            l1 = l1.next;
            l2 = l2.next;
        }
        System.out.println("Expected: " + l1);
        System.out.println("Actual: " + l2);
        return l1 == null && l2 == null;
    }
}
