package leetcode.algorithms.tree;

import org.junit.Test;

public class SameTreeTest {
	@Test
	public void test(){
		System.out.println(new SameTree().isSameTree(TreeNode.createTree("1,2,2,3,null,null,3"), TreeNode.createTree("1,2,2,3,null,3,null")));
	}
}
