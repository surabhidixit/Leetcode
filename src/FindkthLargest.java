import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * Created by surabhi on 7/19/16.
 */
public class FindkthLargest
{
    //this solution works in 14 ms
    public static int findit(int[]nums,int k)
    {
        PriorityQueue<Integer>q=new PriorityQueue<Integer>();
        for(int i:nums)
        {
            q.offer(i);
            if(q.size()>nums.length-k+1)
            {
                q.poll();
            }
        }
        return q.peek();
    }
    //this solution works in 4ms and is better to use I guess
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length-k];
    }
    public static void main(String[] args) {
        int[]nums={23,1,4,12,7,22,10,100,19,21,66};
        System.out.println(findit(nums,2));
    }
}
