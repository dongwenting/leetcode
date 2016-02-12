package leetcode.algorithms.math;

import java.util.ArrayList;

public class AddBinary {
	
    public String addBinary(String a, String b) {
    	ArrayList<Integer> array = new ArrayList<Integer>();
    	int i=a.length()-1, j=b.length()-1,tmp;
    	boolean flag =false;
    	while(i>=0 && j>=0){
    		tmp = a.charAt(i--)-48 + b.charAt(j--)-48;
    		if(flag){
    			tmp += 1;
    			flag = false;
    		}
    		if(tmp >= 2){
    			array.add(tmp%2);
    			flag = true;
    		}else{
    			array.add(tmp);
    			flag = false;
    		}
    	}
    	
    	while(i>=0){
    		tmp = a.charAt(i--)-48;
    		if(flag){
    			tmp += 1;
    			flag = false;
    		}
    		if(tmp == 2){
    			array.add(0);
    			flag = true;
    		}else{
    			array.add(tmp);
    			flag = false;
    		}
    	}
    	
    	while(j>=0){
    		tmp = b.charAt(j--)-48;
    		if(flag){
    			tmp += 1;
    			flag = false;
    		}
    		if(tmp == 2){
    			array.add(0);
    			flag = true;
    		}else{
    			array.add(tmp);
    			flag = false;
    		}
    	}
    	
    	if(flag){
    		array.add(1);
    	}
       	String ret = "";
        for(int m=array.size()-1; m>=0; m--){
        	ret += array.get(m);
        }
        return ret;
    }
}
