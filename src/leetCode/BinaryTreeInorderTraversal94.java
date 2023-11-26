package leetCode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal94 {
    List<Integer> integers = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        //
        if (root == null)
            return new ArrayList<>();

        inorderTraversal(root.left);
        integers.add(root.val);
        inorderTraversal(root.right);
        return integers;
    }

    public static void main(String[] args) {
        TreeNode node = new TreeNode(1);
        node.right = new TreeNode(2);
        node.right.left = new TreeNode(3);

        BinaryTreeInorderTraversal94 b = new BinaryTreeInorderTraversal94();
        List<Integer> integers = b.inorderTraversal(node);
        System.out.println(integers.stream().toList());

    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

}

