/**
 * Created by surabhi on 7/24/16.
 */
public class NeedleHaystack {
    public static int findneedle(String x,String y)
    {
        int l=x.length();
        int m=y.length();
        int i=0;int flag=0;
        if(m>l||m==0||l==0)
        {
            return -1;
        }
        else
        {
            while(i+m<l)
            {
                if(x.substring(i,i+m).contains(y))
                {
                    return i;
                }
                else
                    i++;
            }
        }

        return flag;
    }
    public static void main(String[] args) {
        System.out.println(findneedle("[]^&@{l&","0"));
    }
}
