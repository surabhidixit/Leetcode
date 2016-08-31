/**
 * Created by surabhi on 7/25/16.
 */
public class ValidPalindrome {
    public static boolean isValid(String s)
    {
        s=s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left=0,right=s.length()-1;
        while(left<right)
        {
            char x=s.charAt(left);
            char y=s.charAt(right);
            if(x==y)
            {
                left++;
                right--;
            }
            if(s.charAt(left)==' ')
            {
                left++;
            }
            if(s.charAt(right)==' ')
            {
                right--;
            }
            if(s.charAt(left)!=s.charAt(right))
            {
                return false;
            }
        }
        if(left==right||left>right)
        {
            return true;
        }
        else
        return false;

    }
    public static void main(String[] args) {
        System.out.println(isValid("A man a plan a canal: Panama"));
    }
}
