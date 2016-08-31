import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * Created by surabhi on 8/5/16.
 */
public class FlipGame {
    public static List<String> generateStates(String s)
    {
        char[]c=s.toCharArray();
        ArrayList<String>arr=new ArrayList<>();
        int i=0,j=c.length;
        if(s.length()==0)
            return null;
        else {
            while(i<s.length()-1)
            {
                if(c.length<2)
                    return arr;
                else if(c[i]=='+'&&c[i+1]=='+')
                {
                    c[i]='-';
                    c[i+1]='-';
                    arr.add(new String(c));
                    c[i]='+';
                    c[i+1]='+';
                    i++;
                }
                else
                    i++;
            }
        }
        return arr;
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(generateStates("++--++").toArray()));
    }
}
