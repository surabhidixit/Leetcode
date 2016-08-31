import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by surabhi on 7/21/16.
 */
public class TwoSum {
    public static int[] givetwosum(int[] x,int sum)
    {

        HashMap<Integer,Integer>hash=new HashMap<>();
        int[]res=new int[2];
        for(int i=0;i<x.length;i++)
        {
            int index=x[i];
            if(hash.containsKey(index))
            {
                res[0]=i+1;
                res[1]=hash.get(index)+1;
            }
            else
            {
                hash.put(sum-x[i],i);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[]a={1,2,4,3};
        int[]res=givetwosum(a,5);
        System.out.println(Arrays.toString(res));
    }
}
