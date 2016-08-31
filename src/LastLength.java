/**
 * Created by surabhi on 7/25/16.
 */
public class LastLength {
    public static int findlastlength(String s)
    {
        int i=s.length()-1;
        int count=0;
        while(i>0)
        {
            if(s.charAt(i)==' ')
                return count;
            else
            {
                if(s.charAt(i)>='a'&&s.charAt(i)<='z'||s.charAt(i)>='A'&&s.charAt(i)<='Z')
                {
                    count++;
                    i--;}
                else
                {
                    return count;
                }
            }
        }
        return 0;

    }
    public static void main(String[] args) {
        System.out.println(findlastlength("Hey how are thN^$gs"));
    }
}
