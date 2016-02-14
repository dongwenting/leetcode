package leetcode.algorithms.tree;

public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null){
        	return true;
        }else if(p != null && q == null){
        	return false;
        }else if(p == null && q != null){
        	return false;
        }
        
        if(isSameTree(p.left, q.left)){
        	if(isSameTree(p.right, q.right)){
        		if(p.val == q.val){
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
