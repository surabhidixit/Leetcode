/**
 * Created by surabhi on 8/3/16.
 */
public class ShortestPalindrome {
    public static String shortestPalindrome(String s) {
        if(s.length()==0)
            return "";
        else
        {
            if(isPalindrome(s))
            return s;
            else
            {
                return transform(s);
            }
        }

    }
    public static boolean isPalindrome(String str)
    {
        int i=0,j=str.length()-1;
        char[]c=str.toCharArray();
        int flag=1;
        while(i<=j)
        {
            if(c[i]==c[j])
            {
                i++;
                j--;
                flag=0;
            }
            else
            {
                return false;
            }

        }
        if(flag==0)
            return true;
        else
            return false;
    }
    public static String transform(String str)
    {
        int i=0,j=str.length()-1;
        int index=j;
        StringBuilder sb=new StringBuilder();
        char[]c=str.toCharArray();
        String add="";
        while(i<j)
        {
            if(c[i]==c[j])
            {
                if(i==j)
                {
                    sb.append(c[i]);
                    i=(j-1)==1?i+1:i;
                    break;

                }
                else
                {
                    sb.append(c[i]);
                    i++;
                    j--;
                }


            }
            else
            {
                sb.append(c[j]);
                j--;


            }

        }

                if(sb.length()==str.length())
                {
                    String res=sb.toString()+str.substring(i+1,index+1);
                    return res;
                }
                else if(str.length()-sb.length()==2)
                {
                        String res=sb.toString()+str.substring(i-1,index+1);
                        return res;
                }
        else
                {
                    String res=sb.toString()+str.substring(i,index+1);
                    return res;
                }




    }
    public static void main(String[] args) {
        System.out.println(shortestPalindrome("dcabbbacd"));
    }
}
