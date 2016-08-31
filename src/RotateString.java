import java.util.Arrays;

/**
 * Created by surabhi on 7/18/16.
 */
public class RotateString {
    public static String reverse(char[] s)
    {
        int j=0;
        for(int i=0;i<s.length;i++)
        {
            if(s[i]==' ')
            {
                rotate(s,j,i-1);
                j=i+1;
            }

        }
        rotate(s,j,s.length-1);
        rotate(s,0,s.length-1);
        return new String(s);
    }
    public static void rotate(char[]a,int start,int end)
    {
        char tmp;
        while(start<end)
        {
            tmp=a[start];
            a[start]=a[end];
            a[end]=tmp;
            start++;
            end--;
        }

    }
    public static void main(String[] args) {
        String s="the sky is blue";
        String x=reverse(s.toCharArray());
        System.out.println(x);
    }
}
