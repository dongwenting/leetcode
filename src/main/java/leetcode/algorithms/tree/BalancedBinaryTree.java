package leetcode.algorithms.tree;

public class BalancedBinaryTree {
	boolean flag = true;
    public boolean isBalanced(TreeNode root) {
        if(root == null){
        	return true;
        }
    	int left = 0;
    	if(root.left != null){
    		left = deepSearch(root.left, 1);
    	}
        int right = 0;
        if(root.right != null){
        	right = deepSearch(root.right,1);
        }
        if(flag && Math.abs(left - right)>1){
        	return false;
        }
        return flag;
    }
    
    public int deepSearch(TreeNode node, int high){
    	if(node.left == null && node.right == null){
    		return high;
    	}
    	if(!flag){
    		return high;
    	}
    	int left = high;
    	if(node.left != null){
    		left = deepSearch(node.left, high+1);
    	}
        int right = high;
        if(node.right != null){
        	right = deepSearch(node.right, high+1);
        }
        
        if(Math.abs(left - right)>1){
        	flag = false;
        }
    	return left>right?left:right;
    }
}
