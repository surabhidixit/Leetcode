/**
 * Created by surabhi on 7/25/16.
 */
public class ContainsDuplicate2 {
    public static boolean isDuplicate(int[]in,int j)
    {
        int k;
        for(int i=0;i<in.length;i++)
        {
            k=in.length-1;
            while(k>0)
            {
                if(in[i]==in[k]&&Math.abs(k-i)<=j&&i!=k)
                {
                    return true;
                }
                else
                {
                    k--;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[]z={3,4,5,6,4};
        int k=1;
        System.out.println(isDuplicate(z,k));
    }
}
