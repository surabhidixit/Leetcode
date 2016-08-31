import sun.reflect.generics.tree.Tree;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by surabhi on 8/2/16.
 */
public class CountandSay {
    /*public static String count(int n)
    {
        String s=String.valueOf(n);
        char temp;
        StringBuilder sb=new StringBuilder();
        if(s.length()==1)
            return sb.append(s.charAt(0)).toString();
        if(s==null)
            return null;
        LinkedHashMap<Character,Integer> hs=new LinkedHashMap<>();
        for(int i=0;i<s.length();i++)
        {
            if(hs.isEmpty())
                hs.put(s.charAt(i),1);
            else
            {if(hs.containsKey(s.charAt(i)))
                hs.put(s.charAt(i),hs.get(s.charAt(i))+1);
            else
                hs.put(s.charAt(i),1);}
        }
        Iterator it = hs.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();
            System.out.print(pair.getValue());
            System.out.print(pair.getKey());
            *//*sb.append(pair.getValue());
            sb.append(pair.getKey());*//*
            it.remove(); // avoids a ConcurrentModificationException
        }
        return sb.toString();

    }
*/
    public static String countAndSay(int n) {
        String s="1";
        int j=1;
        int count=0;
        String temp="";

        String output="" ;
        if(n==1)
        return "1";
        s="1";
        if(n==2)
            return s;
        else
        {
            String res="";
            for(int i=0;i<n-2;i++)
            {
                int len=res.length()==0?s.length():res.length();
                j=1;
                for(int k=1;k<=len;k++)
                {
                    while(j<=k) {
                        if (s.length() > 1)
                        {if(s.charAt(j)==s.charAt(j-1)&&s.length()>1)
                    {
                        count+=2;
                        res=String.valueOf(count)+s.charAt(j);

                    }}
                    else {
                        count++;
                        res=String.valueOf(count)+s.charAt(j-1)+String.valueOf(count)+s.charAt(j);
                    }

                      j++;
                    }
                    if(s.length()>2)
                    {
                        output+=res;
                        s=s.substring(j,s.length());
                        len=s.length();
                        j=1;
                        k--;
                    }
                    else {
                        s=res;
                    }

                    count=0;

                }

            }

            return output+res;
        }

    }
    public static void main(String[] args) {
        System.out.println(countAndSay(5));
    }
}
