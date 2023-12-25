package leetCode;

public class DiameterOfBinaryTree543 {


    public int diameterOfBinaryTree(TreeNode root) {
        //
        int[] diameter = new int[1];
        height(root, diameter);
        return diameter[0];
    }

    private int height(TreeNode node, int[] diameter) {
        if (node == null) {
            return 0;
        }
        int lh = height(node.left, diameter);
        int rh = height(node.right, diameter);
        diameter[0] = Math.max(diameter[0], lh + rh);
        return 1 + Math.max(lh, rh);
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
