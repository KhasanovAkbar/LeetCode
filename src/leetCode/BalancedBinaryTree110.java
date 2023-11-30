package leetCode;

public class BalancedBinaryTree110 {
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

    public boolean isBalanced(TreeNode root) {
        //
        if (root == null) {
            return true; // An empty tree is balanced by definition
        }

        return isBalancedHelper(root) != -1;
    }

    private int isBalancedHelper(TreeNode node) {
        if (node == null) {
            return 0; // Height of an empty tree is 0
        }

        int leftHeight = isBalancedHelper(node.left);
        int rightHeight = isBalancedHelper(node.right);

        // If any subtree is unbalanced, propagate the unbalanced status
        if (leftHeight == -1 || rightHeight == -1 || Math.abs(leftHeight - rightHeight) > 1) {
            return -1;
        }

        // Return the height of the current subtree
        return 1 + Math.max(leftHeight, rightHeight);
    }


    public static void main(String[] args) {

        TreeNode tree = new TreeNode(3);
        tree.left = new TreeNode(9);
        tree.right = new TreeNode(20);
        tree.right.left = new TreeNode(15);
        tree.right.right = new TreeNode(7);

        BalancedBinaryTree110 b = new BalancedBinaryTree110();


        if (b.isBalanced(tree))
            System.out.println("Tree is balanced");
        else
            System.out.println("Tree is not balanced");
    }

}
