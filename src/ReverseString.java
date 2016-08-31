import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

/**
 * Created by surabhi on 7/27/16.
 */
public class ReverseString {
    //first method using recursion does not work for prefix spaces
    public static String reverseWords(String str) {
        str.trim();

        char[] s=str.toCharArray();
        int i=0;
        int j=0;
        int flag=1;
        while(j<s.length){
            if(s[j]==' '){
                reverse(s, i, j-1);
                i=j+1;
                j++;

            }
            else
            {
                j++;
                flag=0;
            }
        }

        reverse(s, i, s.length-1);
        reverse(s, 0, s.length-1);
        return flag==1?"":new String(s);
    }

    public static void reverse(char[] s, int i, int j){
        while(i<j){
            char temp =s[i];
            s[i]=s[j];
            s[j]=temp;
            i++;
            j--;
        }
    }
    //second method using inbuilt methods
    public static String revWords(String s) {
        String[] words = s.trim().split(" +");
        Collections.reverse(Arrays.asList(words));
        return String.join(" ", words);
    }
    public static void main(String[] args)
    {
        String s="y ";
        char[]z=s.toCharArray();
        System.out.println(revWords(s));
    }
}
