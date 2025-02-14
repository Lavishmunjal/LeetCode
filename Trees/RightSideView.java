class RightSideView {

    public void preorder(TreeNode root, int level, List<Integer> ans) {
        if (root == null) {
            return;
        }

       
        if (ans.size() < level) {
            ans.add(root.val);
        }


        preorder(root.right, level + 1, ans);
        preorder(root.left, level + 1, ans);
    }
    
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        preorder(root, 1, ans);
        return ans;
    }
}