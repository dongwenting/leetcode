package leetcode.algorithms.array;

import java.util.HashMap;

public class ContainsDuplicate {
	//快排比较相邻两个值
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0; i<nums.length; i++){
        	Integer count = map.get(nums[i]);
        	if(count == null){
        		map.put(nums[i], 0);
        	}else{
        		return true;
        	}
        }
        return false;
    }
}
