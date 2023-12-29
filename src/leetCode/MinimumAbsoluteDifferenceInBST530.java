package leetCode;

import java.util.ArrayList;
import java.util.List;

public class MinimumAbsoluteDifferenceInBST530 {
    int ans = Integer.MAX_VALUE;
    TreeNode prevNode;
    List<Integer> numbers = new ArrayList<>();

    public int getMinimumDifference(TreeNode root) {
        inorderTraversal(root);

//        if (root == null) return 0;
//        preOrderTraversal(root);
        /*if (root == null) return 0;
        getMinimumDifference(root.left);
        numbers.add(root.val);
        getMinimumDifference(root.right);

        Collections.sort(numbers);
        for (int i = 0; i < numbers.size() - 1; i++)
            ans = Math.min((numbers.get(i + 1) - numbers.get(i)), ans);*/

        return ans;
    }

    private void inorderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        inorderTraversal(root.left);
        if (prevNode != null) {
            ans = Math.min(ans, root.val - prevNode.val);
        }
        prevNode = root;
        inorderTraversal(root.right);
    }


    /*public void preOrderTraversal(TreeNode root) {
        if (root == null) return;
        if (root.left != null) {
            ans = Math.min(root.val - root.left.val, ans);
            preOrderTraversal(root.left);
        }

        if (root.right != null) {
            ans = Math.min(root.right.val - root.val, ans);
            preOrderTraversal(root.right);
        }
    }*/

    public static void main(String[] args) {
        MinimumAbsoluteDifferenceInBST530 m = new MinimumAbsoluteDifferenceInBST530();
        //,,,null,,null,911
        TreeNode node = new TreeNode(236);
        node.left = new TreeNode(104);
        node.right = new TreeNode(701);
//        node.left.left = new TreeNode();
        node.left.right = new TreeNode(227);
        node.right.right = new TreeNode(911);
        System.out.println(m.getMinimumDifference(node));
    }
}
