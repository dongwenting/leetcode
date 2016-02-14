package leetcode.algorithms.tree;

public class MaximumDepthOfBinaryTree {
	int depth = 0;
	
    public int maxDepth(TreeNode root) {
    	int high = 1;
    	findDepth(root, high);
        return depth;
    }
    
    public void findDepth(TreeNode root, int high){
    	if(root == null){
    		return ;
    	}else if(root.left == null && root.right == null){
    		if(high > depth){
    			depth = high;
    			return ;
    		}
    	}
    	findDepth(root.left, high+1);
     	findDepth(root.right, high+1);
    }
}
