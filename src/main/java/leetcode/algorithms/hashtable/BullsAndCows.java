package leetcode.algorithms.hashtable;

import java.util.ArrayList;
import java.util.HashMap;

public class BullsAndCows {
	
    public String getHint(String secret, String guess) {
        if(secret == null || guess == null || secret.length() != guess.length()){
        	return "0A0B";
        }
        
        HashMap<Character, ArrayList<Integer>> map = new HashMap<Character, ArrayList<Integer>>();
        HashMap<Integer, Boolean> flag = new HashMap<Integer, Boolean>();
        for(int i=0; i<secret.length(); i++){
        	char c = secret.charAt(i);
        	flag.put(i, false);
        	ArrayList<Integer> list = map.get(c);
        	if(list== null){
        		ArrayList<Integer> llist = new ArrayList<Integer>();
        		llist.add(i);
        		map.put(c, llist);
        	}else{
        		list.add(i);
        	}
        }
        
        Integer bulls = 0, cows = 0;
        // find bulls
        for(int i=0; i<guess.length(); i++){
        	char c = guess.charAt(i);
        	ArrayList<Integer> list = map.get(c);
        	if(list != null){
        		int j;
        		for(j=0; j<list.size(); j++){
        			if(list.get(j) == i){
        				flag.put(i, true);
        				bulls++;
        				list.remove(j);
                		if(list.isEmpty()){
                			map.remove(c);
                		}
        				break;
        			}
        		}

        	}
        }
        //find cows
        for(int i=0; i<guess.length(); i++){
        	char c = guess.charAt(i);
        	if(!flag.get(i)){
	        	ArrayList<Integer> list = map.get(c);
	        	if(list != null){
	        		for(int j=0; j<list.size(); j++){
	        			if((list.get(j) != i)){
	        				cows++;
	        				list.remove(j);
	                		if(list.isEmpty()){
	                			map.remove(c);
	                		}
	        				break;
	        			}
	        		}
	        	}
        	}
        }       
        
        return bulls + "A" + cows + "B";
    }
}
