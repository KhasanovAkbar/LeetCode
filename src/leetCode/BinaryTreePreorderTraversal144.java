package leetCode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePreorderTraversal144 {
    List<Integer> result = new ArrayList<>();

    public List<Integer> preorderTraversal(TreeNode root) {
        //
        if (root == null) return new ArrayList<>();
        result.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);

        return result;
    }

    public static void main(String[] args) {
        BinaryTreePreorderTraversal144 b = new BinaryTreePreorderTraversal144();
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.right = new TreeNode(3);
        node.left.left = new TreeNode(4);
        List<Integer> integers = b.preorderTraversal(node);
        for (Integer item : integers)
            System.out.print(item + " ");

    }
}
