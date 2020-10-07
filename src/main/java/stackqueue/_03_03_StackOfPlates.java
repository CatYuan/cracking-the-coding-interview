package stackqueue;

import java.util.ArrayList;
import java.util.Stack;

/**
 * : Imagine a (literal) stack of plates. If the stack gets too high, it might topple.
 * Therefore, in real life, we would likely start a new stack when the previous stack exceeds some
 * threshold. Implement a data structure SetOfStacks that mimics this. SetO-fStacks should be
 * composed of several stacks and should create a new stack once the previous one exceeds capacity.
 * SetOfStacks. push() and SetOfStacks. pop() should behave identically to a single stack
 * (that is, pop () should return the same values as it would if there were just a single stack).
 */
class _03_03_StackOfPlates {
    int threshold;
    ArrayList<Stack<Integer>> stacks;


    _03_03_StackOfPlates(int threshold) {
        this.threshold = threshold;
        stacks = new ArrayList<>();
    }

    void push(int val) {
        if (stacks.isEmpty() || stacks.get(stacks.size() - 1).size() == threshold) {
            Stack<Integer> s = new Stack<>();
            s.push(val);
            stacks.add(s);
        } else {
            stacks.get(stacks.size() - 1).push(val);
        }
    }

    int pop() {
        if (!stacks.isEmpty()) {
            int output = stacks.get(stacks.size() - 1).peek();
            stacks.get(stacks.size() - 1).pop();
            if (stacks.get(stacks.size() - 1).empty()) {
                stacks.remove(stacks.size() - 1);
            }
            return output;
        }
        return -1;
    }

    int popAt(int stackNum) {
        if (stackNum < stacks.size()) {
            int output = stacks.get(stackNum).peek();
            stacks.get(stackNum).pop();
            if (stacks.get(stackNum).empty()) {
                stacks.remove(stackNum);
            }
            return output;
        }
        return -1;
    }

}
