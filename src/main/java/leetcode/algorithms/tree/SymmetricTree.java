package leetcode.algorithms.tree;

public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
    	if(root == null){
    		return true;
    	}
        return isSymmetric(root.left, root.right);
    }
 
    public boolean isSymmetric(TreeNode left, TreeNode right){
    	if(left == null && right == null){
    		return true;
    	}else if(left == null && right != null){
    		return false;
    	}else if(left != null && right == null){
    		return false;
    	}
    	
    	if(isSymmetric(left.left, right.right)){
    		if(isSymmetric(left.right, right.left)){
    			if(left.val == right.val){
    				return true;
    			}else{
    				return false;
    			}
    		}else{
    			return false;
    		}
    	}else{
    		return false;
    	}
    }
}