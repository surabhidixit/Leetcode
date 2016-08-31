import java.util.*;

/**
 * Created by surabhi on 8/4/16.
 */
public class IncreasingTriplet {
    //686 ms solution using Arraylist
    /*public static boolean increasingTriplet(int[] nums) {
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        ArrayList<Integer>inner=null;
        int max=0;
        int j=0;
        int no=0;
        boolean flag=false;
        int i=0;
        while(i<nums.length)
        {
            if(arr.size()==0)
            {
                inner=new ArrayList<>();
                arr.add(inner);
                arr.get(0).add(nums[i]);
                i++;
            }
            else
            {   j=0;
                while(j<arr.size())
                {
                    if(arr.get(j).size()==2)
                    {
                        no=1;
                        break;
                    }
                    else
                    {
                        j++;
                    }
                }

                    j=no==0?0:j;

                while(j<arr.size()&&i<nums.length)
                {

                    if(arr.get(j).get(0)<nums[i])
                    {
                        if(arr.get(j).size()==2)
                        {
                            if(arr.get(j).get(1)>nums[i])
                            {
                                inner=new ArrayList<>();
                                Integer x=arr.get(j).get(0);
                                Integer y=arr.get(j).get(1);
                                arr.get(j).clear();
                                arr.get(j).add(x);
                                arr.get(j).add(nums[i]);
                                inner.add(y);
                                arr.add(inner);
                                i++;
                            }
                            else
                            {
                                if(arr.get(j).get(1)!=nums[i])
                                {
                                    arr.get(j).add(nums[i]);
                                    i++;
                                }
                                else
                                    j++;

                            }
                        }
                        else
                        {
                            arr.get(j).add(nums[i]);
                            i++;


                        }
                    }
                    else
                        j++;

                }
                if(i<nums.length)
                {
                    inner=new ArrayList<>();
                    inner.add(nums[i]);
                    arr.add(inner);
                }
                i++;
            }

        }
        for(ArrayList x:arr)
        {
            if(x.size()>2)
                flag=true;
        }

        return flag;
    }*/
    //1ms solution using nothing
 /*   public static boolean increasingTriplet(int[] nums) {
    if (nums == null || nums.length < 3) {
        return false;
    }

    *//*--- variable declaration ---*//*
    int i;
    int max = Integer.MAX_VALUE;
    int min = Integer.MAX_VALUE;

        *//* the key is first to find an ascending pair, then keep looking for another ascending pair then based on the ralative positions of the two pair we know if the triplet exist
         * two ascending pairs can only be in one of the following relations
         *          @           @
         *      @   |       @   |       @           @
         *      |   |       |   |       |   @       |   @
         *      |   |       |   @       |   |       |   @
         *      @   |       @           @   |       @
         *          @                       @
         *      true        true    update pair      true
         *                          and keep searching
         *//*

    for (i = 0; i < nums.length - 1; i++) {
        if (nums[i] >= nums[i + 1]) {
            continue;
        } else {
            if (nums[i + 1] > max || nums[i] > min) {
                return true;
            } else {
                max = nums[i + 1];
                min = nums[i];
            }
        }
    }

         *//*--- return!!! ---*//*
    return false;
}*/
    //another ims solution
    public static boolean increasingTriplet(int[] nums) {
        int x = Integer.MAX_VALUE;
        int y = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            int z = nums[i];

            if (x >= z) {
                x = z;// update x to be a smaller value
            } else if (y >= z) {
                y = z; // update y to be a smaller value
            } else {
                return true;
            }
        }

        return false;
    }

        public static void main(String[] args) {
            int[]nums={2,1,0,5,3};
            System.out.println(increasingTriplet(nums));
        }
}
