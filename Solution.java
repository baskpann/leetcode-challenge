class Solution {
    public int maxDepth(TreeNode root) {
        
        if(root == null) return 0;
        
        int lDepth = maxDepth(root.left);
        int rDepth = maxDepth(root.right);
        
        return (lDepth > rDepth) ? lDepth + 1 : rDepth + 1; 
        
        
    }
}
