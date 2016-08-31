import java.util.HashMap;
import java.util.Stack;

/**
 * Created by surabhi on 7/22/16.
 */
public class ValidParentheses {
    public static boolean isValid(String s)
    {
        HashMap<Character,Character>hm=new HashMap<>();
        hm.put('(',')');
        hm.put('{','}');
        hm.put('[',']');
        Stack<Character>stk=new Stack<>();
        for(int i=0;i<s.length();i++) {
            char c = s.charAt(i);
            if (hm.keySet().contains(c))
            {
                stk.push(c);
            }
            else if(hm.values().contains(c))
            {
                if(!stk.isEmpty()&&hm.get(stk.peek())==c)
                {
                    stk.pop();

                }
                else
                { return false;}
            }
        }
        return stk.empty();
    }
    public static void main(String[] args) {
        boolean b=isValid("{{");
        System.out.println(b);
    }
}
