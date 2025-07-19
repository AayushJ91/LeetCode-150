//Problem: find the kth smallest element in teh given BST
//link: https://leetcode.com/problems/kth-smallest-element-in-a-bst/
//Source: LeetCode(100)
//Topics: Binary Search Tree
//Diff: - Med - done by solution
import java.util.ArrayList;
import java.util.List;

public class kthSmallest {
    static int naive(TreeNode root, int k) {
        List<Integer> x = new ArrayList<>();
        inorder(root, x);
        System.out.println(x);
        return x.get(k-1);
    }
    static void inorder(TreeNode root, List<Integer> x) {
        if (root == null) {
            return;
        }
        inorder(root.left, x);
        x.add(root.val);
        inorder(root.right, x);
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.left.right = new TreeNode(2);
        root.left.left = new TreeNode(0);
        root.left.left.left = new TreeNode(-1);
        //          3
        //         / \
        //        1   4
        //       /
        //      0
        //     /
        //   -1

        System.out.println(naive(root, 1));
    }
}
