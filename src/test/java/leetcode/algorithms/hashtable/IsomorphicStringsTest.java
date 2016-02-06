package leetcode.algorithms.hashtable;

import org.junit.Test;

public class IsomorphicStringsTest {
	@Test
	public void test(){
		System.out.println(new IsomorphicStrings().isIsomorphic("ab", "aa"));
		System.out.println(new IsomorphicStrings().isIsomorphic("foo", "bar"));
		System.out.println(new IsomorphicStrings().isIsomorphic("paper", "title"));
	}
}
