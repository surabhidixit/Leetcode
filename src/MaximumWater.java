import java.util.Stack;

/**
 * Created by surabhi on 8/1/16.
 */
public class MaximumWater {
    //using the same solution as largest histogram and changing the width to the number of heights used
    public static int largestRectangleArea(int[] height) {

            int left = 0, right = height.length - 1;
            int maxArea = 0;

            while (left < right) {
                maxArea = Math.max(maxArea, Math.min(height[left], height[right])
                        * (right - left));
                if (height[left] < height[right])
                    left++;
                else
                    right--;
            }

            return maxArea;
        }
    //4 lines <code></code>
    public int maxArea(int[] height) {
        int max = 0, i = 0, j = height.length - 1;
        while(i < j)
            //this line reduces all the operations
            max = Math.max(max, (j - i) * (height[i] < height[j] ? height[i++] : height[j--]));
        return max;
    }


    public static void main(String[] args) {
        int[]arr={1,2,1};
        System.out.println(largestRectangleArea(arr));
    }
}
