package leetcode.algorithms.tree;

import java.util.ArrayList;
import java.util.Stack;

public class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
	
	public static void preTraverse(TreeNode node){
		if(node == null) { return ; }
		System.out.print(node.val + " ");
		preTraverse(node.left);
		preTraverse(node.right);
	}

	public static void midTraverse(TreeNode node){
		if(node == null) { return ; }
		midTraverse(node.left);
		System.out.print(node.val + " ");
		midTraverse(node.right);
	}
	
	public static void postTraverse(TreeNode node){
		if(node == null) { return ; }
		postTraverse(node.left);
		postTraverse(node.right);
		System.out.print(node.val + " ");
	}
	
	public static void preTraverse2(TreeNode node){
		Stack<TreeNode> stack = new Stack<TreeNode>();
		TreeNode p = node;
		while(p !=null || !stack.isEmpty()){
			while(p!=null){
				System.out.print(p.val + " ");
				stack.push(p);
				p = p.left;
			}
			if(!stack.isEmpty()){
				p = stack.pop();
				p = p.right;
			}
		}
	}
	
	public static void midTraverse2(TreeNode node){
		Stack<TreeNode> stack = new Stack<TreeNode>();
		TreeNode p = node;
		while(p !=null || !stack.isEmpty()){
			while(p!=null){
				stack.push(p);
				p = p.left;
			}
			if(!stack.isEmpty()){
				p = stack.pop();
				System.out.print(p.val + " ");
				p = p.right;
			}
		}
	}
	
	public static TreeNode createTree(String str){
		String[] strs = str.split(",");
		ArrayList<TreeNode> list = new ArrayList<TreeNode>();
		TreeNode root = createTreeNode(strs[0]);
		list.add(root);
		int index = 1;
		while(!list.isEmpty()){
			TreeNode tmp = list.remove(0);
			if(tmp == null){
				continue;
			}
			TreeNode left = createTreeNode(strs[index]);
			tmp.left = left;
			list.add(left);
			index++;
			if(index == strs.length){
				break;
			}
			TreeNode right = createTreeNode(strs[index]);
			tmp.right = right;
			list.add(right);
			index++;
			if(index == strs.length){
				break;
			}
		}
		return root;
	}
	
	private static TreeNode createTreeNode(String val){
		if(val.equals("null")){
			return null;
		}else{
			return new TreeNode(Integer.parseInt(val));
		}
	}
}
