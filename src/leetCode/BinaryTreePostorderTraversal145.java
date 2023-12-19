package leetCode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePostorderTraversal145 {
    List<Integer> result = new ArrayList<>();

    public List<Integer> postorderTraversal(TreeNode root) {
        //
        if (root == null) return new ArrayList<>();

        postorderTraversal(root.left);
        postorderTraversal(root.right);
        result.add(root.val);

        return result;
    }

    public static void main(String[] args) {
        BinaryTreePostorderTraversal145 b = new BinaryTreePostorderTraversal145();
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.right = new TreeNode(3);
        node.left.left = new TreeNode(4);
        List<Integer> integers = b.postorderTraversal(node);
        for (Integer item : integers)
            System.out.print(item + " ");


    }
}
