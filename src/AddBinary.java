import java.awt.*;
import java.util.Arrays;

/**
 * Created by surabhi on 7/25/16.
 */
import Arrays.LastRemaining;
public class AddBinary {

    public static String add(String s1,String s2)
    {

        /*String c=Integer.toBinaryString(x);
        String d=Integer.toBinaryString(y);
        int len1=c.length();
        int len2=d.length();
        int p1=len1-1;
        int p2=len2-1;
        int rem=0;
        StringBuilder str=new StringBuilder();
        while(p1<len1||p2<len2)
        {
            if(c.charAt(p1)==1&&d.charAt(p2)==1&&rem==0)
            {
                rem=1;
                str.append(0);
                p1--;
                p2--;
            }
            if(c.charAt(p1)==1&&d.charAt(p2)==1&&rem==1)
            {
                rem=0;
                str.append(1);
                str.append(1);
                p1--;
                p2--;
            }
            if((c.charAt(p1)==1&&d.charAt(p2)==0&&rem==0)||(c.charAt(p1)==0&&d.charAt(p2)==1&&rem==0))
            {
                rem=0;
                str.append(1);
                p1--;
                p2--;
            }

        }*/

        if (s1 == null || s2 == null) return "";
        int first = s1.length() - 1;
        int second = s2.length() - 1;
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        while (first >= 0 || second >= 0) {
            int sum = carry;
            if (first >= 0) {
                sum += s1.charAt(first) - '0';
                first--;
            }
            if (second >= 0) {
                sum += s2.charAt(second) - '0';
                second--;
            }
            carry = sum >> 1;
            sum = sum & 1;
            sb.append(sum == 0 ? '0' : '1');
        }
        if (carry > 0)
            sb.append('1');

        sb.reverse();
        return String.valueOf(sb);
    }


    public static void main(String[] args) {
        System.out.println(add("11","10"));
    }
}
