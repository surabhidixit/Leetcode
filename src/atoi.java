/**
 * Created by surabhi on 7/22/16.
 */
public class atoi
{
    public static int atoi(String s)
    {
        int i=1;
        double res=0;
        if(s==null)
            return 0;
        else
        {

            while(i<s.length()&&s.charAt(i)>='0'&&s.charAt(i)<='9')
            {
               //res=res*10+(s.charAt(i)-'0');
                res=res*10+Character.getNumericValue(s.charAt(i));
               i++;
            }

        }
        if(res>Integer.MAX_VALUE)
            res=Integer.MAX_VALUE;
        if(res<Integer.MIN_VALUE)
            res=Integer.MIN_VALUE;
        if(s.charAt(0)=='-')
            res=-res;
        return (int)res;
    }
    public static void main(String[] args) {
        int x=atoi("-48");
        System.out.println(x);
    }
}
