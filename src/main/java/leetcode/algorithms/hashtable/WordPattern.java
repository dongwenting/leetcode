package leetcode.algorithms.hashtable;

import java.util.HashMap;

public class WordPattern {
    public boolean wordPattern(String pattern, String str) {
        String[] strs = str.split(" ");
        if(strs.length != pattern.length()){
        	return false;
        }
        HashMap<Character, String> map = new HashMap<Character, String>();
        for(int i=0; i<strs.length; i++){
         	Character c = pattern.charAt(i);
        	String s = strs[i];
        	String s1 = map.get(c);
        	if(s1 == null){
        		for(String value : map.values()){
        			if(value.equals(s)){
        				return false;
        			}
        		}
        		map.put(c, s);
        	}else{
        		if(!s1.equalsIgnoreCase(s)){
        			return false;
        		}
        	}
        }
        return true;
    }
}
