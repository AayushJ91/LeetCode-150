//Problem: give the average of each level
//link: https://leetcode.com/problems/average-of-levels-in-binary-tree/?envType=study-plan-v2&envId=top-interview-150
//Source: LeetCode(637)
//Topics: Binary Search Tree
//Diff: - Easy - done

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelAvg {
    public static List<Double> averageOfLevels(TreeNode root) {
        //TIme: done
        //Space: done
        List<Double> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        Queue<TreeNode> qu = new LinkedList<>();
        qu.add(root);
        while (!qu.isEmpty()) {
            double sum = 0;
            int len = qu.toArray().length;
            System.out.println(qu);
            for (int i = 0; i < len; i++) {
                TreeNode curr = qu.poll();
                assert curr != null;
                sum += curr.val;
                System.out.println(sum);
                if (curr.left != null) qu.add(curr.left);
                if (curr.right != null) qu.add(curr.right);
            }
            res.add(sum/len);
            System.out.println(res);
            System.out.println();
        }
        return res;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
//        root.right = new TreeNode(20);
//        root.left.left = new TreeNode(5);
//        root.left.right = new TreeNode(8);
//        root.right.right = new TreeNode(7);
//        root.right.left = new TreeNode(15);
        System.out.println(averageOfLevels(root));
    }
}
