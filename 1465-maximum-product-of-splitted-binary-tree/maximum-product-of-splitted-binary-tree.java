class Solution {

    long maxProduct = 0;
    long totalSum = 0;
    int mod = (int)1e9 + 7;

    public int maxProduct(TreeNode root) {
        // 1️⃣ Get total sum of tree
        totalSum = getSum(root);

        // 2️⃣ Try splitting at every node
        getSubtreeSum(root);

        return (int)(maxProduct % mod);
    }

    // First DFS: compute total sum
    private long getSum(TreeNode root) {
        if (root == null) return 0;
        return root.val + getSum(root.left) + getSum(root.right);
    }

    // Second DFS: compute subtree sum and product
    private long getSubtreeSum(TreeNode root) {
        if (root == null) return 0;

        long left = getSubtreeSum(root.left);
        long right = getSubtreeSum(root.right);

        long subSum = root.val + left + right;

        long product = subSum * (totalSum - subSum);
        maxProduct = Math.max(maxProduct, product);

        return subSum;
    }
}
