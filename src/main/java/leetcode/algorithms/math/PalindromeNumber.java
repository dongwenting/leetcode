package leetcode.algorithms.math;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
    	if(x < 0) return false;
    	int a = x, tmp = 0;
    	while(a>0){
    		tmp = tmp*10+a%10;
    		a /= 10;
    	}
    	return tmp == x;
    }
}
