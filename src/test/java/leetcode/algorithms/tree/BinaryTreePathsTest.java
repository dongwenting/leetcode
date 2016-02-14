package leetcode.algorithms.tree;

import java.util.List;

import org.junit.Test;

public class BinaryTreePathsTest {

	@Test
	public void test(){
		List<String> list = new BinaryTreePaths().binaryTreePaths(TreeNode.createTree("1,2,3"));
		for(String str : list){
			System.out.println(str);
		}
	}
}
