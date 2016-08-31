/**
 * Created by surabhi on 8/9/16.
 */
public class OneEditDistance {
    public static boolean isOneEditDistance(String s,String t)
    {
        int i=0,j=0;
        int count=0;
        char[]c=s.toCharArray();
        char[]d=t.toCharArray();
        while(i<s.length()&&j<t.length())
        {
            if(c[i]==d[j])
            {
                i++;
                j++;
            }
            else
            {
                count++;
                if(Math.abs(t.length()-s.length())>1)
                    return false;
                else
                {
                    if(s.length()>t.length())
                        i++;
                    else if(t.length()>s.length())
                        j++;
                    else
                    {  i++;j++;}
                }

            }
        }
        if(count==1)
            return true;
        return false;

    }

    public static void main(String[] args) {
        System.out.println(isOneEditDistance("","m"));
    }
}
