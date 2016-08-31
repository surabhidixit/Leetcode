import java.util.*;

/**
 * Created by surabhi on 8/5/16.*/
public class TopKFrequentNumbers {
    //second solution with 84% above rate using bucket sort
    public List<Integer> topKFrequent(int[] nums, int k) {

        List<Integer>[] bucket = new List[nums.length + 1];
        Map<Integer, Integer> frequencyMap = new HashMap<Integer, Integer>();

        for (int n : nums) {
            frequencyMap.put(n, frequencyMap.getOrDefault(n, 0) + 1);
        }

        for (int key : frequencyMap.keySet()) {
            int frequency = frequencyMap.get(key);
            if (bucket[frequency] == null) {
                bucket[frequency] = new ArrayList<>();
            }
            bucket[frequency].add(key);
        }

        List<Integer> res = new ArrayList<>();

        for (int pos = bucket.length - 1; pos >= 0 && res.size() < k; pos--) {
            if (bucket[pos] != null) {
                res.addAll(bucket[pos]);
            }
        }
        return res;
    }
    //first method which is 1% above rate
    public static List<Integer> topFrequent(int[] nums, int k) {
        ArrayList<Integer>arr=new ArrayList<>();
        TreeMap<Integer,Integer>hs=new TreeMap<>();
        int flag=0;

        for(int i:nums)
        {
            if(hs.containsKey(i))
            {
                hs.replace(i,hs.get(i)+1);
            }
            else
            {
                hs.put(i,1);
            }
        }
        for(int j=0;j<hs.size()-1;j++)
        {
            if(!hs.get(nums[j]).equals(hs.get(nums[j+1])))
            {
                flag=1;
                break;
            }
        }
        if(flag==1)
        {
            MyComparator comp=new MyComparator(hs);
        Map<Integer,Integer> newMap = new TreeMap(comp);
        newMap.putAll(hs);

        for(int i=0;i<k;i++)
        {
            arr.add((Integer) newMap.keySet().toArray()[i]);
        }
        }
        else
        {
            for(int i=0;i<k;i++)
            {
                arr.add((Integer)hs.keySet().toArray()[i]);
            }
        }
        return arr;

    }

    public static void main(String[] args) {
        int[]nums={3,2,3,1,2,4,5,5,6,7,7,8,2,3,1,1,1,10,11,5,6,2,4,7,8,5,6};
        System.out.println(Arrays.toString(topFrequent(nums,10).toArray()));
    }
}
class MyComparator implements Comparator {

    Map map;

    public MyComparator(Map map) {
        this.map = map;
    }


        public int compare(Object i1, Object i2){
            int diff = (Integer)map.get(i2)-(Integer)map.get(i1);

            if(diff==0){
                return 1;
            }else{
                return diff;
            }
        }


}
