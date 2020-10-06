package linkedlist;

/**
 * Intersection: Given two (singly) linked lists, determine if the two lists intersect.
 * Return the intersecting node. Note that the intersection is de ned based on reference, not value.
 * That is, if the kth node of the first linked list is the exact same node (by reference)
 * as the jth node of the second linked list, then they are intersecting.
 *
 * n is length of l1, m is length of l2
 * runTime: O(n+m)
 */
class _02_07_Intersection {

    boolean intersects(LinkedListNode l1, LinkedListNode l2) {
        if (l1 == null || l2 == null) {
            return false;
        }
        int l1Hash = 0;
        int l2Hash = 0;
        LinkedListNode curr1 = l1;
        while (curr1.next != null) {
            curr1 = curr1.next;
        }
        l1Hash = System.identityHashCode(curr1);
        LinkedListNode curr2 = l2;
        while (curr2.next != null) {
            curr2 = curr2.next;
        }
        l2Hash = System.identityHashCode(curr2);
        return l1Hash == l2Hash;
    }
}
