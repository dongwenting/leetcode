package leetcode.algorithms.math;

public class ReverseInteger {
    public int reverse(int x) {
    	int positive = 1;
        if(x < 0){
        	if(x == -2147483648){
        		return 0;
        	}
        	positive = -1;        	
        	x = -x;
        }
        long num = 0;
        while(x>0){
        	int ge = x%10;
        	x = x/10;
	        num *= 10;
	        num += ge;
        }
        if(num > Integer.MAX_VALUE){
        	return 0;
        }else{
        	return (int)(positive*num);
        }
    }
}
