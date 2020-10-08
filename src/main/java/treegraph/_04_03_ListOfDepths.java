package treegraph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 *  Given a binary tree, design an algorithm which creates a linked list of all the nodes
 * at each depth (e.g., if you have a tree with depth D, you'll have D linked lists).
 */
class _04_03_ListOfDepths {

    //time o(N) space o(N)
    List<LinkedList<Integer>> create(BinaryTreeNode node) {
        List<LinkedList<Integer>> output = new ArrayList<>();
        Queue<BinaryTreeNode> q = new LinkedList<>();
        q.add(node);
        while (!q.isEmpty()) {
            LinkedList<Integer> level = new LinkedList<>();
            int rowSize = q.size();
            while (rowSize > 0) {
                BinaryTreeNode curr = q.remove();
                level.add(curr.val);
                if (curr.left != null) {
                    q.add(curr.left);
                }
                if (curr.right != null) {
                    q.add(curr.right);
                }
                --rowSize;
            }
            output.add(level);
        }
        return output;
    }

}
