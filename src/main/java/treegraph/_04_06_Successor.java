package treegraph;

/**
 * Write an algorithm to find the "next" node (i.e., in-order successor) of a given node in a binary search tree.
 * You may assume that each node has a link to its parent.
 */
class _04_06_Successor {
    ParentAwareBinaryTreeNode findInOrderSuccessor(ParentAwareBinaryTreeNode node) {
        if (node == null) return null;
        if (node.right != null) {
            return node.right;
        }
        ParentAwareBinaryTreeNode parent = node.parent;
        if (parent == null) {
            return null;
        }
        if (parent.left == node) {
            return parent;
        }
        while (parent.parent != null) {
            parent = parent.parent;
        }
        return parent;
    }


}
