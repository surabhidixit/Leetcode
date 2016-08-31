import java.awt.geom.Area;
import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by surabhi on 8/5/16.
 */
public class ValidAnagram {
    public static boolean isAnagram(String s,String t)
    {
        char[]c=s.toCharArray();
        Arrays.sort(c);
        char[]d=t.toCharArray();
        Arrays.sort(d);
        return new String(c).equals(new String(d));
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("teache","cheater"));
    }
}
