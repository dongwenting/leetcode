package leetcode.algorithms.math;

import java.util.ArrayList;

public class PlusOne {
    public int[] plusOne(int[] digits) {
    	ArrayList<Integer> array = new ArrayList<Integer>();
    	boolean flag = false;
        for(int i=digits.length-1; i>=0; i--){
        	int tmp;
        	if(i == digits.length-1 || flag){
	        	tmp = digits[i] + 1;
             	if(tmp >= 10){
	        		flag = true;
	        		tmp = tmp%10;
	        	}else{
	        		flag = false;
	        	}
        	}else{
        		flag = false;
        		tmp = digits[i];
        	}
        	
	        array.add(tmp);
        }
        if(flag){
        	array.add(1);
        }
        int[] ret = new int[array.size()];
        for(int i=array.size()-1; i>=0 ; i--){
        	ret[array.size()-1-i] = array.get(i);
        }
        return ret;
    }
}
