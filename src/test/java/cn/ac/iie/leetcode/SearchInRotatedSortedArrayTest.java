package cn.ac.iie.leetcode;

import org.junit.Test;

public class SearchInRotatedSortedArrayTest {

	@Test
	public void test(){
		new SearchInRotatedSortedArray().binarySearch(new int[]{0,1,2,3,4,5,6,7}, 0, 8, 1);
		new SearchInRotatedSortedArray().binarySearch(new int[]{0,1,3}, 0, 2, 2);
	}
	
	@Test
	public void testSearch(){
		new SearchInRotatedSortedArray().search(new int[]{4, 5, 6, 7, 0, 1, 2},6);	
		new SearchInRotatedSortedArray().search(new int[]{0, 1, 2, 4, 5, 6, 7}, 6);
	}
	
	@Test
	public void testSearch2(){
		new SearchInRotatedSortedArray().search(new int[]{4, 4, 5, 6, 6, 7, 0, 1, 1, 2},6);	
		new SearchInRotatedSortedArray().search(new int[]{0, 1, 2, 4, 4, 5, 5, 6, 7}, 4);
	}
}
