package cn.ac.iie.leetcode.algorithms;

import org.junit.Test;

import cn.ac.iie.leetcode.algorithms.RotateArray;

public class RotateArrayTest {

	@Test
	public void test(){
		new RotateArray().rotate(new int[]{1, 2}, 1);
	}
	
	@Test
	public void test1(){
		int[] a = {1,2};
		new RotateArray().swap(a, 0 ,1);
		System.out.println(a);
	}
}
