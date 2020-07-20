package linkedlist;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;

/**
 * Remove Dups!
 * Write code to remove duplicates from an unsorted linked list.
 */
class _02_01_RemoveDups {

    LinkedListNode removeDups(LinkedListNode head) {
        if (head == null) {
            return null;
        }
        HashSet<Integer> set = new HashSet<>();
        LinkedListNode curr = head;
        LinkedListNode prev = null;
        while (curr != null) {
            if (set.contains(curr.val)) {
                if (prev == null) {
                    head = curr.next;
                    curr = curr.next;
                } else {
                    prev.next = curr.next;
                    curr = curr.next;
                }
            } else {
                set.add(curr.val);
                prev = curr;
                curr = curr.next;
            }
        }
        return head;
    }
}
