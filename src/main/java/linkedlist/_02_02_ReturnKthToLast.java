package linkedlist;

/**
 * Implement an algorithm to find the kth to last element of a singly linked list
 * Runtime: O(n)
 */
class _02_02_ReturnKthToLast {

    LinkedListNode kthToLast(LinkedListNode head, int k) {
        int length = getLength(head);
        int index = length - k - 1;
        if (index < 0 || index >= length) return null;
        LinkedListNode curr = head;
        while(index != 0) {
            --index;
            curr = curr.next;
        }
        return curr;
    }

    int getLength(LinkedListNode head) {
        int length = 0;
        LinkedListNode curr = head;
        while(curr != null) {
            ++length;
            curr = curr.next;
        }
        return length;
    }
}
