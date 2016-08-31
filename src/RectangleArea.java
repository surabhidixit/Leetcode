/**
 * Created by surabhi on 8/4/16.
 */
public class RectangleArea {
    public static int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
            int left = Math.max(A,E), right = Math.max(Math.min(C,G), left);
            int bottom = Math.max(B,F), top = Math.max(Math.min(D,H), bottom);
            return (C-A)*(D-B) - (right-left)*(top-bottom) + (G-E)*(H-F);

    }
    public static void main(String[] args) {

        System.out.println(computeArea(-2,-2,2,2,-1,-1,1,1));
    }
}
