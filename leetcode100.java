class Solution {
    boolean answer=true;
    public boolean isSameTree(TreeNode p, TreeNode q) {
        helper(p,q);
        return answer;
    }
    private void helper(TreeNode p,TreeNode q){
        if(p==null && q==null){
            return;
        }
        if(p==null||q==null){
            answer=false;
            return;
        }
        if(p.val!=q.val){
            answer=false;
            return;
        }       
        helper(p.left,q.left);
        helper(p.right,q.right);
    }
}
