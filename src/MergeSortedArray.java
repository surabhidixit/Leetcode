import java.util.Arrays;

/**
 * Created by surabhi on 7/22/16.
 */
public class MergeSortedArray {
    public static int[] merge(int[]x,int[]y)
    {
        int i=2;
        int j=2;
        int k=5;

        while(k>=0)
        {

            if(j<0||i>=0&&x[i]>y[j])
            {
                x[k--]=x[i--];
            }
            else {
                x[k--]=y[j--];

            }

        }
        return x;
    }
    public static void main(String[] args) {
        int[]a=new int[6];
        a[0]=2;
        a[1]=3;
        a[2]=69;
        int[]b={9,10,11};
        int[]c=merge(a,b);
        System.out.println(Arrays.toString(c));
    }
}
