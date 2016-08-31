import java.util.ArrayList;

/**
 * Created by surabhi on 8/13/16.
 */
public class MedianofSortedArrays
{
    public static int findMedianSortedArrays(int[]a,int[]b)
    {
/*        int i=0;
        int j=b.length-1;
        ArrayList<Integer>arr=new ArrayList<>();
        int[]x=new int[a.length+b.length];
        if(a.length==0)
            return b[b.length/2];
        if(b.length==0)
            return a[a.length/2];
        if(a.length==0&&b.length==0)
            return -1;
        if(a[a.length-1]<b[0]||a[a.length-1]==b[0]||b.length==0)
        {
           for(int u:a)
           {
               arr.add(u);
           }
            for(int k:b)
            {
                arr.add(k);
            }

        }
        else if(a[a.length-1]>b[0])
    {

        for(int k:b)
        {
            arr.add(k);
        }
        for(int u:a)
        {
            arr.add(u);
        }

    }

        for(int l=0;l<arr.size();l++)
        {
            x[l]=arr.get(l);
        }
        int t=0,y=x.length-1;
        while(t<=y)
        {
            if(x[t]<x[y])
            {
                t++;
                y--;
            }
            else
            {
                int temp=x[t];
                x[t]=x[y];
                x[y]=temp;
                t++;
                y--;
            }

        }
        return x.length%2==0?(x[x.length/2]+x[(x.length/2)-1])/2:x[x.length/2];*/
        int mid1=a.length%2==0?(a[a.length/2]+a[(a.length/2)-1])/2:a[a.length/2];
        int mid2=a.length%2==0?(b[b.length/2]+b[(b.length/2)-1])/2:a[b.length/2];
        //if(a[mid1]>b[mid2])
            return 0;

    }
    public static void main(String[] args) {
        int[]a={1,3,4};
        int[]b={2,4};
        System.out.println(findMedianSortedArrays(a,b));
    }
}
