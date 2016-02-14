package leetcode.algorithms.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreePaths {
    public List<String> binaryTreePaths(TreeNode root) {
    	List<String> list = new ArrayList<String>();
    	preTraverse(root, list);
    	return list;
    }
    
    public void preTraverse(TreeNode node, List<String> list){
    	Stack<TreeNode> stack = new Stack<TreeNode>();
    	while(node != null || !stack.isEmpty()){
    		while(node!=null){
    			stack.push(node);
    			node = node.left;
    		}
    		
    		if(!stack.isEmpty()){
    			TreeNode p = stack.peek();
    			if(p != null && p.left == null && p.right == null){
    				String str = "";
    				for(int i=0; i<stack.size(); i++){
    					TreeNode tmp = stack.get(i);
    					if(tmp != null){
    						if(i == 0){
    							str += tmp.val;
    						}else{
    							str += "->" + tmp.val;
    						}
    					}
    				}
    				list.add(str);
    			}
    			stack.pop();
    			node = p.right;
    		}
    	}
    }
}
