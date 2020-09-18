package linkedlist;


/**
 * Sum Lists: You have two numbers represented by a linked list,
 * where each node contains a single digit.
 * The digits are stored in normal order, such that the 1 's digit is at the tail of the list.
 * Write a function that adds the two numbers and returns the sum as a linked list.
 * <p>
 * EXAMPLE
 * Input:(7-> 1 -> 6) + (5 -> 9 -> 2).That is, 716 + 592.
 * Output:1 -> 4 -> 0 -> 8.That is, 1408.
 */
class _02_05_SumList {

    LinkedListNode sum(LinkedListNode l1, LinkedListNode l2) {
        if (l1 == null && l2 == null) return null;
        StringBuilder input1 = new StringBuilder().append(0);
        StringBuilder input2 = new StringBuilder().append(0);
        while (l1 != null || l2 != null) {
            if (l1 != null) {
                input1.append(l1.val);
                l1 = l1.next;
            }
            if (l2 != null) {
                input2.append(l2.val);
                l2 = l2.next;
            }
        }
        String out = Integer.toString(Integer.parseInt(input1.toString()) + Integer.parseInt(input2.toString()));
        LinkedListNode head = new LinkedListNode(Character.getNumericValue(out.charAt(0)));
        LinkedListNode curr = head;
        for (int i = 1; i < out.length(); ++i) {
            curr.next = new LinkedListNode(Character.getNumericValue(out.charAt(i)));
            curr = curr.next;
        }
        return head;
    }

}
