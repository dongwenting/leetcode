package leetcode.algorithms.math;

public class PowerOfThree {
    public boolean isPowerOfThree(int n) {
        return (n>0 && ((int) (Math.log10(n) / Math.log10(3)) - Math.log10(n)/Math.log10(3)) == 0);
    }
}
