package Arrays;

import java.util.Arrays;

/**
 * Created by surabhi on 8/21/16.
 */
public class ProductofArray {
    public static int[] productExceptSelf(int[] nums) {

            int[] result = new int[nums.length];
            for (int i = 0, tmp = 1; i < nums.length; i++) {
                result[i] = tmp;
                tmp *= nums[i];
            }
            for (int i = nums.length - 1, tmp = 1; i >= 0; i--) {
                result[i] *= tmp;
                tmp *= nums[i];
            }
            return result;
        }

    public static void main(String[] args) {
        int[]nums={9,0,-2};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }
}
