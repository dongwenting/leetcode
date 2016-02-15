package leetcode.algorithms.tree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {
	List<String> list = new ArrayList<String>();
	
    public List<String> binaryTreePaths(TreeNode root) {
    	if(root == null){
    		return list;
    	}
    	preTraverse(root, root.val+"");
    	return list;
    }
    
    public void preTraverse(TreeNode node, String path){
    	if(node.left == null && node.right == null) list.add(path);
    	if(node.left != null) preTraverse(node.left, path+"->" + node.left.val);
    	if(node.right != null) preTraverse(node.right, path+"->" + node.right.val);
    }
}
