package cn.ac.iie.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/pascals-triangle-ii/
 *
 */
public class PascalsTriangle2 {
	
    public List<Integer> getRow(int rowIndex) {
    	if(rowIndex < 0){
    		return new ArrayList<Integer>();
    	}
    	
    	List<List<Integer>> triangle = new ArrayList<List<Integer>>();
    	List<Integer> first = new ArrayList<Integer>();
    	first.add(1);
    	triangle.add(first);
    	for(int i=1; i<rowIndex+1; i++){
    		List<Integer> row = new ArrayList<Integer>();
    		for(int j=0; j<=i; j++){
    			int right = 0;
    			if(j != 0){
    				right = triangle.get(i-1).get(j-1);
    			}
    			int up = 0;
    			if(j<i){
    				up = triangle.get(i-1).get(j);
    			}
    			row.add(right+up);
    		}
    		
    		triangle.add(row);
    	}
    	return triangle.get(rowIndex);
    }
}
