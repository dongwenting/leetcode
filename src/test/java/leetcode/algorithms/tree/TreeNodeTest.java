package leetcode.algorithms.tree;

import org.junit.Test;

public class TreeNodeTest {

	@Test
	public void test(){
		TreeNode.preTraverse2(TreeNode.createTree("1,2,3,3,null,2,null"));
	}
}
