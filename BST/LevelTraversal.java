import java.io.PrintStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelTraversal {
    public static List<List<Integer>> levelOrder(TreeNode root){
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> qu = new LinkedList<>();
        if (root == null){
            return res;
        }
            qu.add(root);
        while (!qu.isEmpty()) {
            List<Integer> level = new ArrayList<>();
            int len = qu.toArray().length;
            for (int i = 0; i < len; i++) {
                TreeNode temp = qu.poll();
                level.add(temp.val);
                if (temp.left != null) qu.add(temp.left);
                if (temp.right != null) qu.add(temp.right);

            }
            res.add(level);
        }
        return res;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.right = new TreeNode(7);
        root.right.left = new TreeNode(15);
        System.out.println("root.right: "+root.right);
        System.out.println(levelOrder(root));
    }
}
