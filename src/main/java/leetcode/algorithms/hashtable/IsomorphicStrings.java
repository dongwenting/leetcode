package leetcode.algorithms.hashtable;

import java.util.HashMap;

public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
    	HashMap<Character, Character> map = new HashMap<Character, Character>();
		for(int i=0; i<s.length(); i++){
	    	 char c = s.charAt(i);
	    	 char c1 = t.charAt(i);
	    	 Character c2 = map.get(c);
	    	 
	    	 if(c2 == null){
	    		 for(char ch : map.values()){
	    			 if(ch == c1){
	    				 return false;
	    			 }
	    		 }
	    		 map.put(c, c1);
	    	 }else if(c2 != c1){
	    		 return false;
	    	 }
	    }
		return true;
    }
}
