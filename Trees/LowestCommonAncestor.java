import javax.swing.tree.TreeNode;

public class LowestCommonAncestor {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null) {
            return null;
        }
        if(root==p || root==q) return root;
        TreeNode leftN = lowestCommonAncestor(root.left, p, q);
        TreeNode rightN = lowestCommonAncestor(root.right, p, q);

        if(leftN!=null && rightN!=null) {
            return root;
        }
        if(leftN!=null) {
            return leftN;
        }
        return rightN;
    }
}
