package leetCode;

public class SecondMinimumNodeInBinaryTree671 {
    TreeNode prev;

    public int findSecondMinimumValue(TreeNode root) {
        //
        if (root == null) {
            return -1;
        }
        if (root.left == null && root.right == null) {
            return -1;
        }

        int left = root.left.val;
        int right = root.right.val;

        // if value same as root value, need to find the next candidate
        if (root.left.val == root.val) {
            left = findSecondMinimumValue(root.left);
        }
        if (root.right.val == root.val) {
            right = findSecondMinimumValue(root.right);
        }

        if (left != -1 && right != -1) {
            return Math.min(left, right);
        } else if (left != -1) {
            return left;
        } else {
            return right;
        }
    }

    public static void main(String[] args) {
        SecondMinimumNodeInBinaryTree671 s = new SecondMinimumNodeInBinaryTree671();
        TreeNode node = new TreeNode(2);
        node.left = new TreeNode(2);
        node.right = new TreeNode(5);
        node.right.left = new TreeNode(5);
        node.right.right = new TreeNode(7);
        System.out.println(s.findSecondMinimumValue(node)); //5
    }
}
