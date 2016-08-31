import java.util.*;

/**
 * Created by surabhi on 8/4/16.
 */
public class SummaryRanges {
    public static List<String> summaryRanges(int[] nums) {
        ArrayList<String>arr=new ArrayList<>();
        LinkedHashMap<Integer,Integer>hs=new LinkedHashMap<>();
        if(nums.length==0)
            return arr;
        else
        {

            for(int i=0;i<nums.length;i++)
            {
                if(hs.isEmpty())
                {
                    hs.put(nums[i],null);

                }
                else
                {
                    if(hs.containsKey(nums[i]-1)||hs.containsValue(nums[i]-1))
                    {
                        for(int key: hs.keySet())
                        {
                            if(key==nums[i]-1||hs.get(key)!=null&&hs.get(key).equals(nums[i]-1))
                            {
                                hs.put(key,nums[i]);
                            }

                        }
                    }
                    else
                    {
                        hs.put(nums[i],null);
                    }


                }

            }

        }

            Iterator it = hs.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry pair = (Map.Entry)it.next();
                String str=null;
                if(pair.getValue()==null)
                {
                     str=new String(String.valueOf(pair.getKey()));
                }
                else
                {
                    str=new String(String.valueOf(pair.getKey()) + "->" + String.valueOf(pair.getValue()));

                }
                arr.add(str);
                it.remove(); // avoids a ConcurrentModificationException

        }
        return arr;
    }

    public static void main(String[] args) {
        int[]nums={0,1,2,4,5,7,9,10,12,14,15,16,27,28};
        System.out.println(Arrays.toString(summaryRanges(nums).toArray()));
    }
}
