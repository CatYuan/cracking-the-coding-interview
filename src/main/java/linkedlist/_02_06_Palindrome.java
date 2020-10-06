package linkedlist;

import java.util.Stack;

/**
 * Palindrome: Implement a function to check if a linked list is a palindrome.
 *
 * runTime: T(n) = n + n < O(n)
 */
class _02_06_Palindrome {

    boolean isPalindrome(LinkedListNode head) {
        if (head == null) {
            return true;
        }
        Stack<Integer> str = new Stack<>();
        LinkedListNode curr = head;
        while (curr != null) {
            str.push(curr.val);
            curr = curr.next;
        }
        curr = head;
        while(curr != null) {
            if (str.peek() != curr.val) {
                return false;
            }
            str.pop();
            curr = curr.next;
        }
        return true;
    }


}
