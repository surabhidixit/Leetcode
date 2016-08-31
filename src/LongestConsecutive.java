import java.util.HashSet;
import java.util.TreeMap;

/**
 * Created by surabhi on 7/24/16.
 */
public class LongestConsecutive
{
    public static int findsequence(int[] x)
    {
        int left=0,right=0,i=0,count=0,max=1;
        int[]res=new int[x.length];
        HashSet<Integer> hs=new HashSet<>();
        while(i<x.length)
        {
            hs.add(x[i]);
            i++;

        }
        for(int k:x)
        {
            left=k-1;
            right=k+1;
            count=1;
            while(hs.contains(left))
            {
                count++;
                hs.remove(left);
                left--;

            }
            while (hs.contains(right))
            {
                count++;
                hs.contains(right);
                right++;
            }
            max=Math.max(max,count);
        }
        return max;
    }
    public static void main(String[] args) {
        int[]a={98,99,100, 4, 200, 1, 3, 2,};
        System.out.println(findsequence(a));
    }
}
