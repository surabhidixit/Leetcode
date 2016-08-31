import java.util.Arrays;
import java.util.Stack;

/**
 * Created by surabhi on 7/28/16.
 */
public class LargestHistogram
{
    //30ms solution
    public static int largestRectangleArea(int[] height) {
        int len = height.length;
        Stack<Integer> s = new Stack<Integer>();
        int maxArea = 0;
        int i=0;
        while(i<height.length)
        {
            if(s.isEmpty() || height[i] >= height[s.peek()]){
                s.push(i);
                i++;
            }
            else
            {
                int tp = s.pop();
                int h=height[tp];
                int w=i==0?1:i-s.peek()-1;
                maxArea = Math.max(maxArea, h *w);

            }
        }
        if(!s.isEmpty())
        {
            int tp = s.pop();
            int h=height[tp];
            int w=i==0?1:i-s.peek()-1;
            maxArea = Math.max(maxArea, h *w);
        }
        return maxArea;

        }
//5ms solution
public int largestArea(int[] h) {
    int n = h.length;
    int max = 0;
    int[] stack = new int[n + 1];
    int is = -1;
    for (int i = 0; i <= n; i++) {
        int height = (i == n) ? 0 : h[i];
        while (is != -1 && height < h[stack[is]]) {
            int hh = h[stack[is--]];
            int width = (is == -1) ? i : i - 1 - stack[is];
            max = Math.max(max, hh * width);
        }
        stack[++is] = i;
    }
    return max;
}
    public static void main(String[] args) {
        int[]arr={1,1};
        System.out.println(largestRectangleArea(arr));
    }

}
