package leetcode.algorithms.tree;

import org.junit.Test;

public class MinimumDepthOfBinaryTreeTest {
	@Test
	public void test(){
		System.out.println(new MinimumDepthOfBinaryTree().minDepth(TreeNode.createTree("1,2,3,3,null,null,null")));
	}
}
