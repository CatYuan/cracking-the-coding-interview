package stackqueue;

import java.util.Stack;

/**
 * Write a program to sort a stack such that the smallest items are on the top.
 * You can use an additional temporary stack,
 * but you may not copy the elements into any other data structure (such as an array).
 * The stack supports the following operations: push, pop, peek, and isEmpty.
 */
class _03_05_SortStack {

    Stack<Integer> sort(Stack<Integer> stack) {
        Stack<Integer> tempStack = new Stack<>();
        while (!stack.empty()) {
            if (tempStack.empty()) {
                tempStack.push(stack.pop());
                continue;
            }
            if (stack.peek() < tempStack.peek()) {
                int val = stack.pop();
                while (!tempStack.empty() && tempStack.peek() > val) {
                    stack.push(tempStack.pop());
                }
                tempStack.push(val);
            } else {
                tempStack.push(stack.pop());
            }
        }
        while (!tempStack.empty()) {
            stack.push(tempStack.pop());
        }
        return stack;
    }
}
