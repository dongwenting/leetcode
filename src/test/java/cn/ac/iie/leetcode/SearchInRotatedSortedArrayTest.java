package cn.ac.iie.leetcode;

import org.junit.Test;

public class SearchInSortedArrayTest {

	@Test
	public void test(){
//		int[] nums = {0, 1,2,3,4,5,6,7};
//		new SearchInSortedArray().binarySearch(nums, 0, 8, 1);
		int[] nums2 = {0, 1,3};
		new SearchInSortedArray().binarySearch(nums2, 0, 2, 2);
	}
	
	@Test
	public void testSearch(){
		int[] nums = {4, 5, 6, 7, 0, 1, 2};
		new SearchInSortedArray().search(nums,6);	
		int[] nums2 = { 0, 1, 2, 4, 5, 6, 7};
		new SearchInSortedArray().search(nums2, 6);
	}
	
	@Test
	public void testSearch2(){
		int[] nums = {4, 4, 5, 6, 6, 7, 0, 1, 1, 2};
		new SearchInSortedArray().search(nums,6);	
		int[] nums2 = { 0, 1, 2, 4, 4, 5, 5, 6, 7};
		new SearchInSortedArray().search(nums2, 4);
	}
}
