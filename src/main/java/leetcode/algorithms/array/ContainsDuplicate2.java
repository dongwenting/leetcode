package leetcode.algorithms.array;

import java.util.HashMap;

public class ContainsDuplicate2 {
//  超时   
//	public boolean containsNearbyDuplicate(int[] nums, int k) {
//        for(int i=0; i<nums.length-k; i++){
//        	for(int j=1; j<=k; j++){
//        		if(nums[i] == nums[i+j]){
//        			return true;
//        		}
//        	}
//        }
//        return false;
//    }
//	
//	快排超时
//	public void quickSort(int[] a, int[] pos, int low, int high){
//		if(low>high || low>a.length-1 || high <=0){
//			return;
//		}
//		int key=a[low], p=pos[low], i=low, j=high;
//		while(i<j){
//			while(a[j] > key && i<j){ 
//				j--;
//			}
//			if(i<j){
//				pos[i] = pos[j];
//				a[i++] = a[j];
//			
//			}
//			while(a[i] < key && i<j) {
//				i++;
//			}
//			if(i<j){
//				pos[j] = pos[i];
//				a[j--] = a[i];
//			}
//		}
//		a[i] = key;
//		pos[i] = p;
//		quickSort(a, pos, low, i-1);
//		quickSort(a, pos, i+1, high);
//	}
//	
//	public boolean containsNearbyDuplicate(int[] nums, int k) {
//		int[] pos = new int[nums.length];
//		for(int i=0; i<nums.length; i++){
//			pos[i] = i;
//		}
//		quickSort(nums, pos, 0, nums.length-1);
//		for(int i=0; i<nums.length-1; i++){
//			if(nums[i] == nums[i+1] && pos[i+1] - pos[i] < k){
//				return true;
//			}
//		}
//		return false;
//	}
	
	
	public boolean containsNearbyDuplicate(int[] nums, int k) {
		HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
		for(int i=0; i<nums.length; i++){
			Integer index = map.get(nums[i]);
			if(index != null && i-index<=k){
				return true;
			}
			map.put(nums[i], i);
		}
		return false;
	}
}
