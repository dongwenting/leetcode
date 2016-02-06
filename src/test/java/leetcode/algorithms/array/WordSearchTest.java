package leetcode.algorithms.array;

import org.junit.Test;

public class WordSearchTest {

	@Test
	public void test(){
		char[][] a = {{'A','B','C','E'}, {'S','F','C','S'},{'A','D','E','E'}};
		System.out.println(new WordSearch().exist(a, "ABCB"));
	}
}
