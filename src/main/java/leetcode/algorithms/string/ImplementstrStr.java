package leetcode.algorithms.string;

public class ImplementstrStr {
    public int strStr(String haystack, String needle) {
    	if(haystack == null || needle == null){
    		return -1;
    	}
    	if(needle.isEmpty()){
    		return 0;
    	}
    	if(haystack.isEmpty()){
    		return -1;
    	}
    	int i=0, j=0, pos = -1, len = haystack.length() - needle.length() + 1;
    	while(j<len){
    		while(j<len && haystack.charAt(j) != needle.charAt(i)){
    			j++;
    		}
    		if(j>=len){
    			return -1;
    		}
    		pos = j;
    		while(i<needle.length() && haystack.charAt(j) == needle.charAt(i)){
    			i++;
    			j++;
    		}
    		if(i==needle.length()){
    			return pos;
    		}else{
    			j = pos + 1;
    			i = 0;
    		}
    	}
    	return -1;
    }
}
