import javax.swing.tree.TreeNode;

public class IsCompleteTree {
    public int countNodes(TreeNode root) {
        if(root==null) return 0;

        return 1 + countNodes(root.left) + countNodes(root.right);
    }

    public boolean dfs(TreeNode root, int index, int total) {
        if(root==null) {
            return true;
        }
        if(index>total) {
            return false;
        }
        return dfs(root.left, 2*index, total) && dfs(root.right, 2*index+1, total);
    }
    public boolean isCompleteTree(TreeNode root) {
        int totalNodes = countNodes(root);
        int i=1;
        return dfs(root, i, totalNodes);
    }
}
