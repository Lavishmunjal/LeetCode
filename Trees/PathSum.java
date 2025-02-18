import javax.swing.tree.TreeNode;

public class PathSum {
    public boolean solve(TreeNode root,int sum ,int targetSum){
        if(root==null) return false;
        sum+=root.val;
        if(root.left==null && root.right==null) {
            if(sum==targetSum) return true;
            return false;
        }
        boolean leftSide = solve(root.left, sum, targetSum);
        boolean rightSide = solve(root.right, sum, targetSum);
        return leftSide || rightSide;

    }

    public boolean hasPathSum(TreeNode root, int targetSum) {
        int sum=0;
        boolean result =solve(root, sum, targetSum);
        return result;
    }
}
