package leetcode.algorithms.array;

public class RotateArray {
	
	public void swap(int[] a, int i, int j){
		a[i] ^= a[j];
		a[j] ^= a[i];
		a[i] ^= a[j];
	}
	
	public void swapArray(int[] a, int i, int j){
		while(i<j){
			swap(a, i, j);
			i++;
			j--;
		}
	}
	
    public void rotate(int[] nums, int k) {
    	if(nums == null || nums.length == 0){
    		return;
    	}
    	if(k == 0){
    		return ;
    	}
    	int pos = k % nums.length;
    	swapArray(nums, 0, pos);
    	swapArray(nums, pos + 1, nums.length-1);
    	swapArray(nums, 0, nums.length-1);
    }
    
    public void rotate1(int[] nums, int k) {
    	if(nums == null || nums.length == 0){
    		return;
    	}
    	int[] array = new int[nums.length];
    	for(int i=0; i<nums.length; i++){
    		array[i] = nums[i];
    	}
    	
    	for(int i=0; i<nums.length; i++){
    		int next = (i+k)%nums.length;
    		nums[next] = array[i];
    	}
    	return;
    }
}
