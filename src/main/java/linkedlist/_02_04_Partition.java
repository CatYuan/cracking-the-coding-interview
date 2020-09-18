package linkedlist;

/**
 * Partition: Write code to partition a linked list around a value x,
 * such that all nodes less than x come before all nodes greater than or equal to x.
 * If x is contained within the list, the values of x only need to be after the elements less than x (see below).
 * The partition element x can appear anywhere in the "right partition";
 * it does not need to appear between the left and right partitions.
 * EXAMPLE
 * Input: 3 -> 5 -> 8 -> 5 -> 10 -> 2 -> 1[partition=5]
 * Output: 3 -> 1 -> 2 -> 10 -> 5 -> 5 -> 8
 */
class _02_04_Partition {

    LinkedListNode partition(LinkedListNode head, int x) {
        if (head == null) return null;
        LinkedListNode prev = null;
        LinkedListNode curr = head;
        LinkedListNode partition = head;
        while (curr != null) {
            if (curr.val < x && curr.next != partition.next) {
                LinkedListNode temp1 = partition.next;
                LinkedListNode temp2 = curr.next;
                if (temp1.next == curr.next) {
                    partition = curr;
                    prev = curr;
                    curr = curr.next;
                } else if (partition.val >= x) {
                    int tempVal = partition.val;
                    partition.val = curr.val;
                    curr.val = tempVal;
                } else {
                    partition.next = curr;
                    curr.next = temp1;
                    prev.next = temp2;
                    partition = curr;
                    curr = temp2;
                }
            } else {
            prev = curr;
            curr = curr.next;
            }
        }
        return head;
    }
}
