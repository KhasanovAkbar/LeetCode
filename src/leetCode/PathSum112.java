package leetCode;

public class PathSum112 {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        //
        if (root == null) return false;
        boolean answer = false;
        int sum = targetSum - root.val;
        if (sum == 0 && root.left == null && root.right == null)
            return (answer = true);
        if (root.left != null)
            answer = answer || hasPathSum(root.left, sum);
        if (root.right !=null)
            answer = answer || hasPathSum(root.right, sum);

        return answer;
    }

    public static void main(String[] args) {
        PathSum112 p = new PathSum112();
        TreeNode node = new TreeNode(10);
        node.left = new TreeNode(8);
        node.right = new TreeNode(2);
        node.left.left = new TreeNode(3);
        node.left.right = new TreeNode(5);
        node.right.left = new TreeNode(2);
        System.out.println(p.hasPathSum(node, 14));
    }
}
