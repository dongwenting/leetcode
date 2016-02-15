package leetcode.algorithms.tree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeLevelOrderTraversal {
	List<List<Integer>> array = new ArrayList<List<Integer>>();
	
    public List<List<Integer>> levelOrder(TreeNode root) {
    	if(root == null){
    		return array;
    	}
    	int high = 0;
    	levelOrder(root, high);
        return array;
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
