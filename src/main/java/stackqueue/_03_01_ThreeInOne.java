package stackqueue;

/**
 * Describe how you could use a single array to implement three stacks
 */
class _03_01_ThreeInOne {
    int[][] stacks;
    int[] pointers = new int[3];

    _03_01_ThreeInOne(int initSize) {
        stacks = new int[3][initSize];
    }

    void push(int stackNum, int val) {
        if (pointers[stackNum] < stacks[stackNum].length) {
            int index = pointers[stackNum];
            pointers[stackNum] = index + 1;
            stacks[stackNum][index] = val;
        }
    }

    int pop(int stackNum) {
        if (pointers[stackNum] > 0 && pointers[stackNum] <= stacks[stackNum].length) {
            int index = pointers[stackNum] - 1;
            pointers[stackNum] = index;
            int value = stacks[stackNum][index];
            stacks[stackNum][index] = 0;
            return value;
        }
        return 0;
    }


}
