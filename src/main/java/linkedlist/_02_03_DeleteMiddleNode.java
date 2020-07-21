package linkedlist;

/**
 * Implement an algorithm to delete a node in the
 * middle(i.e., any node but the first and last node, not necessarily the exact middle)
 * of a singly linked list, given only access to that node.
 */
class _02_03_DeleteMiddleNode {

    boolean deleteMiddleNode(LinkedListNode node) {
        if (node == null || node.next == null) return false;
        LinkedListNode curr = node;
        LinkedListNode next = node.next;
        curr.val = next.val;
        curr.next = next.next;
        return true;
    }
}
