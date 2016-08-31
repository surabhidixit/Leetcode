/*
import java.security.Key;
import java.util.*;

*/
/**
 * Created by surabhi on 8/8/16.
 *//*

public class PalindromePairs {
    public static List<List<Integer>> palindromePairs(String[] words) {
        List<Integer>list1=null;
        List<Integer>list2=null;
        int k=0;
        LinkedHashMap<Integer,String>hs=new LinkedHashMap<>();
        HashSet<String>hash=new HashSet<>();
        Arrays.sort(words);
        int i=0;int j=0;
        List<List<Integer>>out=new ArrayList<>();
        while(i<words.length)
        {
            j=words.length-1;
            while (j>0)
            {
                if(j==i)
                    j--;
                if(hs.containsValue(words[i]+words[j])) {
                    j--;
                }
                else
                {
                    if(isPalindrome(words[i]+words[j]))
                {

                        hs.put(k, (words[i] + words[j]));
                        list1=new ArrayList<>();
                        list1.add(i);
                        list1.add(j);
                        out.add(list1);
                        k++;
                        j--;
                    }

                    else {
                        j--;
                        i++;


                }}
                if(hs.containsValue(words[i]+words[j])) {
                    j--;
                }
                else
                {
                    if(isPalindrome(words[i]+words[j]))
                    {

                        hs.put(k, (words[i] + words[j]));
                        list1=new ArrayList<>();
                        list1.add(i);
                        list1.add(j);
                        out.add(list1);
                        k++;
                        j--;
                    }

                    else {
                        j--;
                        i++;


                    }
                else if(isPalindrome(words[j]+words[i]))
                    {
                        if(!hs.containsValue(words[j]+words[i]))
                        {
                            hs.put(k, (words[j] + words[i]));
                            list1=new ArrayList<>();
                            list1.add(j);
                            list1.add(i);
                            out.add(list1);
                            k++;
                            j--;
                        }

                        else {
                            list1=null;
                            list1.add(j);
                            list1.add(i);
                            j--;
                            i++;
                            out.add(list1);
                        }
                    }

                else
                {
                    j--;
                }
            }
            i++;
            }
        return out;
    }
    public static boolean isPalindrome(String s1)
    {
        int i=0;

        int j=s1.length()-1;
        char[]c=s1.toCharArray();
        int flag=1;
        while(i<=j)
        {
            if(c[i]==c[j])
            {
                i++;
                j--;
                flag=0;
            }
            else
            {
                return false;
            }

        }
        if(flag==0)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        String[]words={"abcd","dcba","lls","s","sssll"};
        System.out.println(Arrays.toString(palindromePairs(words).toArray()));
    }
}
*/
