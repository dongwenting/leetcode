package leetcode.cn.ac.iie;

public class RotateArray {
	
    public static void rotate(int[] nums, int k) {
    	int tmp;
        for(int i= 0; i<nums.length; i++ ){
        	int pos = (i+k)/nums.length;
        	tmp = nums[pos];
        	nums[pos] = nums[i];
        	i++;
        }
    }
}
