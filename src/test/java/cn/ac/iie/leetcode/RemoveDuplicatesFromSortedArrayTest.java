package cn.ac.iie.leetcode;


import org.junit.Assert;
import org.junit.Test;

import cn.ac.iie.leetcode.RemoveDuplicatesFromSortedArray;

public class RemoveDuplicatesFromSortedArrayTest {

	@Test
	public void test(){
		int[] nums = {1,1,2,2,2,3};
		Assert.assertEquals(new RemoveDuplicatesFromSortedArray().removeDuplicates(nums), 3);
		
		int[] nums1 = {1};
		Assert.assertEquals(new RemoveDuplicatesFromSortedArray().removeDuplicates(nums1), 1);
	}
}
