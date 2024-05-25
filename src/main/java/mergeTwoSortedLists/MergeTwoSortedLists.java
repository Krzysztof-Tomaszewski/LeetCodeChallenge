package mergeTwoSortedLists;

// Link to the problem: https://leetcode.com/problems/merge-two-sorted-lists/description/
// Problem statement:
// You are given the heads of two sorted linked lists list1 and list2.
// Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.
// Return the head of the merged linked list.
//
// Example 1:
// Input: list1 = [1,2,4], list2 = [1,3,4]
// Output: [1,1,2,3,4,4]
//
// Example 2:
// Input: list1 = [], list2 = []
// Output: []
//
// Example 3:
// Input: list1 = [], list2 = [0]
// Output: [0]

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

}

class MergeTwoSortedLists {

    ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode resultHead;
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        if (list1.val <= list2.val) {
            resultHead = new ListNode(list1.val);
            list1 = list1.next;
        } else {
            resultHead = new ListNode(list2.val);
            list2 = list2.next;
        }
        ListNode actual = resultHead;
        do {
            if (list1 == null) {
                actual.next = new ListNode(list2.val);
                list2 = list2.next;
            } else if (list2 == null) {
                actual.next = new ListNode(list1.val);
                list1 = list1.next;
            } else {
                if (list1.val <= list2.val) {
                    actual.next = new ListNode(list1.val);
                    list1 = list1.next;
                } else {
                    actual.next = new ListNode(list2.val);
                    list2 = list2.next;
                }
            }
            actual = actual.next;
        } while (list1 != null || list2 != null);
        return resultHead;
    }
}

