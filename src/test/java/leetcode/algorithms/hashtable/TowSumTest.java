package leetcode.algorithms.hashtable;

import org.junit.Test;

public class TowSumTest {
	
	@Test
	public void test(){
		int[] ret = new TowSum().twoSum(new int[]{0, 3, 4, 0}, 0);
		System.out.println(ret[0] +" " + ret[1]);
	}
}
