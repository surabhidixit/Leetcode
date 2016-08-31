import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Created by surabhi on 7/22/16.
 */
public class ThreeSum {
    static int[]res=new int[3];
    int j=0,k=0;
    static ArrayList<List<Integer>>list=new ArrayList<>();
    public ArrayList<List<Integer>> isThreeSum(int[]x)
    {
        Arrays.sort(x);
        if(x.length<2)
            return list;

        for(int i=0;i<x.length;i++)
        {
            if(i==0 || x[i] > x[i-1]){
                k=x.length-1;
                j=i+1;
            while(j<k)
            {
            if(x[i]+x[j]+x[k]==0)
            {
                List<Integer>ls=new ArrayList<>();
                ls.add(x[i]);
                ls.add(x[j]);
                ls.add(x[k]);
                list.add(ls);

                j++;
                k--;

                while(j<k && x[j]==x[j-1])
                    j++;
                while(j<k && x[k]==x[k+1])
                    k--;

            }
            else if(x[i]+x[j]+x[k]<0){
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
        //int[]k={-1,0,2,-1,3,4,-2,-3};
        ThreeSum ts=new ThreeSum();
        int[]k=new int[3];
        ArrayList<List<Integer>>list=ts.isThreeSum(k);
        System.out.println(Arrays.toString(list.toArray()));
    }
}
