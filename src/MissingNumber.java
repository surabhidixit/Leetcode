import java.util.HashSet;

/**
 * Created by surabhi on 8/5/16.
 */
public class MissingNumber {
    //my method 21ms
    public static int missingNumber(int[] nums) {
        if(nums.length==0)
            return Integer.MIN_VALUE;
        HashSet<Integer>hs=new HashSet<>();

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
//another method 1ms
public int missing(int[] nums) {
    int sum=0;
    for(int i=0; i<nums.length; i++){
        sum+=nums[i];
    }

    int n=nums.length;
    return n*(n+1)/2-sum;
}
    public static void main(String[] args) {
        int[]nums={1};
        System.out.println(missingNumber(nums));
    }
}
