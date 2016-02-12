package leetcode.algorithms.string;

import java.util.ArrayList;

public class ValidParentheses {
    public boolean isValid(String s) {
    	if(s == null || s.isEmpty()){
    		return false;
    	}
    	ArrayList<Character> array = new ArrayList<Character>();
    	for(int i=0; i<s.length(); i++){
    		Character c = s.charAt(i);
    		switch(c){
    		case '(':
    		case '{':
    		case '[':
    			array.add(c);
    			break;
    		case ')':{
    			if(array.size() == 0){
    				return false;
    			}
    			Character r = array.remove(array.size()-1);
    			if(r != '('){
    				return false;
    			}
    			break;
    		}
    		case '}':{
    			if(array.size() == 0){
    				return false;
    			}
    			Character r = array.remove(array.size()-1);
    			if(r != '{'){
    				return false;
    			}
    			break;
    		}
    		case ']':{
    			if(array.size() == 0){
    				return false;
    			}
    			Character r = array.remove(array.size()-1);
    			if(r != '['){
    				return false;
    			}
    			break;
    		}
    		}
    	}
    	if(array.isEmpty()){
    		return true;
    	}
    	return false;
    }
}
