package leetcode.algorithms.string;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        if(s == null || s.isEmpty()){
        	return 0;
        }
        s = s.trim();
        if(s.isEmpty()){
        	return 0;
        }
        
        String[] strs = s.split(" ");
        String lastword = "";
        for(int i=strs.length-1; i>=0; i--){
        	if(!strs[i].isEmpty()){
        		lastword = strs[i];
        		break;
        	}
        }
        
        return lastword.length();
    }
}
