public class DelNodes {
    public TreeNode deleteHelper(TreeNode root, HashSet<Integer> set, List<TreeNode> ans){
        if(root==null) {
            return null;
        }
        root.left = deleteHelper(root.left, set, ans);
        root.right = deleteHelper(root.right, set, ans);
        if(set.contains(root.val)){
            if(root.left!=null) ans.add(root.left);
            if(root.right!=null) ans.add(root.right);

            return null;
        }else {
            return root;
        }
    }

    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        List<TreeNode> ans = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for(int i:to_delete) {
            set.add(i);
        }
        deleteHelper(root, set, ans);

        if(!set.contains(root.val)){
            ans.add(root);
        }
        
        return ans;
    }
}
