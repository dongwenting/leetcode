package leetcode.algorithms.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeInorderTraversal {
	List<Integer> array = new ArrayList<Integer>();
	
    public List<Integer> inorderTraversal(TreeNode root) {
    	midTraversal(root);
        return array;
    }
    
    public void midTraversal(TreeNode node){
    	if(node == null){
    		return ;
    	}
    	Stack<TreeNode> stack = new Stack<TreeNode>();
    	while(node != null || !stack.isEmpty()){
    		while(node!=null){
    			stack.push(node);
    			node = node.left;
    		}
    		
    		TreeNode p = stack.pop();
    		array.add(p.val);
    		node = p.right;
    	}
    }
}
