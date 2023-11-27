package leetCode;

public class MaximumDepthOfBinaryTree104 {

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

    public int maxDepth(TreeNode root) {
        //
        if (root == null)
            return 0;
        else {
            int lDepth = maxDepth(root.left);
            int rDepth = maxDepth(root.right);
            if (lDepth>rDepth)
                return (lDepth+1);
            else return (rDepth+1);
        }
    }

    public static void main(String[] args) {
        TreeNode n = new TreeNode(1);
        n.left = new TreeNode(2);
        n.right = new TreeNode(3);
        n.left.left = new TreeNode(4);
        n.left.right = new TreeNode(5);

        MaximumDepthOfBinaryTree104 m = new MaximumDepthOfBinaryTree104();
        System.out.println(m.maxDepth(n));
    }
}
