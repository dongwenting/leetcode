package leetcode.algorithms.array;

/**
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/
 *
 */
public class RemoveDuplicatesFromSortedArray2 {

	public int removeDuplicates(int[] nums) {
	  if(nums == null){
	  	return 0;
	  }
	  if(nums.length <= 2){
		  return nums.length;
	  }
	  int index = 2;
	  
	  for(int i=2; i<nums.length; i++){
		  if(nums[index - 2] != nums[i]){
			  nums[index++] = nums[i];
		  }
	  }

	  return index;   
	}
}
