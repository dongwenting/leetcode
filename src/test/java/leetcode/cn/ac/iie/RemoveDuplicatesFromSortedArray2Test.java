package leetcode.cn.ac.iie;


import org.junit.Assert;
import org.junit.Test;

public class RemoveDuplicatesFromSortedArray2Test {

	@Test
	public void test(){
		int[] nums = {1,1};
		Assert.assertEquals(new RemoveDuplicatesFromSortedArray2().removeDuplicates(nums), 2);
		
		int[] nums1 = {1};
		Assert.assertEquals(new RemoveDuplicatesFromSortedArray2().removeDuplicates(nums1), 1);
	}
}
