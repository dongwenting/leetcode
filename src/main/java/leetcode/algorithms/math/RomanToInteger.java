package leetcode.algorithms.math;

public class RomanToInteger {
    public int romanToInt(String s) {
    	if(s == null || s.isEmpty()){
    		return 0;
    	}
        s = s.trim();
        if(s.isEmpty()){
        	return 0;
        }
        
        int num = toNumber(s.charAt(0));
        for(int i=1; i<s.length(); i++){
        	int tmp1 = toNumber(s.charAt(i-1));
        	int tmp2 = toNumber(s.charAt(i));
        	if( tmp1 <  tmp2){
        		num += tmp2 - 2*tmp1;
        	}else{
        		num += tmp2;
        	}
        }
        return num;
    }
    
    public int toNumber(Character c){
    	switch(c){
    	case 'I': return 1;
    	case 'V': return 5;
    	case 'X': return 10;
    	case 'L': return 50;
    	case 'C': return 100;
    	case 'D': return 500;
    	case 'M': return 1000;
    	}
    	return 0;	
    }
}
