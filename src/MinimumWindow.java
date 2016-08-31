import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by surabhi on 7/26/16.
 */
public class MinimumWindow {
    public static void window(String word,String words)
        {
            StringBuilder res=new StringBuilder();
            int start=0;
            int len=Integer.MAX_VALUE;
            HashMap<Integer,Integer>hs=new HashMap<>();
           // boolean[]flag=new boolean[256];
            int j=0,i=0;

                j=0;
                while(j<words.length()&&i<word.length())
                {
                    int temp=i;
                    if(word.charAt(i)==words.charAt(j)&&j<words.length())
                    {
                      j++;
                    }
                    if(j==words.length())
                    {
                        hs.put(start,Math.min(len,i-start));
                        start++;
                    }
                    if(word.charAt(i)!=words.charAt(j)&&j<words.length()&&i==word.length()-1)
                    {
                        System.out.println("no match");
                        len=0;
                    }
                    i++;
                }
            int key=0;int index=0;
            for ( Map.Entry<Integer,Integer> entry : hs.entrySet()) {
                 key = entry.getKey();
               // System.out.println(key);
                int tab = entry.getValue();
                len=Math.min(len,tab)+1;
                if(len<tab)
                    index=key;
            }
            System.out.println(word.substring(index,len));


        }
        public static void main(String[] args) {
            String word="abyocdacb";
            String words="ax";
            window(word,words);
        }
    }

