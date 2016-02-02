package leetcode.cn.ac.iie;

public class RemoveDuplicatesFromSortedArray2 {

//	public int removeDuplicates(int[] nums) {
//        if(nums == null || nums.length == 0){
//        	return 0;
//        }
//        int index = 0;
//        boolean flag = false;
//        for(int i=1; i<nums.length; i++){
//        	if(nums[index] == nums[i]){
//        		if(!flag){
//        			index++;
//        			flag = true;
//        		}        		
//        	}else{
//        		flag = false;
//        		nums[++index] = nums[i];
//        	}
//        }
//        return index + 1;
//    }
	
	public int removeDuplicates(int[] nums) {
	  if(nums == null || nums.length == 0){
	  	return 0;
	  }
	  int index = 0, flag = 0;
	  for(int i=1; i<nums.length; i++){
		  if(nums[index] == nums[i]){
			  if((flag > 0) && (i == nums.length - 1)){
				  nums[++index] = nums[i];
			  }
			  flag++;

		  }else{
			  if(flag > 0){
				 flag = 0;
				 index += 1;
			  }
			  nums[++index] = nums[i];
		  }
	  }
	  int len = 0;
	  if(flag >0 ){
	      len = index + 2;
	      
	  }else{
	      len = index + 1;
	  }
	  return len;   
	}
}
