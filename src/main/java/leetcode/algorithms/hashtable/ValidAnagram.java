package leetcode.algorithms.hashtable;

import java.util.HashMap;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
    	if(s.length() != t.length()){
    		return false;
    	}
    	HashMap<Character, Integer> maps = convertToMap(s);
    	HashMap<Character, Integer> mapt = convertToMap(t);
    	
        return mapEqual(maps, mapt);
    }
    
    public HashMap<Character, Integer> convertToMap(String s){
    	HashMap<Character, Integer> map = new HashMap<Character, Integer>();
    	for(int i=0; i<s.length(); i++){
    		Character c = s.charAt(i);
    		Integer count = map.get(c);
    		if(count == null){
    			map.put(c, 1);
    		}else{
    			map.put(c, count+1);
    		}
    	}
    	return map;
    }
    
    public boolean mapEqual(HashMap<Character, Integer> maps,HashMap<Character, Integer> mapt){
    	if(maps.keySet().size() != maps.keySet().size()){
    		return false;
    	}
    	for(Character c : maps.keySet()){    
    		Integer counts = maps.get(c);
    		Integer countt = mapt.get(c);
    		if(counts == null || countt == null || counts.intValue() != countt.intValue()){
    			return false;
    		}
    	}
    	return true;
    }
}
