package leetcode.algorithms.tree;

import org.junit.Test;

public class InvertBinaryTreeTest {
	
	@Test
	public void test(){
		TreeNode.preTraverse(new InvertBinaryTree().invertTree(TreeNode.createTree("1,2,3,3,null,null,null")));
	}
}
