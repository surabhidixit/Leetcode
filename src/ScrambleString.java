import java.util.Arrays;

/**
 * Created by surabhi on 8/9/16.
 */
public class ScrambleString {
    public static boolean isScramble(String s1, String s2) {
        if(s1.length()==0||s2.length()==0)
            return false;
        char[]c=s1.toCharArray();
        char[]d=s2.toCharArray();
        Arrays.sort(c);
        Arrays.sort(d);
        String f1=new String(c);
        String f2=new String(d);
        return f1.equals(f2);
    }

    public static void main(String[] args) {
        System.out.println(isScramble("ab","ba"));
    }
}
