package leetCode;

public class DiameterOfBinaryTree543 {
    int diameter = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        //
        if (root == null) return 0;
        diameterOfBinaryTree(root.left);
        diameter++;
        diameterOfBinaryTree(root.right);
        diameter = Math.max(diameter, 0);
        return diameter;
    }

    public static void main(String[] args) {

        DiameterOfBinaryTree543 d = new DiameterOfBinaryTree543();
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.right = new TreeNode(3);
        node.left.left = new TreeNode(4);
        node.left.right = new TreeNode(5);
        System.out.println(d.diameterOfBinaryTree(node));//3
    }
}
