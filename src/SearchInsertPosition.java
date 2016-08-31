import java.util.HashMap;

/**
 * Created by surabhi on 7/24/16.
 */
public class SearchInsertPosition {
    public static int search(int[] array,int n)
    {
        int min=Integer.MAX_VALUE;int i=0;int index=0;
        HashMap<Integer,Integer>hash=new HashMap<>();
        /*while(i<array.length)
        {*/
            if(array[0]==n)
            {
                //min=0;
                return 0;
            }
            else
            {
                return target(array,n,0,array.length-1);
            }
        //using regular method
/*
            else if(i==array.length-1&&min!=0)
                return -1;
            else
            {
                min=Math.min(min,Math.abs(n-array[i]));

                i++;
            }*//*
            */

    }
    //using binary search
    public static int target(int[]n,int z,int start, int end)
    {
        int mid=(start+end)/2;
        if(mid==n.length-1&&n[mid]!=z)
        { return -1;}
        if(n[mid]==z)
        {return mid;}

         if(n[mid]<z)
        {
            return target(n,z,mid+1,end);
        }
            else
         { return target(n,z,0,mid-1);}

    }
    public static void main(String[] args) {
        int[]a={1,2,3,4,5};
        int x=6;
        System.out.println(search(a,x));
    }
}
