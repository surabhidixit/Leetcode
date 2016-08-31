import java.util.HashMap;

/**
 * Created by surabhi on 7/19/16.
 */
public class Isomorphic
{
    public static boolean isIsomorphic(String s1,String s2)
    {
        HashMap<Character,Character>hash=new HashMap<>();
        if(s1.length()!=s2.length()||s1==null||s2==null)
            return false;
        else
        {
            for(int i=0;i<s1.length();i++)
            {
                char c=s1.charAt(i);
                char d=s2.charAt(i);
                if(hash.containsKey(s1.charAt(i)))
                {
                    if(hash.get(c)!=d)
                        return false;
                }
                if(!hash.containsKey(s1.charAt(i)))
                {
                    hash.put(c,d);
                }
            }
            return true;
        }

    }
    public static void main(String[] args) {
        System.out.println(isIsomorphic("foo","bad"));
    }
}
