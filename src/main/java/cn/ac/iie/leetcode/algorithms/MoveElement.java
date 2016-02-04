package cn.ac.iie.leetcode.algorithms;

public class MoveElement {
	
	public void swap(int[]nums, int i, int j){
		nums[i] ^= nums[j];
		nums[j] ^= nums[i];
		nums[i] ^= nums[j];
	}
	
    public int removeElement(int[] nums, int val) {
    	if(nums == null || nums.length < 1) {
    		return 0;
    	}
    	int i=0, j=nums.length-1;
    	while(i<=j){
    		while(i<nums.length){
    			if(nums[i] == val){
    				break;
    			}
    			i++;
    		}
    		
    		while(j>=0){
    			if(nums[j]!=val){
    				break;
    			}
    			j--;
    		}
    		
    		if(i>nums.length -1 || j <0){
    			break;
    		}
    		if(i<j){
    			swap(nums, i, j);
    		}
    	}
    	return i;
    }
}
