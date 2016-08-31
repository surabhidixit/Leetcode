import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

/**
 * Created by surabhi on 7/21/16.
 */
public class TwoSumII
{
    public static int[] twoSum(int[] numbers, int target) {
        if(numbers.length==0||numbers[0]>numbers[numbers.length-1])
            return numbers;
        else
        {
            int i=0,j=numbers.length-1;
            int[]res=new int[2];
            while(i<j)
            {
                int v=numbers[i]+numbers[j];
                if(v==target)
                {
                    res[0]=i+1;
                    res[1]=j+1;
                    return res;
                }
                else if(v<target)
                {
                    i++;

                }
                else
                {
                    j--;
                }
            }
            return res;
        }
    }

    public static void main(String[] args) {
        int[]x={-3,3,4,4};

       // System.out.println(Arrays.toString(x));
        int[]res=twoSum(x,0);
       System.out.println(Arrays.toString(res));
    }
}
