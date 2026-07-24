package BinaryTree;
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null)
            return false;

        // Leaf node
        if (root.left == null && root.right == null) {
            return targetSum == root.val;
        }

        return hasPathSum(root.left, targetSum - root.val)
                || hasPathSum(root.right, targetSum - root.val);
    }
}

public class PathSum {
    public static void main(String[] args) {

        /*
                 5
                / \
               4   8
              /   / \
             11  13  4
            /  \      \
           7    2      1

        Target Sum = 22
        Path: 5 → 4 → 11 → 2
        */

        TreeNode root = new TreeNode(5);

        root.left = new TreeNode(4);
        root.right = new TreeNode(8);

        root.left.left = new TreeNode(11);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);

        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.right.right.right = new TreeNode(1);

        Solution obj = new Solution();

        int targetSum = 22;

        boolean ans = obj.hasPathSum(root, targetSum);

        System.out.println("Path Exists: " + ans);
    }
}