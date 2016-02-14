package leetcode.algorithms.string;

import java.util.Stack;

public class ValidPalindrome {
//	public boolean isPalindrome(String s) {
//		if (s == null) return false;
//		if(s.length() < 2) return true;
//		char[] ch = s.toCharArray();
//
//		int i = 0, j = ch.length - 1;
//		while (i < j) {
//			while (i < ch.length-1 && !Character.isLetter(ch[i])) {
//				i++;
//			}
//			while (0 < j && !Character.isLetter(ch[j])) {
//				j--;
//			}
//			if(i >= j){
//				break;
//			}
//			if (Character.toUpperCase(ch[i]) != Character.toUpperCase(ch[j])) {
//				return false;
//			} 
//			i++;
//			j--;
//		}
//
//		return true;
//	}
	
	public boolean isPalindrome(String s) {
		s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
	 
		int len = s.length();
		if (len < 2)
			return true;
	 
		Stack<Character> stack = new Stack<Character>();
	 
		int index = 0;
		while (index < len / 2) {
			stack.push(s.charAt(index));
			index++;
		}
	 
		if (len % 2 == 1)
			index++;
	 
		while (index < len) {
			if (stack.empty())
				return false;
	 
			char temp = stack.pop();
			if (s.charAt(index) != temp)
				return false;
			else
				index++;
		}
	 
		return true;
	}
}
