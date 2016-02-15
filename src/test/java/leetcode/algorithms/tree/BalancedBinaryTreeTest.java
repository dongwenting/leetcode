package leetcode.algorithms.tree;

import org.junit.Test;

public class BalancedBinaryTreeTest {
	@Test
	public void test(){
		System.out.println(new BalancedBinaryTree().isBalanced(TreeNode.createTree("1,2,3,4,5,null,6,7")));
	}
}
