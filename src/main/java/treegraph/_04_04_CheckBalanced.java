package treegraph;

/**
 * Implement a function to check if a binary tree is balanced.
 * For the purposes of this question, a balanced tree is defined to be a tree such that
 * the heights of the two subtrees of any node never differ by more than one.
 */
class _04_04_CheckBalanced {

    //time o(N) space o(logN)
    boolean isBalanced(BinaryTreeNode root) {
        if (root == null) {
            return true;
        }
        boolean curr = Math.abs(getHeight(root.left) - getHeight(root.right)) < 2;
        boolean left = isBalanced(root.left);
        boolean right = isBalanced(root.right);
        return left && right && curr;
    }

    int getHeight(BinaryTreeNode root) {
        if (root == null) {
            return -1;
        }
        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }


}
