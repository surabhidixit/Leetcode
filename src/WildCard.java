/**
 * Created by surabhi on 7/19/16.
 */
public class WildCard
{
    public static boolean isMatch(String s1,String s2)
    {
        char[] test=s1.toCharArray();
        char[] pattern=s2.toCharArray();
        //the length of the string after removing multiple *s
        int writeIndex=0;
        boolean isFirst=true;
        //to remove the extra * from the string
        for(int i=0;i<pattern.length;i++)
        {
            if(pattern[i]=='*')
            {
                if (isFirst)
                {
                    pattern[writeIndex++] = pattern[i];
                    isFirst = false;

                }
            }
            else
            {
                    pattern[writeIndex++]=pattern[i];
                    isFirst=true;
            }

        }
        boolean T[][]=new boolean[test.length+1][writeIndex+1];
        if(writeIndex>0&&pattern[0]=='*')
        {
            T[0][1]=true;
        }
        T[0][0]=true;
        for(int i=1;i<T.length;i++)
        {
            for(int j=1;j<T[0].length;j++)
            {
                if(pattern[j-1]=='?'||test[i-1]==pattern[j-1])
                {
                    T[i][j]=T[i-1][j-1];
                }
                else if(pattern[j-1]=='*')
                {
                    T[i][j]=T[i-1][j]||T[i][j-1];
                }
            }
        }
        return T[test.length][writeIndex];
    }
    public static void main(String[] args) {
       // System.out.println(findWild("abb","a*b"));
        boolean arr=isMatch("aab","c*a*b");
        System.out.println(arr);
    }
}
