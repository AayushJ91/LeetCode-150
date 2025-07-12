//Problem: Check whether the given trees are same or not.
//link: https://leetcode.com/problems/same-tree/?envType=study-plan-v2&envId=top-interview-150
//Source: LeetCode(100)
//Topics: Binary Tree
//Diff: - Easy - done

import java.util.*;

public class SameTree {
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        //Time: Best
        //Space: Best
        List<Integer> qPre = new ArrayList<>();
        List<Integer> pPre = new ArrayList<>();

        preOrder(p, pPre);
        preOrder(q, qPre);

        if (pPre.size() != qPre.size()) {
            return false;
        }
        for (int i = 0; i < pPre.size(); i++) {
            if (!Objects.equals(pPre.get(i), qPre.get(i))) {
                return false;
            }
        }
        return true;
    }
    static void preOrder(TreeNode root, List<Integer> list) {
        if (root == null) {
            list.add(Integer.MIN_VALUE);
            return;
        }
        list.add(root.val);
        preOrder(root.left, list);
        preOrder(root.right, list);
    }

    public static void main(String[] args) {
        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);
        p.right = new TreeNode(3);

        TreeNode q = new TreeNode(1);
        q.left = new TreeNode(2);
        q.right = new TreeNode(3);
        List<Integer> n = new ArrayList<>();

        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.right = new TreeNode(7);
        root.right.left = new TreeNode(15);
        preOrder(q,n);
        System.out.println(isSameTree(p,q));
    }
}
