import javax.swing.tree.TreeNode;

public class BuildTree {
    private int idx = 0; // Global index tracker for preorder array

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return solve(preorder, inorder, 0, inorder.length - 1);
    }

    private TreeNode solve(int[] preorder, int[] inorder, int start, int end) {
        if (start > end) {
            return null;
        }

        int rootVal = preorder[idx++];
        TreeNode root = new TreeNode(rootVal);

        // Find the root index in inorder
        int i = start;
        while (i <= end && inorder[i] != rootVal) {
            i++;
        }

        // Recursively build left and right subtrees
        root.left = solve(preorder, inorder, start, i - 1);
        root.right = solve(preorder, inorder, i + 1, end);

        return root;
    }
}
