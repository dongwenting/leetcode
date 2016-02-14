package leetcode.algorithms.tree;

public class MinimumDepthOfBinaryTree {
	int depth = Integer.MAX_VALUE;
	
    public int minDepth(TreeNode root) {
    	if(root == null){
    		return 0;
    	}
    	int high = 1;
    	findDepth(root, high);
        return depth;
    }
    
    public void findDepth(TreeNode root, int high){
    	if(root == null){
    		return ;
    	}else if(root.left == null && root.right == null){
    		if(high < depth){
    			depth = high;
    			return ;
    		}
    	}
    	findDepth(root.left, high+1);
     	findDepth(root.right, high+1);
        
    }
}
