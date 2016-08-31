import java.util.Stack;

/**
 * Created by surabhi on 7/24/16.
 */
public class LongestValidParentheses {
    public static int longestmatch(String str)
    {
        int i=0,count=0,flag=0;
        Stack<Character> stk=new Stack<>();
        while(i<str.length())
        {
            if(stk.isEmpty()||str.charAt(i)=='(')
            {
                stk.push('(');
                i++;

            }
            else if(str.charAt(i)==')')
            {
                i++;
                if(!stk.isEmpty())
                {
                    stk.pop();
                    count+=2;
                    if(count%2==0)
                    flag++;
                }
            }
        }
        return flag;
    }
    public static void main(String[] args) {
        System.out.println(longestmatch("()(()()()))("));
    }
}
