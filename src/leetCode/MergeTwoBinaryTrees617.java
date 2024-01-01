package leetCode;

public class MergeTwoBinaryTrees617 {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        //
       if (root1 == null) return root2;
       if (root2 ==null) return root1;
       root1.val += root2.val;
        root1.left = mergeTrees(root1.left, root2.left);
        root1.right = mergeTrees(root1.right, root2.right);

        return root1;
    }

    static void inorder(TreeNode node)
    {
        if (node == null)
            return;

        /* first recur on left child */
        inorder(node.left);

        /* then print the data of node */
        System.out.printf("%d ", node.val);

        /* now recur on right child */
        inorder(node.right);
    }

    public static void main(String[] args) {
        MergeTwoBinaryTrees617 m = new MergeTwoBinaryTrees617();
        TreeNode node1 = new TreeNode(1);
        node1.left = new TreeNode(3);
        node1.right = new TreeNode(2);
        node1.left.left = new TreeNode(5);

        TreeNode node2 = new TreeNode(2);
        node2.left = new TreeNode(1);
        node2.right = new TreeNode(3);
        node2.left.right = new TreeNode(4);
        node2.right.right = new TreeNode(7);
        TreeNode treeNode = m.mergeTrees(node1, node2);

        inorder(treeNode);


    }

}
