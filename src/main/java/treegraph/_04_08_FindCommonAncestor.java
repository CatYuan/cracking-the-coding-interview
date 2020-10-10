package treegraph;


import java.util.*;

/**
 * Design an algorithm and write code to find the first common ancestor of two nodes in a binary tree.
 * Avoid storing additional nodes in a data structure. NOTE: This is not necessarily a binary search tree.
 */
class _04_08_FindCommonAncestor {

    ParentAwareBinaryTreeNode findCommonAncestor(ParentAwareBinaryTreeNode a, ParentAwareBinaryTreeNode b) {
        if (a == b) return a;
        Stack<ParentAwareBinaryTreeNode> path1 = findPath(a);
        Stack<ParentAwareBinaryTreeNode> path2 = findPath(b);
        ParentAwareBinaryTreeNode prev = path1.peek();
        while (!path1.isEmpty() && !path2.isEmpty()) {
            if (path1.peek() != path2.peek()) {
                return prev;
            }
            prev = path1.pop();
            path2.pop();
        }
        return prev;
    }

    Stack<ParentAwareBinaryTreeNode> findPath(ParentAwareBinaryTreeNode root) {
        Stack<ParentAwareBinaryTreeNode> path = new Stack<>();
        ParentAwareBinaryTreeNode parent = root;
        while (parent != null) {
            path.add(parent);
            parent = parent.parent;
        }
        return path;
    }


}
