class Solution {
    public TreeNode increasingBST(TreeNode root) {
        TreeNode newRoot = new TreeNode();
        TreeNode trav = newRoot;
        ArrayList<Integer> inOrder = new ArrayList();
        getInorder(root, inOrder);
        
        for(int val : inOrder) {
            trav.right = new TreeNode(val);
            trav = trav.right;
        }
        
        return newRoot.right;
    }
    
    public void getInorder(TreeNode root, ArrayList<Integer> inOrder) {
        if(root == null) return;
        
        getInorder(root.left, inOrder);
        inOrder.add(root.val);
        getInorder(root.right, inOrder);
    }
}