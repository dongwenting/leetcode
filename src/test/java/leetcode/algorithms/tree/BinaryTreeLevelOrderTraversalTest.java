package leetcode.algorithms.tree;

import java.util.List;

import org.junit.Test;

public class BinaryTreeLevelOrderTraversalTest {

	@Test
	public void test(){
		List<List<Integer>> list = new BinaryTreeLevelOrderTraversal().levelOrder(TreeNode.createTree("3,9,20,#,#,15,7"));
		for(List<Integer> str : list){
			for(Integer i: str){
				System.out.print(i+",");
			}
			System.out.println();
		}
	}
}
