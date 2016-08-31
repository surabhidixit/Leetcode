import java.util.HashMap;

/**
 * Created by surabhi on 8/5/16.
 */

public class FindDuplicate {
    public static int findDuplicate(int[] nums) {
        if(nums.length==0)
            return -1;
        HashMap<Integer,Integer>hs=new HashMap<>();
        int j=0;

        for(int i:nums)
        {
            if(hs.containsKey(i))
            {
                return i;
            }
            else
                hs.put(i,1);
        }
        return -1;

    }

    public static void main(String[] args) {
int[]nums={1,2,3,4,5,5,5};
        System.out.println(findDuplicate(nums));
    }
}
