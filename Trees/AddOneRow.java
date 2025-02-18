class AddOneRow {
    public static void solve(TreeNode root,int val,int depth,int d)
    {
        if(root==null) return;
        if(d==depth-1)
        {
            TreeNode leftNode=new TreeNode(val);
            leftNode.left=root.left;
            root.left=leftNode;

            TreeNode rightNode=new TreeNode(val);
            rightNode.right=root.right;
            root.right=rightNode;
            return;
        }

        solve(root.left,val,depth,d+1);
        solve(root.right,val,depth,d+1);
    }
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(depth==1)
        {
            TreeNode node=new TreeNode(val);
            node.left=root;

            return node;
        }
        solve(root,val,depth,1);
        return root;
    }
}