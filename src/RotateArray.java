import java.util.Arrays;

/**
 * Created by surabhi on 7/18/16.
 */
public class RotateArray
{
    public static int[] rotate(int[] arr, int order) {
        if (arr == null || arr.length==0 || order < 0) {
            throw new IllegalArgumentException("Illegal argument!");
        }
        if(order > arr.length){
            order = order %arr.length;
        }
        //length of first part
        int a = arr.length - order;

        reverse(arr, 0, a-1);
        reverse(arr, a, arr.length-1);
        reverse(arr, 0, arr.length-1);
        return arr;
    }

    public static void reverse(int[] arr, int left, int right){
        if(arr == null || arr.length == 1)
            return;

        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        int[]arr={12,2,5,6,3,1,19};
        int[]res=rotate(arr,8);
        System.out.println(Arrays.toString(res));
    }
}
