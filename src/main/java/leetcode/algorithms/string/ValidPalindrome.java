package leetcode.algorithms.string;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
       if(s == null || s.isEmpty()){
    	   return true;
       } 
       String s2 = "", s3 = "";
       
       for(int i=0; i<s.length(); i++){
    	   Character c = s.charAt(i);
    	   if(Character.isLetter(c)){
    		   s2 = s2 + c;
    		   s3 = c + s3;
    	   }
       }
       
       return s2.equalsIgnoreCase(s3);
    }
}
