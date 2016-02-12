package leetcode.algorithms.string;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
    	if(strs == null || strs.length == 0){
    		return "";
    	}
        char[] array = new char[strs.length];
        int i=0;
        boolean flag = false;
        String ret = "";
        while(true){
        	for(int j=0; j<strs.length; j++){
        		if(i<strs[j].length()){
        			array[j] = strs[j].charAt(i);
        		}else{
        			flag = true;
        			break;
        		}
        	}
        	if(flag){
        		break;
        	}
        	if(isEqual(array)){
        		ret += array[0];
        	}else{
        		break;
        	}
        	i++;
        }
        return ret;
    }
    
    private boolean isEqual(char[] array){
    	for(int i=0; i<array.length-1; i++){
    		if(array[i] != array[i+1]){
    			return false;
    		}
    	}
    	return true;
    }
}
