package leetcode.algorithms.math;

public class RectangleArea {
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int bottomX = A > E ? A : E;
        int bottomY = B > F ? B : F;
        int topX = C < G ? C : G;
        int topY = D < H ? D : H;
        int area = 0;
        if(bottomX >= topX || bottomY >= topY){
        	area = 0;
        }else{
        	area = (topX-bottomX)*(topY-bottomY);
        }
        return (C-A)*(D-B)+(G-E)*(H-F)-area;
    }
}
