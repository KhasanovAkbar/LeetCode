package leetCode;

public class SameTree100 {
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

    public boolean isSameTree(TreeNode p, TreeNode q) {
        //
        if (p == null && q == null)
            return true;
        if (p != null && q != null)
            return (p.val == q.val
                    && isSameTree(p.left, q.left)
                    && isSameTree(p.right, q.right));
        return false;
    }

    public static void main(String[] args) {
        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);
        p.right = new TreeNode(1);

        TreeNode q = new TreeNode(1);
        q.left = new TreeNode(1);
        q.right = new TreeNode(2);

        SameTree100 s = new SameTree100();
        System.out.println(s.isSameTree(p, q));

    }
}
