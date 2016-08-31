/**
 * Created by surabhi on 7/27/16.
 */
public class FindElement
{
    public static int find(int[]nums,int x) {
        if (nums.length == 1)
            return (nums[0]==x?0:-1);
        int left = 0;
        int right = nums.length - 1;


        while (left <= right) {
            int m=(right+left)/2;
            if(right-left==1)
            {
                if(nums[left]==x)
                    return left;
                if(nums[right]==x)
                    return right;
                else
                    return -1;
            }
            if(x==nums[m])
                return m;
            if(x==nums[left])
                return left;
            if(x==nums[right])
                return right;

            if(nums[left]<nums[right])
            {
                if(x>nums[left]&&x>nums[m]||x<nums[left])
                {
                    left=m-1;
                }
                else
                    right=m+1;
            }
            else
            {
                if(x<nums[m]&&x>nums[right]&&x<nums[m]&&x<nums[left]||nums[left]<nums[m]&&x>nums[left])
                {
                    right=m+1;
                }
                else
                {
                    left=m-1;
                }
            }


        }
        return -1;
    }

    public static void main(String[] args) {
        int[]nums={1,3,5};
        System.out.println(find(nums,0));
    }
}
