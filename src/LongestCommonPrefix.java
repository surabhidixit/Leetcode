/**
 * Created by surabhi on 7/29/16.
 */
public class LongestCommonPrefix
{
    public static String longest(String[]a)
    {
        int min=a.length+1;
        int j=0;
        for(String s:a)
        {
            if(min>s.length())
            {
                min=s.length();
            }

        }

            for (int i = 0; i < a.length; i++) {
                while(j<min) {
                String s1 = a[i];
                String s2 = a[i + 1];
                if(s1.charAt(j)!=s2.charAt(j))
                {
                    return s2.substring(0,j);
                }
                j++;
            }
        }
        return a[0].substring(0,min);
    }
    public static void main(String[] args) {
        String[]str={","};
        System.out.println(longest(str));
    }
}
