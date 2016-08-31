import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by surabhi on 7/24/16.
 */
public class MinSubArray
{
    public static ArrayList<Integer> findminarray(int[]a,int k)
    {
        ArrayList<Integer>res=new ArrayList<>();
        Arrays.sort(a);
        int left=a[0];int sum=0;
        int right=a[a.length-1];
        if(left==k) {
            res.add(left);
            return res;
        }
       else if(right==k) {
            res.add(right);
            return res;
        }
        else
        {
            for(int i=0;i<a.length;i++)
            {
                if(left==right&&res==null)
                {
                    res.add(left);
                    return res;
                }
                else
                {
                    sum=sum+left+right;
                    res.add(left);
                    res.add(right);

                    if(sum<k)
                        left++;
                    else
                    {
                        sum=sum-right;
                        right--;
                    }
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[]x={1,2,3,4,0};
        int s=7;
        System.out.println(Arrays.toString(findminarray(x,s).toArray()));
    }
}
