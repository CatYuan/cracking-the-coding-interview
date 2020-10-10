package treegraph;

/**
 * You are given a binary tree in which each node contains an integer value (which might be positive or negative).
 * Design an algorithm to count the number of paths that sum to a given value.
 * The path does not need to start or end at the root or a leaf, but it must go downwards
 * (traveling only from parent nodes to child nodes).
 */
class _04_12_PathsWithSum {



    int countPathWithSum(BinaryTreeNode node, int target) {
        int rootPaths = _countPath(node, target, 0);
        int leftPaths = 0, rightPaths = 0;
        if (node != null) {
            leftPaths = countPathWithSum(node.left, target);
            rightPaths = countPathWithSum(node.right, target);
        }
        return rootPaths + leftPaths + rightPaths;
    }

    int _countPath(BinaryTreeNode node, int target, int sum) {
        int count = 0;
        if (node != null) {
            sum += node.val;
            count  += _countPath(node.left, target, sum);
            count += _countPath(node.right, target, sum);
            if (sum == target) ++count;
        }
        return count;
    }


}
