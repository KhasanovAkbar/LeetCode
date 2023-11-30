package leetCode;

public class ConvertSortedArrayToBinarySearchTree108 {
    public class TreeNode {
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

    public TreeNode sortedArrayToBST(int[] nums) {
        //
        return sortedArray(nums, 0, nums.length - 1);
    }

    private TreeNode sortedArray(int[] nums, int start, int end) {
        //
        if (start > end)
            return null;
        int mid = (start + end) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = sortedArray(nums, start, mid - 1);
        node.right = sortedArray(nums, mid + 1, end);

        return node;
    }

    public static void main(String[] args) {
        //
        int[] arr = {-10,-3,0,5,9};
        ConvertSortedArrayToBinarySearchTree108 c = new ConvertSortedArrayToBinarySearchTree108();
        TreeNode node = c.sortedArrayToBST(arr);
    }
}
