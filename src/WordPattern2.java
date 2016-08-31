import java.util.LinkedHashMap;

/**
 * Created by surabhi on 8/7/16.
 */
public class WordPattern2
{
    public static boolean wordPattern(String pattern, String str) {
        LinkedHashMap<Character,String> hs=new LinkedHashMap<>();
        String s[]=str.split(" ");
        char[]pat=pattern.toCharArray();
        int j=0;
        int i=0;
        boolean flag=false;
       /* if(pat.length!=s.length)
            return false;*/

        while(i<s.length&&j<pat.length)
        {
            char c=pat[j];
            String check=s[i];
            if (!hs.containsKey(c)&&!hs.containsValue(s[i]))
            {
                hs.put(pat[j], s[i]);
                j++;
                i++;
                flag=true;
            }
            else if (hs.containsKey(c))
            {
                if(!hs.get(c).equals(check))
                    return false;
                else
                    i++;
                j++;


            }
            else if(c!=hs.keySet().iterator().next())
            {
                return false;
            }
            else
            {
                i++;
                j++;
            }



        }
        return flag;

    }

    public static void main(String[] args) {

    }

}
