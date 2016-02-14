package leetcode.algorithms.tree;

import org.junit.Test;

public class PathSumTest {
	@Test
	public void test(){
		System.out.println(new PathSum().hasPathSum(TreeNode.createTree("-2,null,-3"), -5));
	}
}
