package leetcode.algorithms.hashtable;

public class CountPrimes {
	
    public int countPrimes(int n) {
    	boolean[] array = new boolean[n];
    	for(int i=2; i<n; i++){
    		if(!array[i]){
    			int j=i*i;
    			if(j>=n){
    				break;
    			}else{
    				while(j<n){
    					array[j] = true;
    					j = j+i;
    				}
    			}
    		}
    	}
    	
    	int count=0;
    	for(int i=2; i<n; i++){
    		if(!array[i]){
    			count++;
    		}
    	}
    	return count;
    }
}
