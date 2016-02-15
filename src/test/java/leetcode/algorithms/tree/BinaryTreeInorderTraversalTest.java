package leetcode.algorithms.tree;

import java.util.List;

import org.junit.Test;

public class BinaryTreeInorderTraversalTest {
	@Test
	public void test(){
		List<Integer> list = new BinaryTreeInorderTraversal().inorderTraversal(TreeNode.createTree("3,9,20,#,#,15,7"));
		for(Integer str : list){
			System.out.print(str+ " ");
		}
	}
}
