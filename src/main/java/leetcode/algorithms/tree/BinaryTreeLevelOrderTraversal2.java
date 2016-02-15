package leetcode.algorithms.tree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeLevelOrderTraversal2 {
	List<List<Integer>> array = new ArrayList<List<Integer>>();
	
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
    	if(root == null){
    		return array;
    	}
    	int high = 0;
    	levelOrder(root, high);
    	List<List<Integer>> ret = new ArrayList<List<Integer>>();
    	for(int i=array.size()-1; i>=0; i--){
    		ret.add(array.get(i));
    	}
        return ret;
    }
    
    public void levelOrder(TreeNode node, int high){
    	if(node == null){
    		return ;
    	}else{
    		
    		if(high>=array.size()){
    			List<Integer> list = new ArrayList<Integer>();
    			list.add(node.val);
    			array.add(list);
    		}else{
    			List<Integer> list = array.get(high);
    			list.add(node.val);
    		}
    	}
    	
    	levelOrder(node.left, high+1);
    	levelOrder(node.right, high+1);
    }
}
