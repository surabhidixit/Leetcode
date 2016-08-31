import java.util.HashMap;

/**
 * Created by surabhi on 7/26/16.
 */
public class LongestSubstring {
    public static int print(String s)
    {
        int[] elements=new int[256];
        int index=0,len=Integer.MIN_VALUE,j=0,count=0,previous=0;
        HashMap<Integer,Character>hs=new HashMap<>();

          /*char c=s.charAt(i);

            if(elements[s.charAt(i)]==-1)
            {
                elements[s.charAt(i)]=i;
                index=i;
                i++;
            }
            else
            {
                if(elements[s.charAt(i)]!=-1)
                {

                    elements[s.charAt(i)]=Math.max(elements[s.charAt(i)],i-elements[s.charAt(i)]);

                    i++;
                }
            }
        }
        for(int x=0;x<elements.length-1;x++)
        {
            if(elements[x]!=-1)
            {   count++;
            }

        }*/
            for(int i=1;i<s.length();i++)
            {
                if(!hs.containsValue(s.charAt(i)))
                {
                    hs.put(i,s.charAt(i));
                    len=Math.max(len,i-index)+1;
                }
                else
                {
                    if(hs.containsValue(s.charAt(i)))
                    {
                        hs.put(i,s.charAt(i));
                        len=Math.max(len,i-index)+1;
                    }
                    if(len<i-index)
                    {
                        previous=index;

                    }
                    index=i;
                    while(index<len)
                    {

                    }
                }
            }

        if(previous==index)
        System.out.println(s.substring(index,len));
        else
        {
        System.out.println(s.substring(previous,previous+len));}
        return len;


    }
    public static void main(String[] args) {
        System.out.println(print("abcdeefuikl"));
       // print("abcdaeba");

    }
}
