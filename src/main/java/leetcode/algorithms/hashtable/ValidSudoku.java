package leetcode.algorithms.hashtable;

import java.util.HashMap;

public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
    	if(board == null || board.length != 9 ||  board[0].length != 9){
    		return false;
    	}
    	
    	int len = board.length;
        for(int i=0; i<len; i++){
        	HashMap<Character, Boolean> mapRow = new HashMap<Character, Boolean>();
        	HashMap<Character, Boolean> mapCol = new HashMap<Character, Boolean>();
        	for(int j=0; j<len; j++){
        		char row = board[i][j];
        		char col = board[j][i];
        		if(row != '.'){
        			Boolean flag = mapRow.get(row);
        			if(flag == null){
        				mapRow.put(row, true);
        			}else{
        				return false;
        			}
        		}
        		
        		if(col != '.'){
        			Boolean flag = mapCol.get(col);
        			if(flag == null){
        				mapCol.put(col, true);
        			}else{
        				return false;
        			}
        		}
        	}
        }
    	
        for(int i=0; i<3; i++){
        	for(int j=0; j<3; j++){
        		HashMap<Character, Boolean> map = new HashMap<Character, Boolean>();
                
        		for(int row=3*i; row<3*i+3; row++){
        			for(int col=3*j; col<3*j+3; col++){
            			char c = board[row][col];
                   		if(c != '.'){
                			Boolean flag = map.get(c);
                			if(flag == null){
                				map.put(c, true);
                			}else{
                				return false;
                			}
                		}        				
        			}
        		}
        	}
        }
    	return true;
    }
}
