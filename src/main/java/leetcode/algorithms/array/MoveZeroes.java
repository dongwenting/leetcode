package leetcode.algorithms.array;

public class MoveZeroes {
	
	public void swap(int[]nums, int i, int j){
		nums[i] ^= nums[j];
		nums[j] ^= nums[i];
		nums[i] ^= nums[j];
	}
	
    public void moveZeroes(int[] nums) {
    	if(nums == null || nums.length < 1) {
    		return ;
    	}
    	int zero = 0, nozero = 0;
    	while(zero <= nozero){
	    	while(zero<nums.length){
	    		if(nums[zero] == 0){
	    			break;
	    		}
	    		zero++;
	    	}
	    	while(nozero < nums.length){
	    		if(nums[nozero] != 0){
	    			break;
	    		}
	    		nozero++;
	    	}
	    	if(zero > nums.length - 1 || nozero > nums.length - 1){
	    		break;
	    	}
	    	if(zero > nozero){
	    		nozero = zero + 1;
	    	}else{
	    		swap(nums, zero, nozero);
	    	}
    	}
    	System.out.println(nums);
    }
    
}
