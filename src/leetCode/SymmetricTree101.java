package leetCode;

public class SymmetricTree101 {
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

    public boolean isSymmetric(TreeNode root) {
        //
        return isMirror(root, root);
    }

    private boolean isMirror(TreeNode n1, TreeNode n2) {
        //
        if (n1 == null && n2 ==null)
            return true;

        if (n1 != null && n2 != null && n1.val == n2.val)
            return (isMirror(n1.left, n2.right)
                    && isMirror(n1.right, n2.left));
        return false;
    }

    public static void main(String[] args) {
        TreeNode n = new TreeNode(1);
        n.left = new TreeNode(2);
        n.right = new TreeNode(2);
        n.left.left = new TreeNode(3);
        n.left.right = new TreeNode(4);
        n.right.left = new TreeNode(4);
        n.right.right = new TreeNode(3);
        SymmetricTree101 s = new SymmetricTree101();
        System.out.println(s.isSymmetric(n));

    }
}
