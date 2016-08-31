import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by surabhi on 7/22/16.
 */
public class FourSum {
    static int[]res=new int[3];
    int j=0,k=0,l=0;
    static ArrayList<List<Integer>> list=new ArrayList<>();
    public ArrayList<List<Integer>> isThreeSum(int[]x)
    {

        ;
        Arrays.sort(x);
        if(x.length<4)
            return null;

        for(int i=0;i<x.length;i++)
        {
            if(i==0 || x[i] > x[i-1]){
                k=2;
                j=1;
                l=x.length-1;
                while(k<l)
                {
                    if(x[i]+x[j]+x[k]+x[l]==2)
                    {
                        List<Integer>ls=new ArrayList<>();
                        ls.add(x[i]);
                        ls.add(x[j]);
                        ls.add(x[k]);
                        ls.add(x[l]);
                        list.add(ls);

                        j++;
                        k++;
                        l--;


                        while(j<l && x[j]==x[j-1])
                            j++;
                        while(k<l && x[k]==x[k-1])
                            k++;
                        while(k<l&&x[l]==x[l+1])
                            l--;

                    }
                    else if(x[i]+x[j]+x[k]+x[l]<0){
                        j++;
                        k++;
                    }else{
                        l--;
                    }
                }
            }

        }
        return list;

    }
    public static void main(String[] args) {
        int[]k={-1,0,2,-1,3,4,-2,-3};
        FourSum fs=new FourSum();
        ArrayList<List<Integer>>list=fs.isThreeSum(k);
        System.out.println(Arrays.toString(list.toArray()));
    }
}
