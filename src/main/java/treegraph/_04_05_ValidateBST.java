package treegraph;

/**
 * Implement a function to check if a binary tree is a binary search tree.
 */
class _04_05_ValidateBST {


    boolean isBST(BinaryTreeNode root) {
        if (root == null) {
            return true;
        }
        int currVal = root.val;
        if (root.left != null) {
            int left = root.left.val;
            if (left > currVal) return false;
        }
        if (root.right != null) {
            int right = root.right.val;
            if (right < currVal) return false;
        }
        return (isBST(root.left) && isBST(root.right));
    }


}
