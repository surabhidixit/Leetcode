/**
 * Created by surabhi on 7/27/16.
 */
public class FindMinimum {


        public static int find(int[]nums,int x,int y)
        {
            if(nums.length==1)
                return nums[0];

            int left=0;
            int right=nums.length-1;

            //not rotated
            if(nums[left]<nums[right])
                return nums[left];

            while(left <= right){
                if(right-left==1){
                    return nums[right];
                }
                if(nums[left]==nums[right])
                {
                    left++;
                }

                int m = left + (right-left)/2;

                if(nums[m] > nums[right])
                    left = m;
                else
                    right = m;
            }

            return -1;
        }

    public static void main(String[] args) {
        int[]arr={3,3,1,3};
        System.out.println(find(arr,0,arr.length));
    }
}
