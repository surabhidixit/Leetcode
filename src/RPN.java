import java.util.Stack;

/**
 * Created by surabhi on 7/18/16.
 */
public class RPN
{
    public static String eval(String[]s)
    {
        String q="*+-/";
        Stack<String> s1=new Stack();
        for(String str:s)
        {
            if(!q.contains(str))
            {
                s1.push(str);
            }
            else
            {
                int a=Integer.valueOf(s1.pop());
                int b=Integer.valueOf(s1.pop());
                switch(str)
                {
                    case "+":
                        s1.push(String.valueOf(a+b));
                        break;
                    case "-":
                        s1.push(String.valueOf(Math.abs(a-b)));
                        break;
                    case "*":
                        s1.push(String.valueOf(a*b));
                        break;
                    case "/":
                        s1.push(String.valueOf(a/b));
                        break;
                }
            }
        }
        return s1.pop();
    }
    public static void main(String[] args) {
        String []tokens=new String[]{"1","22","*","3","+"};
        String s=eval(tokens);
        System.out.println(s);

    }
}
