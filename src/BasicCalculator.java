/*
import java.util.ArrayList;
import java.util.Stack;

*/
/**
 * Created by surabhi on 8/3/16.
 *//*

public class BasicCalculator
{
    public static int calculate(String s) {
        char c = '\0';
        s = s.replaceAll("\\s", "");
        if (s.length() == 0)
            return -1;
        if (s.length() == 1)
            return Integer.valueOf(s);
        Stack<Character>stk = new Stack<>();
        ArrayList<String>arr=new ArrayList<>();
        String str="";
        StringBuilder sb = new StringBuilder();
        char[] c1 = s.toCharArray();
        for (int i = c1.length; i >0; i--) {
            stk.push(c1[i]);
        }
        while (!stk.isEmpty()) {
            if (stk.peek() == '(')
                stk.pop();
            else {
                c = stk.pop();
                char temp=stk.pop();
                char res;
                if (!stk.isEmpty()) {
                    if (stk.peek() == '-') {
                        stk.pop();
                        int x = Character.getNumericValue(temp);
                        int y = Character.getNumericValue(stk.pop());
                        int z = y - x;
                        String k = String.valueOf(z);
                        stk.push(Integer)
                        }
                    } else if (stk.peek() == '+') {
                        stk.pop();
                        int x = Character.getNumericValue(c);
                        int y = Character.getNumericValue(stk.pop());
                        int z = y + x;
                        String k = String.valueOf(z);
                        int i = 0;
                        if (stk.isEmpty()) {
                            while (i < k.length()) {
                                sb.append(k.charAt(i));
                                i++;
                            }
                        }
                        else {
                            while (i < k.length()) {
                                stk.push(k.charAt(i));
                                i++;
                            }
                        }
                    } else {
                        if (!stk.isEmpty()) {
                            if (stk.peek() == '(') {
                                stk.pop();
                                stk.push(c);
                            } else
                                sb.append(c);
                        }

                    }
                } else {
                    sb.append(c);
                }

            }

        }

        String res = sb.toString();
        if (res.charAt(0) == '-') {
            Integer x = Integer.parseInt(res);
            return x;
        } else {
            if (c == '(') {
                String st = sb.toString();
                if (st == "0")
                    return 0;
                else {
                    if(st.length()>5)
                    {
                        long x = Long.parseLong(st);
                        return Integer.MAX_VALUE;
                    }
                    else
                    {
                        Integer x = Integer.parseInt(res);
                        return x;
                    }

                }
            } else {
                String st = sb.toString();
                if(st.length()>5)
                {
                    long x = Long.parseLong(st);
                    return Integer.MAX_VALUE;
                }
                else
                {
                    Integer x = Integer.parseInt(res);
                    return x;
                }
            }
        }
    }
    public static void main(String[] args) {
        System.out.println(calculate("(214+4"));
    }
}
*/
