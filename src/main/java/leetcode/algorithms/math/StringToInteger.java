package leetcode.algorithms.math;

public class StringToInteger {
    public int myAtoi(String str) {
        if(str == null || str.isEmpty()){
        	return 0;
        }
        String s = str.trim();
        if(s.isEmpty()){
        	return 0;
        }
        int positive = 1; 
        if(s.startsWith("-")){
        	positive = -1;
        	s = s.substring(1);
        }else if(s.startsWith("+")){
        	s = s.substring(1);
        }
        int num = 0;
        for(int i=0; i<s.length(); i++){
        	char c = s.charAt(i);
        	if(!Character.isDigit(c)){
        		break;
        	}else{
        		int add = c - 48;
        		if(add <= (2147483647-num*10) && i<10){
        			num *= 10;
        			num += add;
        		}else{
        			if(positive == 1){
        				return 2147483647;
        			}else{
        				return -2147483648;
        			}
        		}
        	}
        }
        return positive * num;
    }
}
