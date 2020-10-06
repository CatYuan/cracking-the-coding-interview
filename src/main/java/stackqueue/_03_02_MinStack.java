package stackqueue;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 * How would you design a stack which, in addition to push and pop, has a function min which returns the minimum element?
 * Push, pop and min should all operate in 0(1) time.
 */
class _03_02_MinStack {
    Stack<Integer> s = new Stack<>();
    int min;
    private Exception EmptyStackException;

    void push(int val) {
        if(s.empty()) {
            min = val;
            s.push(val);
        } else if (val < min) {
            s.push(2*val - min);
            min = val;
        } else {
            s.push(val);
        }
    }

    int pop() throws Exception {
        if (s.empty()) {
            throw EmptyStackException;
        }
        int stackVal = s.peek();
        if (stackVal < min) { // we are trying to remove current min
            int retVal = min;
            min = 2*min - stackVal;
            s.pop();
            return retVal;
        } else {
            int val = s.peek();
            s.pop();
            return val;
        }
    }

    int min() {
        return min;
    }
}
