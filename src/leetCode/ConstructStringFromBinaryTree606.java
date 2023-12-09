package leetCode;

public class ConstructStringFromBinaryTree606 {
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

    String result = "";

    public String tree2str(TreeNode root) {
        //
        if (root == null) return "";
        result +=  String.valueOf(root.val);
        if (root.left == null && root.right == null)
            return result;

        result += ('(');
        tree2str(root.left);
        result += (')');

        if (root.right != null){
            result += ('(');
            tree2str(root.right);
            result += (')');
        }

        return result;
    }

    public static void main(String[] args) {
        ConstructStringFromBinaryTree606 c = new ConstructStringFromBinaryTree606();
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(-2);
        node.right = new TreeNode(3);
        node.left.left = new TreeNode(4);
        System.out.println(c.tree2str(node));
    }
}
