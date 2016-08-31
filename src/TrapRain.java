import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by surabhi on 8/1/16.
 */
public class TrapRain
{
    public static int trap(int[]height)
    {
        if (height == null || height.length == 0) {
            return 0;
        }
        int start = 0;
        int end = height.length - 1;
        int smaller;
        int area = 0;
        while (start < end) {
            if (height[start] < height[end]) {
                smaller = height[start];
                while (start < end && height[start] <= smaller) {
                    area += smaller - height[start];
                    start++;
                }
            } else {
                smaller = height[end];
                while (start < end && height[end] <= smaller) {
                    area += smaller - height[end];
                    end--;
                }
            }
        }
        return area;
    }
    public static void main(String[] args) {
        int[]height={2,0,2};
        System.out.println(trap(height));
    }
}
