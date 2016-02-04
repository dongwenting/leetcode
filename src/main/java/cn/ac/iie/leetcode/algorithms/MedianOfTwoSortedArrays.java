package cn.ac.iie.leetcode.algorithms;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/median-of-two-sorted-arrays/
 *
 */
public class MedianOfTwoSortedArrays {
	
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    	int i=0, j=0;
    	int[] array = new int[nums1.length+nums2.length];
    	int index = 0;
    	while(i<nums1.length && j<nums2.length){
    		if(nums1[i]<=nums2[j]){
    			array[index++]= nums1[i++];
    		}else{
    			array[index++]= nums2[j++];
    		}
        }
       	while(i<nums1.length){
        	array[index++]= nums1[i++];
        }
       	while(j<nums2.length){
        	array[index++]= nums2[j++];
        }
    	double ret = 0;
    	int n = nums1.length + nums2.length, mid = 0;
    	if(n % 2==0){
    		mid = n /2;
    		ret = (array[mid -1] + array[mid+1])/2;
    	}else{
    		mid = (n+1)/2;
    		ret = array[mid];
    	}
    	return ret;
    }
}
