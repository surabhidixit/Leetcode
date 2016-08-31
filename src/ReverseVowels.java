import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by surabhi on 8/5/16.
 */
public class ReverseVowels {
    public static String reverseVowels(String s) {
        int i=0,j=s.length()-1;
        HashSet<Character> hs=new HashSet<>();
        hs.add('a');
        hs.add('e');
        hs.add('i');
        hs.add('o');
        hs.add('u');
        hs.add('A');
        hs.add('E');
        hs.add('I');
        hs.add('O');
        hs.add('U');
        char[]in=s.toCharArray();
        while(i<j)
        {
            if(hs.contains(in[i]))
            {
                if(hs.contains(in[j]))
                {
                    char temp=in[i];
                    in[i]=in[j];
                    in[j]=temp;
                    i++;
                    j--;
                }
                else
                {
                    j--;
                }

            }
            else if(hs.contains(in[j]))
            {
                if(hs.contains(in[i]))
                {
                    char temp=in[i];
                    in[i]=in[j];
                    in[j]=temp;
                    i++;
                    j--;
                }
                else
                {
                    i++;
                }

            }
            else
            {
                i++;
                j--;
            }

        }
        return new String(in);
    }

    public static void main(String[] args) {
        System.out.println(reverseVowels("avocado"));
    }
}
