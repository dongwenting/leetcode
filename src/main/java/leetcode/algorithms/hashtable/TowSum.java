package leetcode.algorithms.hashtable;

import java.util.HashMap;

public class TowSum {
    public int[] twoSum(int[] nums, int target) {
        int[] ret = new int[2];
    	if(nums == null || nums.length < 1){
    		return ret;
    	}

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0; i<nums.length; i++){
        	int n = nums[i];
        	Integer pos = map.get(n);
			if (pos == null) {
				map.put(target - n, i);
			} else {
				ret[0] = pos + 1;
				ret[1] = i + 1;
				return ret;
        	}
        }
        return ret;
    }
}
