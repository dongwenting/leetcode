package cn.ac.iie.leetcode;

public class RemoveDuplicatesFromSortedArray2 {

	public int removeDuplicates(int[] nums) {
	  if(nums == null || nums.length == 0){
	  	return 0;
	  }
	  int index = 0, flag = 0;
	  for(int i=1; i<nums.length; i++){
		  if(nums[index] == nums[i]){
			  flag++;
			  if(i == nums.length - 1){
				  nums[++index] = nums[i];
			  }
		  }else{
			  if(flag > 0){
				 flag = 0;
				 index += 1;
			  }
			  nums[++index] = nums[i];
		  }
	  }

	  return index + 1;   
	}
}
