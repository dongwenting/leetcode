package leetcode.algorithms.array;

public class MajorityElement {
	
	void quickSort(int a[], int low, int high){
		if(low > high || low >= a.length -1 || high <= 0){
			return ;
		}
		int key = a[low], i = low, j = high;
		while(i<j){
			while(a[j]>key && i<j) j--;
			if(i<j) a[i++] = a[j];
			while(a[i]<key && i<j) i++;
			if(i<j) a[j--] = a[i];
		}
		a[i] = key;
		quickSort(a, low, i-1);
		quickSort(a, i+1, high);
	}
	
    public int majorityElement(int[] nums) {
        if(nums == null || nums.length < 1){
        	return -1;
        }
        quickSort(nums, 0, nums.length-1);
        
        return nums[nums.length / 2];
    }
}
