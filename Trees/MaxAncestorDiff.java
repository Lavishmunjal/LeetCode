import javax.swing.tree.TreeNode;

public class MaxAncestorDiff {
    int maxDiff=-1;

    public void findMaxUtil(TreeNode root, TreeNode child) {
        if (root == null || child == null) {
            return;
        }

        maxDiff = Math.max(maxDiff, Math.abs(root.val - child.val));

        findMaxUtil(root, child.left);
        findMaxUtil(root, child.right);
    }

    public void findMaxDiff(TreeNode root) {
        if (root == null || (root.left == null && root.right == null)) {
            return;
        }

        findMaxUtil(root, root.left);
        findMaxUtil(root, root.right);

        findMaxDiff(root.left);
        findMaxDiff(root.right);
    }

    public int maxAncestorDiff(TreeNode root) {
        maxDiff = Integer.MIN_VALUE;

        findMaxDiff(root);

        return maxDiff;
    }
}
