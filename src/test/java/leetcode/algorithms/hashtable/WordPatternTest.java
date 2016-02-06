package leetcode.algorithms.hashtable;

import org.junit.Test;

public class WordPatternTest {

	@Test
	public void test(){
		System.out.println(new WordPattern().wordPattern("abba", "dog cat cat dog"));
		System.out.println(new WordPattern().wordPattern("abba", "dog cat cat fish"));
		System.out.println(new WordPattern().wordPattern("aaaa", "dog cat cat dog"));
		System.out.println(new WordPattern().wordPattern("abba", "dog dog dog dog"));

	}
}
