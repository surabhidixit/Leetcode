import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Created by surabhi on 7/25/16.
 */
public class ContainsDuplicate3 {
    public static boolean isDuplicate(int[] nums, int k, int t) {
        if(nums==null||nums.length<2||k<0||t<0)
            return false;
        TreeSet<Long> set = new TreeSet<Long>();
        for(int i=0; i<nums.length; i++){
            long curr = (long) nums[i];
            long leftBoundary = (long) curr-t;
            long rightBoundary = (long) curr+t+1; //right boundary is exclusive, so +1
            SortedSet<Long> sub = set.subSet(leftBoundary, rightBoundary);
            if(sub.size()>0)
                return true;
            set.add(curr);
            if(i>=k){
                set.remove((long)nums[i-k]);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[]z={3,4,5,6,4};
        int k=1;
        System.out.println(isDuplicate(z,k,2));
    }
}
