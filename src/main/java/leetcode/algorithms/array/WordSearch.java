package leetcode.algorithms.array;

public class WordSearch {
	
    public boolean exist(char[][] board, String word) {
    	if(word == null || word.isEmpty()){
    		return false;
    	}
    	char start = word.charAt(0);
    	for(int i=0; i<board.length; i++){
    		for(int j=0; j<board[0].length; j++){
    			if(board[i][j] == start){
    				if(searchWord(board, i, j, word, 0)){
    					return true;
    				}
    			}
    		}
    	}
        return false;
    }
    
    public boolean searchWord(char[][] board, int i, int j, String word, int index){
    	if(i<0 || i>board.length-1 || j< 0 || j>board[0].length){
    		return false;
    	}
    	if(index == word.length() - 1){
    		return true;
    	}
    	if(board[i][j] == word.charAt(index)){
    		//向下找
    		int next = index + 1;
    		if(!searchWord(board, i+1, j, word, next)){
    			//向右找
    			if(!searchWord(board, i, j+1, word, next)){
    				//向上找
    				if(!searchWord(board, i-1, j, word, next)){
    					//向左找
    					if(!searchWord(board, i, j-1, word, next)){
    	    				return false;
    	    			}else{
    	    				return true;
    	    			}
        			}else{
        				return true;
        			}		
    			}else{
    				return true;
    			}
    		}else{
    			return true;
    		}
    		
    	}else{
    		return false;
    	}
    	
    }
}
