package leetcode.algorithms.math;

public class FirstBadVersion extends VersionControl {
    public int firstBadVersion(int n){
        long low = 1, high = n, mid;
        if(n == 1){
        	return isBadVersion(n) ? n : -1;
        }
        
        while(low<=high){
        	mid = (low+high)/2;
        	int v = Integer.parseInt(mid+"");
        	boolean flag = isBadVersion(v);
        	if(flag &&!isBadVersion(v-1)){
        		return v;
        	}else if(flag){	
        		high = mid-1;
        	}else{
        		low = mid+1;
        	}
        }
        return -1;
    }
}
