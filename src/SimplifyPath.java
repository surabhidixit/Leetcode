import java.util.Stack;

/**
 * Created by surabhi on 7/30/16.
 */
public class SimplifyPath
{
    /*public static StringBuilder simplifyPath(String s)
    {
        Stack<Character> stk=new Stack<>();
        int j=0;
        StringBuilder sb=new StringBuilder();
        int i=s.length()-1;
        sb.append("/");
        int size=0;
        while(i>=0)
        {
            if(s.charAt(i)=='.')
            {
                if(s.length()==1)
                break;
                else
                {
                    if(s.length()>3)
                    {String g=s.substring(i-2,i+1);
                    if(g.equals("..."))
                    {
                        stk.push(s.charAt(i));
                        stk.push(s.charAt(i-1));
                        stk.push(s.charAt(i-2));
                        i-=3;
                    }}
                    else
                    {
                        i--;
                    }
                }

            }
            else
            {if(stk.isEmpty())
            {
                stk.push(s.charAt(i));
                i--;
            }
            else
            {
                if(stk.peek()!='/')
                {
                    stk.push(s.charAt(i));
                    i--;
                }
                else
                {
                    i--;
                }
            }}

        }
        while(!stk.isEmpty())
        {
            sb.append(stk.pop());
            size++;
        }

            if(sb.charAt(1)=='/')
                sb.deleteCharAt(1);


        return sb;

    }*/
    public static String simplifyPath(String path) {
        String[] arr = path.split("/");
        StringBuilder sb = new StringBuilder();
        int p = arr.length - 1, count = 0;
        while (p >= 0) {
            if (arr[p].equals(".."))
                count++;
            else if (!arr[p].equals(".") && !arr[p].equals("")) {
                if (count > 0)
                    count--;
                else sb.insert(0, "/" + arr[p]);
            }
            p--;
        }
        return sb.length() == 0? "/": sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(simplifyPath("/.."));
    }
}
