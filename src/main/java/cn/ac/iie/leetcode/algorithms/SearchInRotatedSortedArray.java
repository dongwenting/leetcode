package cn.ac.iie.leetcode.algorithms;

/**
 * https://leetcode.com/problems/search-in-rotated-sorted-array/
 *
 */
public class SearchInRotatedSortedArray {
	
	public int search(int[] nums, int key) {
		if(nums == null || nums.length == 0){
			return -1;
		}
		int pos;
		for(pos = 0; pos< nums.length -1; pos++){
			if(nums[pos] > nums[pos+1]){
				break;
			}
		}
		int index = -1;
		if(key >= nums[0]){
			index = binarySearch(nums, 0, pos, key);
		}else{
			index = binarySearch(nums, pos+1, nums.length -1, key);
		}
		
		return index;
	}
	
	public int binarySearch(int[] nums, int begin, int end, int key){
		int i = begin, j = end;
		while(i <= j){
			int half = (i + j)/2;
			if(key < nums[half] ){
				j=half-1;  
			}else if(key > nums[half]){
				i=half+1;  
			}else{
				return half;
			}
		}
		return -1;
	}
}
