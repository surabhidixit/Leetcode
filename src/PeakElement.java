import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;

/**
 * Created by surabhi on 8/6/16.
 */
public class PeakElement
{
    //firs method 2ms
    public static int findPeakElement(int[] nums) {
        LinkedHashMap<Integer,Integer>hs=new LinkedHashMap<>();
        int flag=0;
        int j=0;
        int max=0;
        if(nums.length==1)
            return 0;
        if(nums.length==0)
            return -1;
        ArrayList<Integer>list=new ArrayList<>();

        if(nums.length>1)
        {
            if(nums[0]>nums[1])
            {
                list.add(0);
                if(nums.length==2)
                {
                    return list.get(0);
                }
                else
                    j= nums.length>2?j+2:1;
            }
            else
            {
                if(nums.length==2)
                    return 1;
                j=nums.length>2?j+1:1;
            }
        }
        while(j<nums.length)
        {
            int c=j==nums.length-1?Integer.MIN_VALUE:nums[j+1];
            if(nums[j]>nums[j-1]&&nums[j]>c)
            {
                list.add(j);
                j++;
            }
            else
            j++;
        }
        return list.get(list.size()-1);
    }
    //second method 1ms
    public static int findPeak(int[] num) {
        int max = num[0];
        int index = 0;
        for(int i=1; i<=num.length-2; i++){
            int prev = num[i-1];
            int curr = num[i];
            int next = num[i+1];

            if(curr > prev && curr > next && curr > max){
                index = i;
                max = curr;
            }
        }

        if(num[num.length-1] > max){
            return num.length-1;
        }

        return index;
    }
    public static void main(String[] args) {
        int[]nums={1,1,2,3};
        System.out.println(findPeakElement(nums));

    }
}
