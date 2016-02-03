package cn.ac.iie.leetcode;

import org.junit.Test;

public class RotateArrayTest {

	@Test
	public void test(){
		int[] nums = {0, 1,2,3,4,5,6,7};
		new SearchInRotatedSortedArray().binarySearch(nums, 0, 8, 1);
	}
}
