package cn.ac.iie.leetcode;

/**
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 *
 */
public class RemoveDuplicatesFromSortedArray {

	public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0){
        	return 0;
        }
        int index = 0;
        for(int i=1; i<nums.length; i++){
        	if(nums[index] != nums[i]){
        		nums[++index] = nums[i];
        	}
        }
        return index + 1;
    }
	
}
