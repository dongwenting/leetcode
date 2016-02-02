package leetcode.cn.ac.iie;

import org.junit.Test;

public class RotateArrayTest {

	@Test
	public void rotateArray(){
		int[] array = {1,2,3,4,5,6,7};
		RotateArray.rotate(array, 3);
		System.out.println(array);
	}
}
