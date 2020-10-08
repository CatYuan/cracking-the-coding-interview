package treegraph;

import java.util.Arrays;

/**
 * Given a sorted (increasing order) array with unique integer elements, write an algorithm
 * to create a binary search tree with minimal height.
 */
class _04_02_MinimalTree {

    BinaryTreeNode buildMinimalTree(int[] vals) {
        if (vals.length == 0) {
            return null;
        }
        if (vals.length == 1) {
            return new BinaryTreeNode(vals[0]);
        }
        int m = (int) (vals.length - 1) / 2;
        BinaryTreeNode head = new BinaryTreeNode(vals[m]);
        head.left = buildMinimalTree(Arrays.copyOfRange(vals, 0, m));
        head.right = buildMinimalTree(Arrays.copyOfRange(vals, m + 1, vals.length));
        return head;
    }


}
