package leetcode.algorithms.array;

import leetcode.algorithms.array.RotateArray;

import org.junit.Test;

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
