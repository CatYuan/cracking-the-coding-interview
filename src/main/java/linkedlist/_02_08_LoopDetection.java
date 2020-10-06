package linkedlist;

import java.util.HashSet;
import java.util.Set;

/**
 * Loop Detection: Given a circular linked list, implement an algorithm that returns the node at the
 * beginning of the loop.
 * <p>
 * DEFINITION
 * Circular linked list: A (corrupt) linked list in which a node's next pointer points to an earlier node, so as to make a loop in the linked list.
 * <p>
 * EXAMPLE
 * Input: A -> B -> C -> D -> E -> C[the same C as earlier]
 * Output: C
 *
 * runTime: O(n)
 */
class _02_08_LoopDetection {

    LinkedListNode detect(LinkedListNode head) {
        Set<Integer> addresses = new HashSet<>();
        LinkedListNode curr = head;
        while (curr != null) {
            if (addresses.contains(System.identityHashCode(curr))) {
                return curr;
            } else {
                addresses.add(System.identityHashCode(curr));
            }
            curr = curr.next;
        }
        return null;
    }
}
