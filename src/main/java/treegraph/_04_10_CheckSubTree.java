package treegraph;


/**
 * T1 and T2 are two very large binary trees, with T1 much bigger than T2. Create an
 * algorithm to determine if T2 is a subtree of T1.
 * <p>
 * A tree T2 is a subtree of T1 if there exists a node n in T1 such that the subtree of n is identical to T2.
 * That is, if you cut off the tree at node n, the two trees would be identical.
 */
class _04_10_CheckSubTree {

    private StringBuilder sb;

    boolean isSubTree(BinaryTreeNode a, BinaryTreeNode b) {
        if (a == null && b != null) return false;
        if (a!=null && b== null) return true;
        if (checkEquality(a, b)) return true;
        boolean left = isSubTree(a.left, b);
        boolean right = isSubTree(a.right, b);
        return left || right;
    }

    boolean checkEquality(BinaryTreeNode a, BinaryTreeNode b) {
        if (a == b) return true;
        if (a == null || b == null) return false;
        boolean left = checkEquality(a.left, b.left);
        boolean right = checkEquality(a.right, b.right);
        return a.val==b.val && left && right;
    }




}
