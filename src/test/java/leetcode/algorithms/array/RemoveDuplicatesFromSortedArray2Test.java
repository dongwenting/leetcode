package leetcode.algorithms.array;


import leetcode.algorithms.array.RemoveDuplicatesFromSortedArray2;

import org.junit.Assert;
import org.junit.Test;

public class RemoveDuplicatesFromSortedArray2Test {

	@Test
	public void test(){
		int[] nums = {1,1,1,1,3,3};
		Assert.assertEquals(new RemoveDuplicatesFromSortedArray2().removeDuplicates(nums), 4);
		
		int[] nums1 = {1,1};
		Assert.assertEquals(new RemoveDuplicatesFromSortedArray2().removeDuplicates(nums1), 2);
	}
}
