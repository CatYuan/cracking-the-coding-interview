package stackqueue;

import java.util.Stack;

/**
 *  Implement a MyQueue class which implements a queue using two stacks
 */
class _03_04_QueueViaStacks {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    void enqueue(int val) {
        if (s2.empty()) {
            s2.push(val);
            return;
        }
        while (!s2.empty()) {
            s1.push(s2.pop());
        }
        s1.push(val);
        while(!s1.empty()) {
            s2.push(s1.pop());
        }
    }

    int size() {
        return s2.size();
    }

    int peek() {
        if (s2.empty()) {
            return -1;
        }
        return s2.peek();
    }

    int dequeue() {
        if (s2.empty()) {
            return -1;
        }
        return s2.pop();
    }


}
