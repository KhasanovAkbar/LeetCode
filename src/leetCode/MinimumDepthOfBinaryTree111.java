package leetCode;

public class MinimumDepthOfBinaryTree111 {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(Object o, TreeNode treeNode) {
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

    public int minDepth(TreeNode root) {
        //
        if (root == null) return 0;

        if (root.left == null)
            return 1 + minDepth(root.right);
        if (root.right == null)
            return 1 + minDepth(root.left);
        return 1 + Math.min(minDepth(root.left), minDepth(root.right));
    }

    public static void main(String[] args) {
        MinimumDepthOfBinaryTree111 m = new MinimumDepthOfBinaryTree111();
        TreeNode node = new TreeNode(2, new TreeNode(null, new TreeNode(3, new TreeNode(null, new TreeNode(4)))));

        System.out.println(m.minDepth(node));
    }
}
