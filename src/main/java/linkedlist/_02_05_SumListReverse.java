package linkedlist;


/**
 * Sum Lists: You have two numbers represented by a linked list,
 * where each node contains a single digit.
 * The digits are stored in reverse order, such that the 1 's digit is at the head of the list.
 * Write a function that adds the two numbers and returns the sum as a linked list.
 * <p>
 * EXAMPLE
 * Input:(7-> 1 -> 6) + (5 -> 9 -> 2).That is,617 + 295.
 * Output:2 -> 1 -> 9.That is,912.
 */
class _02_05_SumListReverse {
    LinkedListNode sum(LinkedListNode l1, LinkedListNode l2) {
        if (l1 == null && l2 == null) {
            return null;
        }
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        LinkedListNode output = new LinkedListNode(0);
        LinkedListNode curr = null;
        int carryover = 0;
        while (l1 != null && l2 != null) {
            if (curr == null) {
                curr = output;
            } else {
                curr.next = new LinkedListNode(0);
                curr = curr.next;
            }
            if (l1 == null) {
                l1 = new LinkedListNode(0);
            }
            if (l2 == null) {
                l2 = new LinkedListNode(0);
            }
            int add = l1.val + l2.val + carryover;
            curr.val = add % 10;
            carryover = add / 10;
            l1 = l1.next;
            l2 = l2.next;
        }
        if (carryover > 0) {
            curr.next = new LinkedListNode(carryover);
        }
        return output;
    }
}
