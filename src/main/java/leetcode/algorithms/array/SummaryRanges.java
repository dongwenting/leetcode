package leetcode.algorithms.array;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
	
    public List<String> summaryRanges(int[] nums) {
    	if(nums == null || nums.length == 0){
    		return new ArrayList<String>();
    	}
        List<String> list = new ArrayList<String>();
        String str = nums[0]+"";
        for(int i=0; i<nums.length-1; i++){
        	if(nums[i] + 1== nums[i+1]){
        		if(!str.endsWith("->")){
        			str += "->";
        		}
    			if(i+1 == nums.length-1){
    				str += nums[i+1];
    			}        		
        	}else{
        		if(str.endsWith("->")){
        			str += nums[i];
        		}
        		list.add(str);
        		str = nums[i+1] +"";
        	}
        }
        list.add(str);
        return list;
    }
}
