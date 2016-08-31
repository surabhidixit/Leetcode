import java.util.Arrays;

/**
 * Created by surabhi on 8/3/16.
 */
public class TargetSearch {
    public static int[] searchRange(int[]nums, int target) {
        int start = 0, end = nums.length-1;
        int mid = 0;
        int left = 0, right = 0;
        int[] res = new int[2];
        res[0]=-1;
        res[1]=-1;
        if (nums.length == 0)
            return null;
        if(target>nums[end]||target<nums[start])
            return res;
        else {
            if(start==end&&nums.length==1)
            {
                res[0]=res[1]=nums[start]==target?0:-1;
            }

            while(start<=end)
            {
                mid =(start+end)/2;
                if((res[0]>-1&&res[1]>-1&&nums[res[0]]==target&&nums[res[1]]==target))
                {
                    return res;
                }

              else
                {
                    if(target==nums[mid]) {
                  if(nums[start]==nums[mid])
                      res[0]=start;
                  else
                      start++;
                  if(nums[end]==nums[mid])
                      res[1]=end;
                  else
                      end--;
              }
                else if(target<nums[mid])
                {
                    end=mid-1;
                }
                else if(target>nums[mid])
                start=mid+1;
            }}

        }
        return res;
    }

    public static void main(String[] args) {
        int[]nums={1,3};
        int[]res=null;
        System.out.println(Arrays.toString(res=searchRange(nums,1)));

    }
}
