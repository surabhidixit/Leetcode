import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by surabhi on 7/22/16.
 */
public class ClosestSum {
    static int[]res=new int[3];
    int j=0,k=0;
    static ArrayList<Integer> list=null;
    public ArrayList<Integer> isThreeSum(int[]x)
    {
        Arrays.sort(x);
        int minsum=Integer.MAX_VALUE;
        if(x.length<3)
            return null;

        for(int i=0;i<x.length;i++)
        {

            if(i==0 || x[i] > x[i-1]){
                k=x.length-1;
                j=i+1;
                while(j<k)
                {
                    int diff=Math.abs(3-(x[i]+x[j]+x[k]));
                   // diff=Math.min(diff,minsum);
                    if(diff<=minsum)
                    {
                        minsum=diff;
                        list=new ArrayList<>();
                        list.add(x[i]);
                        list.add(x[j]);
                        list.add(x[k]);
                        j++;
                        k--;
                        /*while(j<k && x[j]==x[j-1])
                            j++;
                        while(j<k && x[k]==x[k+1])
                            k--;*/
                    }
                    else if(x[i]+x[j]+x[k]<3){
                        j++;
                    }else{
                        k--;
                    }
                }
            }
        }
        return list;

    }

    public static void main(String[] args) {
        int[]k={-1, 2, 1, -4,3};
        ClosestSum cs=new ClosestSum();
        ArrayList<Integer>list=cs.isThreeSum(k);
        System.out.println(Arrays.toString(list.toArray()));
    }
}
