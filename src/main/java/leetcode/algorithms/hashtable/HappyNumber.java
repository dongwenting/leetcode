package leetcode.algorithms.hashtable;

import java.util.HashMap;

public class HappyNumber {
    public boolean isHappy(int n) {
        HashMap<Integer, Boolean> map = new HashMap<Integer, Boolean>();
        return isHappy(n, map);
    }
    
    private boolean isHappy(int n, HashMap<Integer, Boolean> map){
    	if(n == 1) return true;
    	Boolean flag = map.get(n);
    	if(flag == null){
    		map.put(n, true);
    	}else{
    		return false;
    	}
    	int sum = 0;
    	while(n > 0){
    		int ge = n%10;
    		n = n/10;
    		sum += ge*ge;
    	}
    	return isHappy(sum, map);
    }
}
