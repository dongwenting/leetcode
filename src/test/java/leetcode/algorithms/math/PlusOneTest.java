package leetcode.algorithms.math;

import org.junit.Test;

public class PlusOneTest {

	@Test
	public void test(){
		for(int a :new PlusOne().plusOne(new int[]{9,9})){
			System.out.print(a);
		}
	}
}
