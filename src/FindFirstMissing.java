import java.util.HashSet;

/**
 * Created by surabhi on 8/5/16.
 */
public class FindFirstMissing {
    /*public static int firstMissingPositive(int[] nums) {
        if(nums.length==0)
            return Integer.MIN_VALUE;
        HashSet<Integer> hs=new HashSet<>();

        for(int k=0;k<nums.length;k++)
        {
            hs.add(nums[k]);
        }
        for(int i=0;i<=nums.length;i++)
        {
            if(!hs.contains(i))
            {
                return i;
            }
        }
        return Integer.MIN_VALUE;
    }
*/
    public static int firstMissingPositive(int[] nums) {
        if(nums.length==0)
            return 1;
        HashSet<Integer> hs=new HashSet<>();
        int i=0,j=nums.length-1;
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        while(i<=j)
        {

            if(nums[i]!=nums[j])
            {
                if(nums[i]<0)
                    i++;
                else if(nums[j]<0)
                    j--;

                if(nums[i]>nums[j])
                {
                    if(nums[i]<0)
                        i++;
                    else if(nums[j]<0)
                        j--;
                    else
                    {max=Math.max(max,nums[i]);
                    min=Math.min(min,nums[j]);
                    hs.add(nums[i]);
                    hs.add(nums[j]);
                    i++;
                    j--;}
                }
                else
                {if(nums[i]<0)
                    i++;
                else if(nums[j]<0)
                    j--;
                       else{ max=Math.max(max,nums[j]);
                        min=Math.min(min,nums[i]);
                        hs.add(nums[i]);
                        hs.add(nums[j]);
                        i++;
                        j--;}
                }
            }
            else
            {
                if(nums[i]<0)
                    i++;
                else if(nums[j]<0)
                    j--;
                else
                {
                    max=Math.max(max,nums[i]);
                    min=Math.min(min,nums[j]);
                    hs.add(nums[i]);
                    i++;
                    j--;
                }
            }
        }
        for(int k=min>1?1:min;k<=max+1;k++)
        {
            if(!hs.contains(k))
                return k;
        }

        if(nums.length==1&&nums[0]>1)
        {
            return nums[0]-1;
        }
        else
            return nums[nums.length-1]+1;
    }

    public static void main(String[] args) {
        int[]nums={-10,-3,-100,-1000,-239,1};
        System.out.println(firstMissingPositive(nums));
    }
}
