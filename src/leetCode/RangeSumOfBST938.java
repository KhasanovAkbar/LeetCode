package leetCode;

public class RangeSumOfBST938 {

    public int rangeSumBST(TreeNode root, int low, int high) {
        //
        if (root == null) return 0;

        int current = (root.val >= low && root.val <= high) ? root.val : 0;
        int leftSum = rangeSumBST(root.left, low, high);
        int rightSum = rangeSumBST(root.right, low, high);
        return current + leftSum + rightSum;
    }

    public static void main(String[] args) {
        RangeSumOfBST938 r = new RangeSumOfBST938();
    }
}
