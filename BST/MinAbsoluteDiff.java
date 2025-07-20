//Problem: return minimum absolute diff between the nodes;
//link: https://leetcode.com/problems/minimum-absolute-difference-in-bst/
//Source: LeetCode(530)
//Topics: BST
//Diff: - Easy

public class MinAbsoluteDiff {
    int diff = Integer.MAX_VALUE;
    TreeNode prev = null;
    public int getMinimumDifference(TreeNode root) {
        inOrder(root);
        return diff;
    }
    void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        if (prev != null) {
            diff = Math.min(diff, Math.abs(root.val - prev.val));
        }
        prev = root;
        inOrder(root.right);
    }
}
