package treegraph;

import java.util.Random;

/**
 * You are implementing a binary tree class from scratch
 * which, in addition to insert, find, and delete, has a method getRandomNode()
 * which returns a random node from the tree.
 * <p>
 * All nodes should be equally likely to be chosen.
 * Design and implement an algorithm for getRandomNode,
 * and explain how you would implement the rest of the methods.
 */
class _04_11_RandomNode {

    public static class Node {
        int val;
        Node left;
        Node right;

        Node(int val) {
            this.val = val;
            left = null;
            right = null;
        }
        int getVal() {return val;}
    }

    static class Tree {
        Node root;

        void insert(int val) {
            if (root == null) {
                root = new Node(val);
                return;
            }
            _insert(val, root);
        }

        void _insert(int val, Node curr) {
            Random random = new Random();
            int branch = random.nextInt(2);
            if (branch == 0 && curr.left == null) { // branch left
                curr.left = new Node(val);
                return;
            } else if (curr.right == null){ // branch right
                curr.right = new Node(val);
                return;
            }
            _insert(val, branch == 0? curr.left : curr.right);
        }

        Node find(int val) {
            return _find(val, root);
        }

        Node _find(int val, Node curr) {
            if (curr == null) return null;
            if (curr.val == val) return curr;
            Node left = _find(val, curr.left);
            Node right = _find(val, curr.right);
            return left != null ? left : right;
        }

        Node getRandomNode() {
            Random random = new Random();
            int height = getHeight(root);
            int searchHeight = random.nextInt(height + 1);
            Node output = root;
            for (int i = 0; i < searchHeight; i++) {
                int branch = random.nextInt(2);
                if (branch == 0) {
                    output = output.left;
                } else {
                    output = output.right;
                }
            }
            return output;
        }

        int getHeight(Node curr) {
            if (curr == null) return -1;
            return Math.max(getHeight(curr.left), getHeight(curr.right)) + 1;
        }
    }
}
